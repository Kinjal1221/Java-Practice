package com.core;

public class MethodOverloading {

	void test()
	{
		System.out.println("Test with no argument");
	}
	void test(int a)
	{
		System.out.println("Test with 1 argument");
	}
	void test(int a,int b)
	{
		System.out.println("Test with 2 argument");
	}
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.test();
		m.test(12);
		m.test(17, 21);
	}
}
