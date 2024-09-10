package com.empower.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestTemplateDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTemplateDemoApplication.class, args);
		System.out.println("Rest client demo");
	}

}
