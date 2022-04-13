package com.learning.kafka.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDataController {

    @GetMapping("/gettestdata")
    public String testData(){
        return "this is test data";
    }

}
