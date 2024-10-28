package com.example.yogainstructorapp.repository;

import com.example.yogainstructorapp.data.UserDao;

public class UserRepository {
    private final UserDao userDao;

    public UserRepository(UserDao userDao) {
        this.userDao = userDao;
    }

    // Add your data manipulation methods here
}
