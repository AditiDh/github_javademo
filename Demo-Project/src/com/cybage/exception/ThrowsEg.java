package com.cybage.exception;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsEg {
	
	class Parent{
		public  void demo() throws  IOException
		{
			throw new IOException();
		}
		class Child extends Parent{
			@Override
			public  void demo() throws  IOException //,SQLException gives error if ypu add one more checked exception
			{
				throw new IOException();
			}
		}
	}

	public static void main(String[] args) {
	}
}

