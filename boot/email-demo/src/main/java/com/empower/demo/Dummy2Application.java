package com.empower.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Dummy2Application {
	
	@GetMapping
	public String home()
	{
		return "Hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(Dummy2Application.class, args);
	}

}
