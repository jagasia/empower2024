package com.empower.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractAuthenticationFilterConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
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
		    	.username("jagi")
		    	.password("$2a$12$TDzSytG.qwwY6V47h.AJkuTv.9akcBqcO6TYhstyI0/68/3wKkIEC")			
		    	.roles("USER")
		  		.build();
    	
    	UserDetails userDetails2=User.builder()
    	    	.username("dinesh")
    	    	.password("$2a$12$R7edTtg3TiZ.GAsSWCxjVOePzniZVnkYi8ega8RUfzMuHz6IQrIKC")			
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
