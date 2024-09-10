package com.empower.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empower.demo.api.CollegeApi;
import com.empower.demo.entity.College;

@RestController
@RequestMapping("/client")
public class MyController {
	@Autowired
	private CollegeApi api;
	
	
	@GetMapping("/all")
	public List<College> getAllColleges()
	{
		List<College> list = api.read();
		return list;
	}
	
}
