package IteratorPattern_HandlingPaginatedAPI.repositories;

import IteratorPattern_HandlingPaginatedAPI.InMemoryDatabase;

import java.util.List;

public class UserRepositoryImpl implements UserRepository{

    private final InMemoryDatabase db;

    public UserRepositoryImpl() {
        this.db = new InMemoryDatabase();
    }

    @Override
    public List<String> findUsers(int limit, int offset) {
        List<String> allUsers = db.getUsers();
        int start = (offset-1)*limit; // start of the paginated data
        int end = Math.min(start + limit, allUsers.size()); // end of the paginated data

        if(start >= allUsers.size()) {
            return List.of();
        }

        return allUsers.subList(start, end);
    }
}

/**
 *  When limit and offset based pagination is not good
 *
 *  f10, f9, f8, f7, f6, f5, f4, f3, f2, f1
 *  limit=3, offset=0 -> f10, f9, f8 (first 3 posts)
 *
 *  f12, f11, f10, f9, f8, f7, f6, f5, f4, f3, f2, f1
 *  limit=3, offset=3 -> Expected output(f7, f6, f5) but actual output(f9, f8, f7)
 *
 *  Solution - Cursor based pagination
 *  SELECT * from posts where createdAt < t8 order by createdAt desc limit 3
 */
