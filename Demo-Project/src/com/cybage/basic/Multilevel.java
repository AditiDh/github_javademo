package com.cybage.basic;

class X{
	X(){
		System.out.println("This is x");
	}

}

class Y extends X{
	Y(){
		System.out.println("This is y");
	}

	
}

class Z extends Y{
	Z(){
		System.out.println("This is z");
	}

	
}



public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z z=new Z();
	}

}
