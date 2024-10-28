package com.example.yogainstructorapp.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {
    @Insert
    suspend fun insert(user: User)

    @Query("SELECT * FROM user_table WHERE username = :username AND password = :password LIMIT 1")
    suspend fun getUser(username: String, password: String): User?
}
