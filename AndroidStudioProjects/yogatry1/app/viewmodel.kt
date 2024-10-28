package com.example.yogainstructorapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.yogainstructorapp.repository.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserViewModel(private val userRepository: UserRepository) : ViewModel() {

    fun registerUser(username: String, password: String) {
        viewModelScope.launch(Dispatchers.IO) {
            userRepository.registerUser(username, password)
        }
    }

    fun loginUser(username: String, password: String, callback: (Boolean) -> Unit) {
        viewModelScope.launch(Dispatchers.IO) {
            val isAuthenticated = userRepository.loginUser(username, password)
            callback(isAuthenticated)
        }
    }
}
