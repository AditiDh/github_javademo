package com.cybage.exception;

public class ThrowException {
	public static void demo()
	{
		System.out.println("Inside Demo");
		try {
		int a=10/0;
		System.out.println("a="+a);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		demo();
		try
		{
			throw new NullPointerException();
		}
		catch (NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("After Catch");

	}

}
