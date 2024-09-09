package com.empower.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/home")
	public String home()
	{
		return "Welcome all of you";
	}
	
	@GetMapping("/admin/home")
	public String adminHome()
	{
		return "Welcome admin";
	}
	
	@GetMapping("/user/home")
	public String userHome()
	{
		return "Welcome user";
	}
	
}
