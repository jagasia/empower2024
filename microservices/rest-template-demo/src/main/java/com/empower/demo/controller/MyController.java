package com.empower.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.empower.demo.entity.College;

@RestController
public class MyController {
	@Autowired
	private RestTemplate rt;
	@GetMapping("/{id}")
	public College home(@PathVariable("id") Integer id)
	{
		//http://localhost:8081/college/3152
		ResponseEntity<College> response = rt.getForEntity("http://localhost:8081/college/"+id, College.class);		
		return response.getBody();
	}
}
