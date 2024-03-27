package com.example.simple_crud.common.mapper;

import org.springframework.stereotype.Component;

import com.example.simple_crud.dtos.UserCreationDTO;
import com.example.simple_crud.dtos.UserDTO;
import com.example.simple_crud.entities.User;

@Component
public class UserMapper {
    public UserDTO toDto(User user) {
        UserDTO dto = new UserDTO();
        dto.id = user.id;
        dto.firstName = user.firstName;
        dto.lastName = user.lastName;
        dto.email = user.email;
        dto.password = user.password;
        dto.userName = user.userName;
        return dto;
    }

    public User toUser(UserCreationDTO dto) {
        User user = new User();
        user.firstName = dto.firstName;
        user.lastName = dto.lastName;
        user.email = dto.email;
        user.password = dto.password;
        user.userName = dto.userName;
        return user;
    }
}
