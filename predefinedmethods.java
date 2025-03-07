package com.priyanka;

public class predefinedmethods {
	public static void main(String[]args){
		String name = "priyanka"; 
		String surname = "udhalay";
		//toUpperCase() used to write in all the charters in upper case
	 System.out.println(name.toUpperCase());
	 //toLowerCase() used to write in all the charters in lower case
	 System.out.println(name.toLowerCase());
	 //charAt(3) it is used to find the the character at that number 
	 System.out.println(name.charAt(3));
	 //concat(surname) used to add the two strings together 
	 System.out.println(name.concat(surname));
	 //"+" it is also use as concatenation in strings.
	 String full = name+" "+surname;
	 System.out.println(full);
	 //replace the char
	 System.out.println(name.replace('r', 'y'));
	 //indexof checks the character at which place it is present 
	 System.out.println(name.indexOf('r'));
	
	 
	 //tricky question
	 int a =10;
	 int b=30;
	 System.out.println(a+b);
	 String add = "addition is";
	 System.out.println(a+b+add);
	 System.out.println(add+a+b);
	 
	 
	}
	

}

