package com.cybage.basic;

public class InheritenceDemoo {

	public static void main(String[] args) {
		Person person=new Person("Aditi","Pune");
		System.out.println("Person Name:"+person.getName()+"\n Person Address:"+person.getAddress());
		// the obj are private so we acces them using the methods i.e. getName and getAddress
		
		Student student=new Student("Aditya","Satara",100,90);
		System.out.println("Student Name:"+student.getName()+"\n Student Address:"+student.getAddress()+"\n Student Roll no.:"+student.getrollNo()+"\n Student Marks:"+student.getmarks());

	}

}
