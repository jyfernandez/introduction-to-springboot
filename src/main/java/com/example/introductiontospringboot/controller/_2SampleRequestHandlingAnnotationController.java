package com.example.introductiontospringboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class _2SampleRequestHandlingAnnotationController {

    @GetMapping(value = "/sample/path-variable/hi/{id}")
    public ResponseEntity<String> hi(@PathVariable("id") String name) {
        return  new ResponseEntity<String>(String.format("Hi %s!", name), HttpStatus.OK);
    }

    @GetMapping(value = "/sample/path-variable/hello/{name}")
    public ResponseEntity<String> hello(@PathVariable String name) {
        return  new ResponseEntity<String>(String.format("Hello %s!", name), HttpStatus.OK);
    }

    @GetMapping(value = "/sample/request-param/sample1")
    public ResponseEntity<String> requestParam1(@RequestParam("requestParam") String requestParam1) {
        return  new ResponseEntity<String>(String.format("Request Param = '%s'", requestParam1), HttpStatus.OK);
    }

    @GetMapping(value = "/sample/request-param/sample2")
    public ResponseEntity<String> requestParam2(@RequestParam String requestParam2) {
        return  new ResponseEntity<String>(String.format("Request Param = '%s'", requestParam2), HttpStatus.OK);
    }

    @GetMapping(value = "/sample/request-param/sample3")
    public ResponseEntity<String> requestParam3(@RequestParam(value = "name", required = false) String requestParam3) {
        return  new ResponseEntity<String>(String.format("Name = '%s'", requestParam3), HttpStatus.OK);
    }

    @GetMapping(value = "/sample/request-param/sample4")
    public ResponseEntity<String> requestParam4(@RequestParam(value = "name", defaultValue = "Jane Doe") String requestParam4) {
        return  new ResponseEntity<String>(String.format("Default Value = '%s'", requestParam4), HttpStatus.OK);
    }

}