package com.empower.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/home")
	public String home() {
		return "Hello";
	}
	
	@GetMapping("/admin/home")
	public String adminHome() {
		return "Hello this is admin home page";
	}
	
	@GetMapping("/user/home")
	public String userHome() {
		return "Hello this is user home page";
	}
	
	
}
