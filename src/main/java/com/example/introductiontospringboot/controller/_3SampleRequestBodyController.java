package com.example.introductiontospringboot.controller;

import com.example.introductiontospringboot.dto.UserDTO;
import com.example.introductiontospringboot.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class _3SampleRequestBodyController {

    @PostMapping("/sample/request-body")
    public ResponseEntity<User> postUser (@RequestBody UserDTO user){
        User newUser = User.builder().first_name(user.first_name).last_name(user.last_name).build();
        return  new ResponseEntity<User>(newUser, HttpStatus.OK);
    }

}
