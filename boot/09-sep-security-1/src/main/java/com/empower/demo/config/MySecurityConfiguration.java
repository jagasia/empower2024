package com.empower.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractAuthenticationFilterConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class MySecurityConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    	return http
    			.authorizeHttpRequests(auth->{
    				auth.requestMatchers("/home").permitAll();
    				auth.requestMatchers("/admin/**").hasRole("ADMIN");
    				auth.requestMatchers("/user/**").hasRole("USER");
    				auth.anyRequest().authenticated();
    			})
    			.formLogin(AbstractAuthenticationFilterConfigurer::permitAll)
    			.build();
    }
    
    @Bean
    public UserDetailsService userDetailsService() {
    	UserDetails userDetails1=User.builder()
		    	.username("jag")
		    	.password("$2a$12$IR4WDJdWzWtX1TwIaKa70O.r09T7nFfLWed.v.wI6gLKW9Ly7tPou")	//jag@123			
		    	.roles("USER")
		  		.build();
    	
    	UserDetails userDetails2=User.builder()
    	    	.username("gautham")
    	    	.password("$2a$12$Aris95H3qeRo9K5djvc3H.Lj2jxOuwHbN74uuvGaHnP3e3HUYlXym")	//nithin@143			
    	    	.roles("ADMIN")
    	  		.build();
    	    	
    	return new InMemoryUserDetailsManager(userDetails1, userDetails2);
    	
    }
    
    @Bean
    public PasswordEncoder passwordEncoder()
    {
    	return new BCryptPasswordEncoder();
    }
}
