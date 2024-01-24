package com.java.Jan_21_2024_Day17_ExceptionHandling;

public class Program5_Try_Catch_Block {
	
public static void main(String[]args) {
	tryCodeisNotRiskySoWhatHappensToCatchBlock();
	
	//example2();
	//example1();
}
	
	public static void example1() {
	/*  In this example we will work with a RunTime/Unchecked Exception       */	
		
		try {
			int A= 10 , B =0;
			int Total = A/B ;
			System.out.println(Total);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("The Exception has been handled ");
		} 
		
			
}
//---------------------------------------------------------	
	public static void example2() {
		System.out.println("1");
	    System.out.println("2");
	    System.out.println("3");
	    System.out.println("4");
	    try {
			System.out.println(5/0);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	    System.out.println("6");
	    System.out.println("7");
	    System.out.println("8");
	    System.out.println("9");
	    System.out.println("10");
	    
	    
	}

//--------------------------------------------------
public static void tryCodeisNotRiskySoWhatHappensToCatchBlock() {
	
	
	try {
		int A = 10, B=2;
		int Total = A/B;
		System.out.println(Total);
	} catch (Exception e) {
		
		e.printStackTrace();
		System.out.println("There is no problem in the try block or there is no risk, still I ma using try catch");
	}
}
}





/*    
     try {
           risky code   the code where exception is 
             
              }      
           catch(Excepton e)          {    
           
           handling code
           
           )
                                                            */
 