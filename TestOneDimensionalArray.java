package com.core;

import java.util.Scanner;

public class TestOneDimensionalArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		int i,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter "+i+" Element : ");
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Array Elements are in Ascending order");
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"] = "+a[i]);
		}
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Array Elements are in Descending order");
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"] = "+a[i]);
		}
	}
}
	
