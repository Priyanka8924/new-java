package com.operators;

public class UnaryOperators {
        public static void main(String[]args) {
        	
        	//using unary operations
        	
        	int x = 100;
        	System.out.println(++x);
        	System.out.println(x++);
        	System.out.println(--x);
        	System.out.println(x--);
        	
        	
        	
        	
        	int y = 100;
        	int z = y++;
        	System.out.println(y);
        	System.out.println(z);
        	
        	System.out.println(++y + ++z);
        	
        	//using ! (not)
        	
        	boolean age = true;
        	age = !age;
        	System.out.println(!age);
        	
        	
        }
}
