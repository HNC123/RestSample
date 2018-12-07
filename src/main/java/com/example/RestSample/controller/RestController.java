package com.example.RestSample.controller;

import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping(value = "/welcome")
    public String getMessage(){
        return "Hello Welcome";
    }


}
