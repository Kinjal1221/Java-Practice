package com.core;

class Student1
{
	int rno;
	String sname;
	public Student1() {
		System.out.println("Default Constructor Called");
	}
	public Student1(int rno,String sname) {
		this();
		System.out.println("Parameterized Constructor");
		this.rno=rno;
		this.sname=sname;
	}
	void show()
	{
		System.out.println("Roll No : "+rno);
		System.out.println("Student Name : "+sname);
	}
}

public class thisKeyword {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Student1 s1=new Student1(12, "Kinjal");
		System.out.println("Aftre Creating Parameterized Object");
		s1.show();
		System.out.println("Back To Main Method");
	}
}
