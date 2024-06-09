package com.core;

class F1
{
	final int a;
	public F1()
	{
		a=10;
	}
	void show()
	{
		System.out.println("Show from F1");
	}
}
class F2 extends F1
{
	void show()
	{
		System.out.println("Show from F2");
	}
}

public class FinalDemo {

	public static void main(String[] args) {
		F2 f=new F2();
		f.show();
	}
}
