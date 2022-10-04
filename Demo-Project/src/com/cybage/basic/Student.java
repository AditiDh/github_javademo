package com.cybage.basic;

public class Student extends Person {
	private int rollNo;
	private int marks;
	Student(String name,String address,int rollNo,int marks)
	{
		super(name,address); //calls super class parameterized constructor
		this.rollNo=rollNo;
		this.marks=marks;
	}
	public int getrollNo()
	{
		return this.rollNo;
		
	}
	public int getmarks()
	{
		return this.marks;
		
	}
}
