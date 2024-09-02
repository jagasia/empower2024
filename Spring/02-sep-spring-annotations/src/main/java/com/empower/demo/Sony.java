package com.empower.demo;

import org.springframework.stereotype.Component;

@Component
public class Sony implements Audio
{

	@Override
	public void play() {
		System.out.println("Sony makes good sound");
	}

}
