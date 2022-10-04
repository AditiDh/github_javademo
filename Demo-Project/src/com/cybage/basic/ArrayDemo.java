package com.cybage.basic;

public class ArrayDemo {

	public static void main(String[] args) {
		int empId;
		String empName;
		/*int[] intArray =new int[10];
		//initialize or access elements using index  i.e. adding data one by one in array
		intArray[0]=10;  //type 1
		intArray[1]=20;
		
		int[] newArray= {2,3,4,5,6,7,8};  //also declare array using this syntax TYPE 2

		for(int i=0;i<newArray.length;i++)
		{
			System.out.println(newArray[i]); //traverse array using for loop
		}
		
		for(int element:newArray) 
			System.out.println(element);*/
		
		//-------------MULTI DIMENSIONAL ARRAY---------
		int multArray[][] = {{2,3,4},{5,6,7},{8,9,10}};
		
		for(int i=0;i<multArray.length;i++)
		{
			//System.out.println(multArray[i]); //traverse array using for loop
			for(int j=0;j<multArray.length;j++)
			{
				System.out.println(multArray[i][j]); //traverse array using for loop
			}
		}
		
		
		//String getEmpInfo()
		//{
		//	return "Employee Id="+empId+"Employee Name="+empName;
		//}
				
	//----------------CREATE ARRAY OF OBJECTS
		Employee arrays[]=new Employee[5];
			arrays[0]=new Employee(1001,"John");
			arrays[1]=new Employee(1002,"Sara");
			arrays[2]=new Employee(1003,"Aditi");
			arrays[3]=new Employee(1004,"Adii");
			arrays[4]=new Employee(1005,"Adiiii");
			
	}

}
