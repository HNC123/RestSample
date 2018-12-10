package com.example.RestSample.controller;

import com.example.RestSample.com.example.RestSample.model.Employee;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/RestApp")
public class RestController {

    @RequestMapping(value = "/welcome",method = RequestMethod.GET)
    public String getMessage(){
        return "Welcome to Jenkins Build";
    }
    @RequestMapping(value="/getEmp/{sid}",method = RequestMethod.GET)
    public Employee getEmployee(@PathVariable(value = "sid") String sid){
            System.out.print(sid);
        Employee emp=new Employee();
        emp.setEmail("avc@gmail.com");
        emp.setName("and");
        emp.setSid(100);
        return  emp;
    }
}
