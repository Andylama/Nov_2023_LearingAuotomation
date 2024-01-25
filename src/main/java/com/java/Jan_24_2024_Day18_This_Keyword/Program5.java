package com.java.Jan_24_2024_Day18_This_Keyword;

public class Program5 {
	
/*  Practical demonstration of Point No :3 
    >>>this() can be used to invoke(execute) current class contructor.  */

	
//---------------------------------------------------------------
Program5()    {
	
System.out.println("No argument constructor  1");	
}
//------------------------------------------------------------	

Program5(int A)  {
	this();
	System.out.println("Parameterized contructor 2");
	
}
//----------------------------------------------------------------------
public static void main(String[] args) {
		
	Program5 prog = new Program5(7);
	     
	}

}
