package com.cybage.exception;

public class EmpIdExcp {

	public static void main(String[] args) {
		
				int emp_id=99;
				try {
				if(emp_id>100) 
					throw new UserDefinedException("Invalid id should be less than 100");
				else {
					System.out.println("Permission Granted");
				}
				}
				
				catch(UserDefinedException e) {
					e.printStackTrace();
				}
				
			}
}
