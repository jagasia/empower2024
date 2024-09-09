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

import com.empower.demo.entity.Department;
import com.empower.demo.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	private DepartmentService es;
	
	@PostMapping
	public Department create(@RequestBody Department department) {
		return es.create(department);
	}
	
	@GetMapping
	public List<Department> read() {
		return es.read();
	}
	
	@GetMapping("/{id}")
	public Department read(@PathVariable("id")Integer id) {
		return es.read(id);
	}
	
	@PutMapping
	public Department update(@RequestBody Department department) {
		return es.update(department);
	}
	
	@DeleteMapping("/{id}")
	public Department delete(@PathVariable("id")Integer id) {
		return es.delete(id);
	}
	
}
