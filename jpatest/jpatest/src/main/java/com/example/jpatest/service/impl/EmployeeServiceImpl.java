package com.example.jpatest.service.impl;

import com.example.jpatest.repository.EmployeeRepository;
import com.example.jpatest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  class EmployeeServiceImpl implements EmployeeService {

     @Autowired
     EmployeeRepository employeeRepository;
    @Override
    public String getempname(int id) {
        String empName= employeeRepository.getempname(id);
        return empName;
    }
}
