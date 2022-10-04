package com.cybage.basic;


public class Person {
	

	String name;
	String address;
	Person(String name,String address)  // parameterized constructor
	{
		this.name=name;
		this.address=address;
	}
	
	public String getName()
	{
		return this.name;
		
	}
	public String getAddress()
	{
		return this.address;
		
	}
}

