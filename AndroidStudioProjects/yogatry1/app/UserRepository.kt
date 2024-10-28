package com.example.yogainstructorapp.repository

import com.example.yogainstructorapp.data.User
import com.example.yogainstructorapp.data.UserDao

class UserRepository(private val userDao: UserDao) {
    suspend fun registerUser(username: String, password: String) {
        val user = User(username = username, password = password)
        userDao.insert(user)
    }

    suspend fun loginUser(username: String, password: String): Boolean {
        return userDao.getUser(username, password) != null
    }
}
