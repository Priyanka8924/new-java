package com.priyanka;

//calling the classes from one to another 

public class methods1 {
	public static void main(String[]args)
	{
		
		//calling the non static methods 
		
		methods c1 = new methods();
		 c1.substraction();
		 
		 //calling the static method
		int result = methods.addition();
		System.out.println(result);
		 
		 
	}
}
