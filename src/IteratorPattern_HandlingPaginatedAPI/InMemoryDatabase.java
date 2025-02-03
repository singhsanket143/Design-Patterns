package IteratorPattern_HandlingPaginatedAPI;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDatabase {

    private List<String> users = new ArrayList<>();

    public void seeder() {
        for(int i = 1; i <= 2000; i++) {
            users.add("User " + i);
        }
    }

    public List<String> getUsers() {
        return users;
    }

}
