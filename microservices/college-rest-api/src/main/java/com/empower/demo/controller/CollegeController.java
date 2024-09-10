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

import com.empower.demo.entity.College;
import com.empower.demo.service.CollegeService;




@RestController
@RequestMapping("/college")
public class CollegeController {
	@Autowired
	private CollegeService cs;
	
	@PostMapping
	public College create(@RequestBody College college) {
		System.out.println(college);
		return cs.create(college);
	}
	
	@GetMapping
	public List<College> read() {
		return cs.read();
	}
	
	@GetMapping("/{id}")
	public College read(@PathVariable("id")Integer id) {
		return cs.read(id);
	}
	
	@PutMapping
	public College update(@RequestBody College college) {
		return cs.update(college);
	}
	
	@DeleteMapping("/{id}")
	public College delete(@PathVariable("id")Integer id) {
		return cs.delete(id);
	}
	
}
