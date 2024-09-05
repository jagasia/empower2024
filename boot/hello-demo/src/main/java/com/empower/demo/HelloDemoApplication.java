package com.empower.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloDemoApplication.class, args);
		System.out.println("Hello world");
	}

}
