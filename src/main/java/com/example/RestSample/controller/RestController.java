package com.example.RestSample.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by A-8677 on 12/7/2018.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping(value = "/welcome")
    public String getMessage(){
        return "Hello Welcome";
    }


}
