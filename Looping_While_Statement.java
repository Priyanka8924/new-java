package com.controlflowstatement;

public class Looping_While_Statement {
	public static void main(String[] args) {
		
		
	//using while loop.
		
		// question-print the value divisible by 11 between 333 & 4000.
		int i=333;
		
		while(i<=4000) {
			if(i%11==0) {
				System.out.println (i);
		}
			i++;
	}
		
		//question-print odd numbers between 500-200;
		
		int n = 500;
		while (n>=200) {
			if (n%2!=0)
			{
				System.out.println(n);
			}
			n--;
		}
		
	}

}
