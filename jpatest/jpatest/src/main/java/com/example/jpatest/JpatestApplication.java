package com.example.jpatest;

import com.example.jpatest.service.EmployeeService;
import com.example.jpatest.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class JpatestApplication {


	public static void main(String[] args) {
		SpringApplication.run(JpatestApplication.class, args);
	}


}
