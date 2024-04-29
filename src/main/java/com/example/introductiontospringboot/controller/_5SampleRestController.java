package com.example.introductiontospringboot.controller;

import com.example.introductiontospringboot.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class _5SampleRestController {

    @GetMapping("/sample/rest-controller")
    public User getUser (){
        User user = User.builder()
                .first_name("Jy")
                .last_name("Fernandez")
                .build();
        return user;
    }
}
