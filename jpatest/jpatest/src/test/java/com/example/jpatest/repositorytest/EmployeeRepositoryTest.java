package com.example.jpatest.repositorytest;

import com.example.jpatest.entity.Employee;
import com.example.jpatest.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

import static org.junit.jupiter.api.Assertions.assertEquals;



@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class EmployeeRepositoryTest {

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    void getEmpNameTest(){
        Employee employee=new Employee();
        employee.setId(1001);
        employee.setEmpName("Joshua");
        employee.setSalary((10000));
        employeeRepository.save(employee);

        String empName=employeeRepository.getempname(1001);
        assertEquals(empName,"Joshua");


    }
}
