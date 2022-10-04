package com.cybage.exception;

import java.io.IOException;

public class ThrowsException {
	public static void demo() throws IOException
	{
		// throw new ArithmeticException();  -unchecked
		throw new IOException();
	}
	public static void main(String[] args) {
		try {
			demo();  //for both checked and unchecked
		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		catch(IOException e) {
	}
}
}
