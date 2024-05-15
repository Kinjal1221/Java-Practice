/* 
 * 
 * Data Type
 * 
 * 1. byte - 1 byte Byte
 * 2. short - 2 byte Short
 * 3. int - 4 byte Integer
 * 4. long - 8 byte Long
 * 5. float -  4 byte Float
 * 6. double - 8 byte Double
 * 7. char - 1 byte (Single character at a time) Character
 * 8. boolean - true/false Boolean
 * 
 *  Variable : It is a data name and is used to store the data value.
 *  int a=10;
 *  
 *  Rules:
 *  
 *  1. Must start with an alphabets.
 *  2. Upper case and lower case are significant.
 *  
 *   int a=10;
 *   System.out.println(A); - Wrong
 *   
 *   ASCII : American Standard Code For Information Interchange
 *   
 *   A-Z : 65 to 90
 *   a-z : 97 to 122
 *   
 *   3. Keyword is not allowed as a Variable name.
 *   4. Space is not allowed between Variable name.
 *  
 * */

package com.core;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		System.out.println("Welcome to Java.");
		System.out.println("Java is best.");
		double a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A : ");
		a=sc.nextDouble();
		System.out.print("Enter B : ");
		b=sc.nextDouble();
		c=a+b;
		System.out.println("Addition : "+c);
		c=a-b;
		System.out.println("Subtraction : "+c);
		c=a*b;
		System.out.println("Multiplication : "+c);
		c=a/b;
		System.out.println("Division : "+c);
	}
}