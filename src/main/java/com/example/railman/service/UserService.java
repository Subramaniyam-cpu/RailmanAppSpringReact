package com.example.railman.service;

import com.example.railman.repository.UserDTO;

public interface UserService {
    UserDTO registerUser(UserDTO userDto);
}
