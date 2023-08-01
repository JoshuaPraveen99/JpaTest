package com.example.jpatest.repository;

import com.example.jpatest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    @Query("SELECT e.empName from Employee e WHERE e.id=:ID")
    String getempname (@Param("ID") int id);

}
