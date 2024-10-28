package com.example.yogainstructorapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider
import com.example.yogainstructorapp.data.DatabaseProvider
import com.example.yogainstructorapp.repository.UserRepository
import com.example.yogainstructorapp.viewmodel.UserViewModel
import com.example.yogainstructorapp.viewmodel.UserViewModelFactory
import com.example.yogainstructorapp.ui.LoginScreen

class MainActivity : ComponentActivity() {

    private lateinit var userViewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize the database and repository
        val userDao = DatabaseProvider.getDatabase(applicationContext).userDao()
        val repository = UserRepository(userDao)

        // Create ViewModel instance
        userViewModel = ViewModelProvider(this, UserViewModelFactory(repository))[UserViewModel::class.java]

        // Set the content to LoginScreen
        setContent {
            LoginScreen(userViewModel)
        }
    }
}
