package IteratorPattern_HandlingPaginatedAPI.iterators;

import IteratorPattern_HandlingPaginatedAPI.repositories.UserRepository;
import IteratorPattern_HandlingPaginatedAPI.repositories.UserRepositoryImpl;

import java.util.List;

public class UserIterator implements Iterator<List<String>>{

    private final UserRepository userRepository;
    private int limit = 1;
    private int offset = 0;
    private List<String> current;
    public UserIterator(int limit) {
        this.userRepository = new UserRepositoryImpl();
        this.limit = limit;
        this.current = userRepository.findUsers(limit, offset);
    }

    @Override
    public boolean hasNext() {
        return !current.isEmpty();
    }

    @Override
    public List<String> next() {
        List<String> result = current;
        this.offset += limit;
        this.current = this.userRepository.findUsers(limit, offset);
        return result;
    }
}
