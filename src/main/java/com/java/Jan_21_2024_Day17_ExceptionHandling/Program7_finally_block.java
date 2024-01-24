package com.java.Jan_21_2024_Day17_ExceptionHandling;
public class Program7_finally_block {
	
/*  Notes: 1. Finally block will execute no matter Exceptions occurs or not .
 *         2. You can execute finally block with only try block. you can choose not to  use 
 *         3. catch block but again if exception is there it will not be handled.    
 *         4. Only finally block is not possible              */
	
public static void main(String[] args) {
	case1();/*   Here is Exception */
   case2() ;/* code is clean. Will finally block be executed ? YES  */
	case3();
}

public static void case1()  {      /*   There was Exception                   */
	
	try {
		int  A= 10, B=0;
		
		int Total = A/B;
		
System.out.println(Total);
	} catch (Exception e) {
	
		e.printStackTrace();
	
}finally {
System.out.println(" Case : 1 No matter what this will be printed");
}
}
//------------------------------------------------------------------
public static void case2()  {  /* code is clean. Will finally block be executed ? YES  */
	try {
		int  A= 10, B=2;
		
		int Total = A/B;
		
System.out.println(" Case:  2 Total is: "+Total);
	} catch (Exception e) {
		
		e.printStackTrace();
	}

	finally {
		System.out.println(" Case : 2 No matter what this will be printed");
	}
}
//-------------------------------------------------------------
public static void case3() {
	try {
		
	
	int A= 10, B= 0;
	int Total = A/B;
	System.out.println(Total);
	

}	finally {
	System.out.println(" Case : 3 No matter what this will be printed");
	
}
//-----------------------------------------

	
	

}
}
