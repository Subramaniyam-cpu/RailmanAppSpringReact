package com.example.railman.repository;

import com.example.railman.entity.User;
import com.example.railman.userutilities.DtoDaoMapper;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class UserDaoImpl implements UserDao {

    DtoDaoMapper<User, UserDTO> entityMapping;
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public UserDTO save(UserDTO  userDTO) {
         User user = entityMapping.toEntity(userDTO);
         entityManager.persist(user);
        return userDTO;
    }
}
