package com.empower.demo.model;

public class Mathematics {
	
	int no1;
	int no2;
	int expected;
	public Mathematics(int no1, int no2, int expected)
	{
		this.no1=no1;
		this.no2=no2;
		this.expected=expected;
	}
	
	public int sum()
	{
		return no1+no2;
	}
	
	public int difference()
	{
		return no1-no2;
	}
	
	public int product()
	{
		return no1*no2;
	}
	
}
