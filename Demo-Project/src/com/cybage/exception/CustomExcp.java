package com.cybage.exception;

public class CustomExcp {

	public static void main(String[] args) {
		int age=17;
		try {
		if(age<18) 
			throw new UserDefinedException("Invalid age for voting");
		else {
			System.out.println("Valid Age");
		}
		}
		
		catch(UserDefinedException e) {
			e.printStackTrace();
		}
		
	}

}
