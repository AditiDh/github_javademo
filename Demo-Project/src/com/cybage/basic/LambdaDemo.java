package com.cybage.basic;

interface Greeting
{
	//public void greet();
	//public void greet(String msg);
	public String greet(String msg);
}



public class LambdaDemo {

	public static void main(String[] args) {
		//Greeting greeting=()->System.out.println("Hello from lambda expression");
		//Greeting greeting=(String msg)->System.out.println(msg);
		Greeting greeting=msg->{return msg;};
		// TODO Auto-generated method stub
		System.out.println(greeting.greet("hello java"));
}
}