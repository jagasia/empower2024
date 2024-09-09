package com.empower.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService
{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Collection list = new ArrayList<>();
		list.add("ADMIN");
		list.add("USER");
		return new User("jag", "$2a$12$IR4WDJdWzWtX1TwIaKa70O.r09T7nFfLWed.v.wI6gLKW9Ly7tPou", list);
	}

}
