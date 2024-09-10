package com.empower.demo.api;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.empower.demo.entity.College;

@FeignClient(name = "college-api", url = "http://localhost:8081/college")
public interface CollegeApi {
	@PostMapping
	public College create(@RequestBody College college);
	
	@GetMapping
	public List<College> read();
	
	@GetMapping("/{id}")
	public College read(@PathVariable("id")Integer id);
	
	@PutMapping
	public College update(@RequestBody College college);
	
	@DeleteMapping("/{id}")
	public College delete(@PathVariable("id")Integer id);
}
