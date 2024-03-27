package com.example.simple_crud.entities;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    public String id;

    public String firstName;
    public String lastName;

    public String email;

    public String userName;

    public String password;

    public User() {
    }

}
