package com.empower.demo;

//@Component("jbl")
public class Jbl implements Audio
{

	@Override
	public void play() {
		System.out.println("Jbl sounds nice");
	}

}
