package com.example.royaltea.service;

import com.example.royaltea.data.User;
import com.example.royaltea.data.UserRepository;

import java.util.List;

public class UserService {
    private UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public void validate(String username, String password){

       /* userRepository.findby
        if (foundUser != null) {
            System.out.println("User found: " + foundUser.getUsername());
        } else {
            System.out.println("User not found.");
        }*/
    }
}
