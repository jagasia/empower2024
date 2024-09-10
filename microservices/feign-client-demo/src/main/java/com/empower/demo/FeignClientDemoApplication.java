package com.empower.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignClientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientDemoApplication.class, args);
		System.out.println("Client runs here");
	}

}
