package com.example.introductiontospringboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/sample/request-mapping")
public class _1SampleRequestMappingController {

    public ResponseEntity<String> helloWorld () {
        return new ResponseEntity<String>("Hello World", HttpStatus.OK);
    }

    @RequestMapping(value = "/good-evening", method = RequestMethod.GET)
    public ResponseEntity<String> goodEvening () {
        return  new ResponseEntity<String>("Good Evening", HttpStatus.OK);
    }

    @PostMapping(value = "/good-bye")
    public ResponseEntity<String> goodBye(){
        return new ResponseEntity<String>("Good Bye!", HttpStatus.OK);
    }

}
