package com.example.jpatest.service;

import org.springframework.stereotype.Service;

@Service
public  interface EmployeeService {

    String getempname(int id);
}
