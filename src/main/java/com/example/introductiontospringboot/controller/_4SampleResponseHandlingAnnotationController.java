package com.example.introductiontospringboot.controller;

import com.example.introductiontospringboot.exception.RecordNotFoundException;
import com.example.introductiontospringboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class _4SampleResponseHandlingAnnotationController {

    @GetMapping("/sample/response-body")
    public User getUser (){
        User user = User.builder()
                        .first_name("Juan")
                        .last_name("Dela Cruz")
                        .build();
        return user;
    }

    @GetMapping("/sample/exception")
    public User throwException() throws Exception{
        throw new Exception("exception");
    }

    @GetMapping("/sample/not-found-exception")
    public User throwRecordNotFound() throws RecordNotFoundException {
        throw new RecordNotFoundException("record not found");
    }

}
