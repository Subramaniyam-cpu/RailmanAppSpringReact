package com.example.railman.userutilities;

import com.example.railman.entity.User;
import com.example.railman.objectfactory.EntityFactory;
import com.example.railman.repository.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



public class UserMapperImpl implements DtoDaoMapper<User, UserDTO> {

    private final EntityFactory <User> userEntityFactory;

    public UserMapperImpl(EntityFactory<User> userEntityFactory) {
        this.userEntityFactory = userEntityFactory;
    }

    @Override
    public User toEntity(UserDTO userDTO) {
        User user = userEntityFactory.createEntityObject(User.class);
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setPhoneNumber(userDTO.getPhoneNumber());
        user.setAddress(userDTO.getAddress());

        return null;
    }
}