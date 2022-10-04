package com.cybage.basic;

class A
{
	/*int m,n;
	A(int m , int n){
		this.m=m;
		this.n=n;
	}*/
	
	public void display() {
		System.out.println("Class A's Display Method");
	}
}

class B extends A{
	@Override
	public void display() {
		System.out.println("Class B's Display Method");
	}
	
}
public class Polymorphism {

	public static void main(String[] args) {
	
		A a=new A();
		a.display();
		
		B b=new B();
		b.display();
		
		A a1=new B();
		a1.display(); 
		
	}

}
