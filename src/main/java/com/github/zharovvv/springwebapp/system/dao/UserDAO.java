package com.github.zharovvv.springwebapp.system.dao;

import com.github.zharovvv.springwebapp.system.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserDAO {
    // TODO: 07.01.2020 Переделать на JDBC
    private List<User> users = Arrays.asList(new User("admin", "admin"),
            new User("user1", "user1"));

    public List<User> getAllUsers() {
        return users;
    }
}
