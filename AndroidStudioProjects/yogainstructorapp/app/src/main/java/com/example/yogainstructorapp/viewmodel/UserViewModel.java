package com.example.yogainstructorapp.viewmodel;

import androidx.lifecycle.ViewModel;

public class UserViewModel extends ViewModel {
    private final UserRepository repository;

    public UserViewModel(UserRepository repository) {
        this.repository = repository;
    }

    // Add your LiveData and methods for data handling
}
