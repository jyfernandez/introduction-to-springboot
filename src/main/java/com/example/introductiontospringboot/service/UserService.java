package com.example.introductiontospringboot.service;

import com.example.introductiontospringboot.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User getUser(){
        User user = new User();
        user.setFirst_name("Jy");
        user.setLast_name("Fernandez");

        return user;
    }
}
