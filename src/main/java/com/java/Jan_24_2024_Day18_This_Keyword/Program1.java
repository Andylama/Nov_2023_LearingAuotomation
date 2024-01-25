package com.java.Jan_24_2024_Day18_This_Keyword;
/*   This keyword is also a refrence variable which refers to the Object.
 *                                                       */	
public class Program1 {
	int A;	/* This [ int A; ] is instance variable*/

//------------------------------------------------------------------	
	public void setvaluesMethod1 (int A) { /* This (int A) is Local variable*/
		this.A=A;/* When you are having the same naming convention for both Instance variable
		            and Local variable and you equal them, The compiler gets confused. 
		            To resolved this type of situation we must use THIS Keyword which will clarify the conusion and it will
		            separte Instance variable and Local Variable 
	  >>>This Keyword:- 1. refers to the current  Class instance variable.  
		                2. Without this Keyword It will refer to the Object.
		                3. But if we write this. then it refers to the instance variable
		                   as instance variales are part of the object itself. */
		                         
	}
//---------------------------------------------------------------------
	public void showMethod2 () {
	System.out.println(A)	;
	}
//----------------------------------------------------------------------------	
	
}
