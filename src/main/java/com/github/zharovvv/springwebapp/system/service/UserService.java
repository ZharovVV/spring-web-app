package com.github.zharovvv.springwebapp.system.service;

import com.github.zharovvv.springwebapp.system.dao.UserDAO;
import com.github.zharovvv.springwebapp.system.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

}
