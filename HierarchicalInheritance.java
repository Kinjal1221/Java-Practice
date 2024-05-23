package com.core;

import java.util.Scanner;

class A11
{
	int a;
	void getA()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A : ");
		a=sc.nextInt();
	}
	void putA()
	{
		System.out.println("A : "+a);
	}
}
class B11 extends A11
{
	int b;
	void getB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter B : ");
		b=sc.nextInt();
	}
	void putB()
	{
		System.out.println("B : "+b);
	}
}
class C11 extends A11
{
	int c;
	void getC()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter C : ");
		c=sc.nextInt();
	}
	void putC()
	{
		System.out.println("C : "+c);
	}
}
class D11 extends A11
{
	int d;
	void getD()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter D : ");
		d=sc.nextInt();
	}
	void putD()
	{
		System.out.println("D : "+d);
	}
}


public class HierarchicalInheritance {

	public static void main(String[] args) {
		B11 b11=new B11();
		C11 c11=new C11();
		D11 d11=new D11();
		
		c11.getA();
		b11.getB();
		c11.getC();
		d11.getD();
		c11.putA();;
		b11.putB();
		c11.putC();
		d11.putD();
	}
}
