package com.example.railman.repository;


import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    public UserDTO save(UserDTO user);
}
