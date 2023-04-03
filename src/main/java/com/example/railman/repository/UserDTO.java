package com.example.railman.repository;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import org.springframework.stereotype.Component;

@AllArgsConstructor
@Getter
@Setter
@Component
public class UserDTO {

    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String password;

}
