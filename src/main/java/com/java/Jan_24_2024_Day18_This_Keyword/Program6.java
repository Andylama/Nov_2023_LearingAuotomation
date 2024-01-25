package com.java.Jan_24_2024_Day18_This_Keyword;

public class Program6 {
/*  Practical demonstration of Point No :4
    >>>4.this can be used to pass as argument in the method call.   */
	
	
public void Method1( Program6  prog)	{
System.out.println("This is Method No:  1")	;

}
//------------------------------------------------------------	
public void Method2()	{
System.out.println("This is Method No:  2")	;
Method1(this);

}	
//---------------------------------------------------------------	
	public static void main(String[] args) {
		Program6 prog = new Program6();
		         prog.Method2();

	}

}
