package com.empower.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.empower.demo.email.EmailSender;

@RestController
public class MyController {
	@Autowired
	private EmailSender email;

	
	
	@GetMapping("/sendemail")
	public String sendEmail(@RequestParam String to, @RequestParam String subject, @RequestParam String body)
	{
		email.sendSimpleMessage(to, subject, body);
		return "Email sent";
	}
}
