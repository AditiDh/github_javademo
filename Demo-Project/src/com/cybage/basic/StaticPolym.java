package com.cybage.basic;

class AddDemo
{
	int add(int n1,int n2)
	{
		System.out.println("add int");
		return n1+n2;
	}
	float add(float n1,float n2)
	{
		System.out.println("add float");
		return n1+n2;
	}
	double add(double n1,double n2)
	{
		System.out.println("add double");
		return n1+n2;
	}
	byte add(byte n1,byte n2)
	{
		System.out.println("add byte");
		return (byte)(n1+n2);
	}
	long add(long n1,long n2)
	{
		System.out.println("add long");
		return (long)(n1+n2);
	}
	short add(short n1,short n2)
	{
		System.out.println("add short");
		return (short)(n1+n2);
	}
}

public class StaticPolym {

	public static void main(String[] args) {
		AddDemo addDemo=new AddDemo();
		System.out.println(addDemo.add(10,20));
		System.out.println(addDemo.add(10.7f,20.6f));
		System.out.println(addDemo.add(10.7f,20.6));
		System.out.println(addDemo.add((byte)10,(byte)30));
		System.out.println(addDemo.add(100,300)); //takes op in int
		System.out.println(addDemo.add((long)100,(long)300));
		System.out.println(addDemo.add((short)10,(short)15));

	}

}
