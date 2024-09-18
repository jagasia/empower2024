package com.empower.demo.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.stereotype.Component;

import jakarta.mail.internet.MimeMessage;

@Component
public class EmailSender {
	@Autowired
	private JavaMailSender emailSender;
	
	public void richMail()
	{
	}
	
	
    public void sendSimpleMessage(
    	      String to, String subject, String text) {
    	        
    	        SimpleMailMessage message = new SimpleMailMessage(); 
    	        message.setFrom("jag.javaprogram@gmail.com");
    	        message.setTo(to); 
    	        message.setSubject(subject); 
    	        message.setText(text);
    	        emailSender.send(message);
    	        
    	    }
}
