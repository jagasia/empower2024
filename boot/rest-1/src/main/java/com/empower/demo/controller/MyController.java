package com.empower.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empower.demo.model.Employee;

@RestController
public class MyController {

	@GetMapping
	public Employee home()
	{
		Employee employee=new Employee(121, "Gautham", "CSE");
		return employee;
	}
	
	
}
