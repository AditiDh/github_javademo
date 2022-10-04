package com.cybage.basic;

class Person2 {
	

	String name;
	String address;
	Person2(String name,String address)  // parameterized constructor
	{
		this.name=name;
		this.address=address;
	}
	
	
	public String getInfo()
	{
		return "name="+this.name+" address="+this.address;
	}
}

class Student2 extends Person2 {
		private int rollNo;
		private int marks;
		Student2(String name,String address,int rollNo,int marks)
		{
			super(name,address); //calls super class parameterized constructor
			this.rollNo=rollNo;
			this.marks=marks;
		}
	
		@Override
		public String getInfo()
		{
			return super.getInfo()+ " roll no="+this.rollNo+"marks="+this.marks;
		}
	}



public class methodoveride {

                                                                                                                                                                                     
	public static void main(String[] args) {    
		Person2 person=new Person2("Aditi","Pune");    
		System.out.println(person.getInfo());                                                                                      
		  
		                                                                                                                                                                                   
		Student2 student=new Student2("Aditya","Satara",100,90);   
		System.out.println(student.getInfo());  
		
		//DYNAMIC POLYMORPHISM

		Person2 p= new Student2("Aniket","Baner",102,80);
		System.out.println(p.getInfo());
		
	}
		
                                                                                                                                                                                     
	}                                                                                                                                                                                   
                                                                                                                                                                                     