package com.empower.demo.helper;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class MyToken {
	private String token;
    private String name;
    private Collection<? extends GrantedAuthority> authorities;
    
    public MyToken() {}

	public MyToken(String token, String name, Collection<? extends GrantedAuthority> authorities) {
		super();
		this.token = token;
		this.name = name;
		this.authorities = authorities;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	@Override
	public String toString() {
		return "MyToken [token=" + token + ", name=" + name + ", authorities=" + authorities + "]";
	}
    
}
