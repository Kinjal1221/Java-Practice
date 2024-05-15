package com.core;

import java.util.Scanner;

class Student
{
	int rno;
	String sname;
	double per;
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Roll No : ");
		rno=sc.nextInt();
		System.out.print("Enter Student Name : ");
		sname=sc.next();
		System.out.print("Enter Percentage : ");
		per=sc.nextDouble();
	}
	void putData()
	{
		System.out.println("Roll No : "+rno);
		System.out.println("Student Name : "+sname);
		System.out.println("Percentage : "+per);
	}
}

public class ClassDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.getData();
		System.out.println("After getData");
		s1.putData();
		System.out.println("After putData");
		
		Student s2=new Student();
		s2.getData();
		System.out.println("After getData");
		s2.putData();
		System.out.println("After putData");
	}
}
