package com.empower.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("hi....");
		SpringApplication.run(Application.class, args);
		System.out.println("HEllo world....1");
	}

}
