package com.priyanka;

//Scanner class belongs to java.util package.

import java.util.Scanner;

public class Dynamic_Input {

	public static void main(String[] args) {
		
		//using scanner class for dynamic input from user.
		
		//creating the object.
		
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value of x");
		//taking input for x
		int x = s.nextInt();
		//taking input for y.
		System.out.println("enter the value of y");	
		int y=s.nextInt();
		
		int result = x+y;
		
		System.out.println("the addition is"+result);
		
		
		System.out.println("***full name*****");
		
		//calling the method
		
		
		fullName();
		
		System.out.println("*******employers data*****");
		
		Scanner emp = new Scanner(System.in);
		System.out.println("enter the age");
		int age = emp.nextInt();
		System.out.println("enter the qualification");
		String qual = emp.next();
		
		System.out.println("do you have marks > 70 or not");
		boolean marks = emp.nextBoolean();
		
		System.out.println("*******employers final data*****");
		
		System.out.println("age");
		System.out.println(age);
		System.out.println("qualification");
		System.out.println(qual);
		System.out.println("eligible");
		System.out.println(marks);
		

		
		
				
		
		
		

	}
	
	//created the method to print full name.
	public static String fullName() {
		
		Scanner name = new Scanner(System.in);
		System.out.println("enter first name");
		String firstName = name.nextLine();
		System.out.println("enter last name");
		String lastName = name.nextLine();
		String fullName =  firstName + ""+ lastName;
		System.out.println("the full name is "+""+fullName);
		return fullName;
		
	}
	
	

}

