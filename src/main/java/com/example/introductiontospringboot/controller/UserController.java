package com.example.introductiontospringboot.controller;

import com.example.introductiontospringboot.model.User;
import com.example.introductiontospringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public User getUser(){
        return service.getUser();
    }
}
