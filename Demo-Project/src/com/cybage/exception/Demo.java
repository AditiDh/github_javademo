package com.cybage.exception;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
		int a = 10;
		int l=args.length;
		int b = l;
		int c=a/l;
		int arr[]=new int[5];
		System.out.println(arr[5]);
		//int c =a/b;
		//System.out.println("c="+c);
		
		}
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
//		catch(ArrayIndexOutOfBoundsException e){
//			e.printStackTrace();
//			
//		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally
		{
			System.out.println("After finally..");
		}
	
	}

}
