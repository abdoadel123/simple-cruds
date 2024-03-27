package com.example.simple_crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.simple_crud.common.mapper.UserMapper;
import com.example.simple_crud.dtos.UserCreationDTO;
import com.example.simple_crud.dtos.UserDTO;
import com.example.simple_crud.entities.User;
import com.example.simple_crud.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserMapper mapper;

    @Autowired
    private UserRepository userRepository;

    public User create(UserCreationDTO user) {
        return userRepository.insert(this.mapper.toUser(user));
    }

    public List<UserDTO> find() {
        return userRepository.findAll().stream().map(mapper::toDto).toList();
    }

}
