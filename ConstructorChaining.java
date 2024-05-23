package com.core;

class X1
{
	X1()
	{
		System.out.println("X1's Default Constructor");
	}
	void show()
	{
		System.out.println("Show from X1");
	}
}
class Y1 extends X1
{
	Y1()
	{
		System.out.println("Y1's Default Constructor");
	}
	void show()
	{
		System.out.println("Show from Y1");
	}
}
class Z1 extends Y1
{
	Z1()
	{
		System.out.println("Z1's Default Constructor");
	}
	void show()
	{
		System.out.println("Show from Z1");
	}
}
public class ConstructorChaining {

	
	public static void main(String[] args) {
		Z1 z=new Z1();
		z.show();
	}
}
