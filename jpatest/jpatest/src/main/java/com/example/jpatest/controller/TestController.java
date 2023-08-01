package com.example.jpatest.controller;

import com.example.jpatest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/api/v1/getempname")
    public String getempname(@RequestParam("id") int id){
        String empname= employeeService.getempname(1001);
        return empname;
    }
}
