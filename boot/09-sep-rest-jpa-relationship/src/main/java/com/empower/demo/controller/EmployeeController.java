package com.empower.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empower.demo.entity.Employee;
import com.empower.demo.service.EmployeeService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService es;
	
	@GetMapping("/prefix/{prefix}")
	public List<Employee> findEmployeeByPrefix(@PathVariable("prefix") String prefix)
	{
		return es.findEmployeeNameStartWith(prefix);
	}
	
	@GetMapping("/name/{name}")
	public List<Employee> findByName(@PathVariable("name") String name)
	{
		return es.findEmployeesByTheirName(name);
	}
	
	@PostMapping
	public Employee create(@RequestBody Employee employee) {
		return es.create(employee);
	}
	
	@GetMapping
	public List<Employee> read() {
		return es.read();
	}
	
	@GetMapping("/{id}")
	public Employee read(@PathVariable("id")Integer id) {
		return es.read(id);
	}
	
	@PutMapping
	public Employee update(@RequestBody Employee employee) {
		return es.update(employee);
	}
	
	@DeleteMapping("/{id}")
	public Employee delete(@PathVariable("id")Integer id) {
		return es.delete(id);
	}
	
}
