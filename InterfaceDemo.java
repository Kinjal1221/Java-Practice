package com.core;

interface Ifs1
{
	void meth1();
}
interface Ifs2 extends Ifs1
{
	void meth2();
}

public class InterfaceDemo implements Ifs2 {
	public void meth2() {
		System.out.println("Meth2");
	}
	public void meth1() {
		System.out.println("Meth1");
	}
	
	public static void main(String[] args) {
		InterfaceDemo i=new InterfaceDemo();
		i.meth1();
		i.meth2();
	}
}
