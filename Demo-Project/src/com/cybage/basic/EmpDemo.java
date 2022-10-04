package com.cybage.basic;

class Employee{ //default constructor
	 int empId;
	 String empName;
	 static String msg;
	 
  
		public Employee(int employeeId,String name) {
			//this.employeeId=employeeId; within the constructor
			this(employeeId);   //we are calling another constructor
			this.empName=name;
			
		}
		public Employee(int employeeId)
		{
			this .empId=employeeId;
		}

String getEmpInfo()
{
	return "Employee Id="+empId+"Employee Name="+empName;
}
static void displayMessage() {
	System.out.println(msg);
}
}
public class EmpDemo {
	public static void main(String[] args) {
		Employee employee1=new Employee(1001,"John");
		Employee employee2=new Employee(1002,"Sara");
		Employee.msg="Hello from Java";
		Employee.displayMessage();
		
		System.out.println(employee1.getEmpInfo());
		System.out.println(employee2.getEmpInfo());
		System.out.println(employee1.msg);
		employee1.msg="Modified Msg";
		System.out.println(employee2.msg);
		//employee.empId=1001;
		//employee.empName=;
		//System.out.println(employee.getEmpInfo());
	}

}

