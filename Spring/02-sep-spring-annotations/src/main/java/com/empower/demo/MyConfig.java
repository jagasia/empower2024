package com.empower.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com")
public class MyConfig {

	
	@Bean
	public Jbl jbl()	//method name is the bean name
	{
		return new Jbl();
	}
}
