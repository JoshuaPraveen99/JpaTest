package com.example.jpatest.dto;


import org.springframework.stereotype.Component;

@Component
public class EmployeeDTO {

    private int id;
    private String empname;
    private int salary;

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id=" + id +
                ", empname='" + empname + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
