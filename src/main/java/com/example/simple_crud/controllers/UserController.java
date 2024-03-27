package com.example.simple_crud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.simple_crud.dtos.UserCreationDTO;
import com.example.simple_crud.dtos.UserDTO;
import com.example.simple_crud.entities.User;
import com.example.simple_crud.services.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    private User create(@RequestBody UserCreationDTO user) {
        return userService.create(user);
    }

    @GetMapping("/users")
    private List<UserDTO> findAll() {
        return userService.find();
    }
}
