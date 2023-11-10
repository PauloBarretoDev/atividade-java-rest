package com.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.models.Employee;

@RestController
@CrossOrigin
public class MySimpleController {
    
    @GetMapping(value="/employee1",
                produces={"/application/json","application/xml"})
    public Employee getEmp1() {
        return new Employee("1","John Smith",10000);
    }
}
