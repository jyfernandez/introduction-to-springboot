package com.example.introductiontospringboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class _2SampleRequestHandlingAnnotationController {

    @GetMapping(value = "/sample/path-variable/hi/{id}")
    public ResponseEntity<String> hi(@PathVariable("id") String name) {
        return  new ResponseEntity<String>(String.format("Hi %s!", name), HttpStatus.OK);
    }

}
