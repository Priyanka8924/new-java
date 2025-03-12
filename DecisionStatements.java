package com.controlflowstatement;

public class DecisionStatements {
	public static void main(String[]args ) {
		
		// IF STATEMENT
		int a = 10;
		if(a>5)
		{
			System.out.println("true");
		}
		System.out.println("false");
		
		String person1country = "india";
		String person1gender = "female";
		String person1skill = "bowler";
		
		
		if(person1country == "india"&& ( person1gender == "male" || person1gender=="male")&&(person1skill == "bowler"|| person1skill == "batsman")) {
			System.out.println("true");
			
		}
	  System.out.println("insucessfull");
	  
	  
	  // IF ELSE-IF STATEMENT
	  
	  int billingValue =15000;
       if(billingValue>=1000&&billingValue<=5000) {
    	   int result = (billingValue/100)*5;
    	   System.out.println(result);
    	
       }
       else if (billingValue>5000&&billingValue<=10000) {
    	   int discount = (billingValue/100)*10;
    	   System.out.println(discount);
       }
       else
       {
    	   System.out.println("no result");
       }
       
       //NESTED IF STATEMENT
       
      int b=100;
      if(b<200)
      {
    	  if(b%2==0)
    	  {
    		  System.out.println("number is even and less then 200");
    	  }
    	  else
    	  {
    		  System.out.println("number is odd");
    	  }
    	  
      }
      else
	  {
		  System.out.println("number is greater is more then 200");
	  }
      
      
      //SWITCH STATEMENT.
      
      
      int m = 20;
      int n = 30;
      String operator = "add";
      String substraction = "sub";
      
      switch(substraction) {
      case "add":
    	  System.out.println("the addition is ");
    	  System.out.println(m+n);
    	  break;
      case"sub":
    	  System.out.println("the substraction is ");
    	  System.out.println(m-n);
    	  break;
      case"mul":
    	  System.out.println("the multiplication is ");
    	  System.out.println(m*n);
    	  break;
      case"div":
    	  System.out.println("the multiplication is ");
    	  System.out.println(m/n);
    	  break;
      }
	}

}
