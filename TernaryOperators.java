package com.operators;

public class TernaryOperators {
   public static void main(String[]args) {
	   
	   //finding max value b/w given numbers.
	  int a = 10;
	  int b= 20;
	  int c = 30;
	  int result = (a>b||a<c)?a:b;
	  
	  int finalResult = (a>b||a>c)?a:b;
	  
	  System.out.println(result);
	  
	  System.out.println(finalResult);
	  eligibleNoneligible();
	  
	  
	  
   }
   public static void eligibleNoneligible() {
	   int a =70;
	
	 char gender ='f';
	 System.out.println((a>60&&gender=='f')?"eligible":"not eligible");
	   
   }
   
}
