package com.controlflowstatement;

public class BranchigStatement {
	 public static void main(String[]args){
		 
		 
		 
		 
		 //BREAK STATEMENT
		 System.out.println("BREAK STATEMENT");
		 
		 //QUES:When value 25 is found , stop the execution;
		 
		 for(int i=2;i<30;i++)
		 {
			 System.out.println("the value is"+""+i);
			 
			 if(i==25) {
				 break;
			 }
		 }
		 
		 System.out.println("CONTINUE STATEMENT");
		 //continue skips the current iteration but doesn't exit the loop.
		 
		 //  want to print the multiple of 17 using CONTINUE
		 for(int m=10;m<20;m++)
		 {
			 if(m%17 !=0  ) {
				continue;
				 
			 }
			 System.out.println("the value is"+""+m);
			 
			 
		 }
		 
		 
		 
		 
		 System.out.println("RETURN STATEMENT");
		 //RETURNS THE VALUE.
		 
		 
		 
		 //calling the cal method.
		 System.out.println( cal(10,10,"DIV"));
		 
		 //calling the opt method.
		 
		 System.out.println( opt(10,10,"DIVISION"));
		 
		 
		 
		 
		 
		 
		 
		 
	
	 }
	 
	//only one Return statement.
	 
	 public static int cal(int a,int b,String operation) {
		 int k = 0;
		 
		 if(operation=="ADD")
	 {
			k = a+b;
		
		 }else if(operation=="SUB") {
			 k=a-b;
		 }else if(operation=="DIV") {
			 k=a/b;
		 }else if(operation=="MUL") {
			 k=a*b;
		 }
		 System.out.println("completed");
		 
		 
	
		 return k;
		 
	 } 
	 //USING THE RETURN STATEMENT IN BETWEEN.
	 public static int opt(int c,int d,String opr) {
		 int result = 0;
		 
		 if(opr=="ADDITION")
	 {
			return  c+d;
		
		 }else if(opr=="SUBSTRACTION") {
			 return c-d;
		 }else if(opr=="DIVISION") {
			 return c/d;
		 }else if(opr=="MULTIPLICATION") {
			 return c*d;
		 }
		 
		 else {
			 System.out.println("no option found");
		 }
		
		 
	
		 return 0;
		 }
		 
	 
	 

}
