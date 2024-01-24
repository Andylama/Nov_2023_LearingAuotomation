package com.java.Jan_21_2024_Day17_ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class program3_Checked_VS_Unchecked {
public static FileInputStream ip;
/*   What are compileTime Exceptions and What are RunTime Exceptions?
	  Exceptions always occur at RunTime. Exceptions never occur at CompileTime.   
	  CompiltTime(checked ) Exceptions are the exceptions which can be handled or warned by the compiler at Copmile Time.   
	  Run Time (unchecked) Exceptions are the exceptions which can not be handled by the compiler at compile Time.                    */
	
	public static void main(String[]args) {
	    	 fileNotFoundExceptionValidation() ;	
	    	 classNotFoundExceptionValidation();
	    	 airthmeticExceptionValidation();
	}
	
	/*  My intention is to handle a particular File in my Laptop . This is the perfect example of CompiltTime(checked ) Exceptions 
	 * because it is giving warning  as redline to hadle this  situation  incase the file is not there so that it does not disrupt the  flow of  the remainng exectution              */
	public static  void fileNotFoundExceptionValidation() {
		
		
	try {
		
	ip = new FileInputStream("C:\\Users\\andyl\\Desktop\\abc.txt");
	}        catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	}
//------------------------------------------------------------------------------	
	public static void classNotFoundExceptionValidation() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//------------------------------------------------------------------------
	public static void airthmeticExceptionValidation() {
		int A =10,   B= 0;
		
		int Total = A/B ;/* here is the Exception But Compiler is not giving  any kind of  Warning.This is
		                    the perfect  example RunTime (unchecked)  Exceptions. 
		                    Run Time (unchecked) Exceptions are the exceptions which can not be handled by the compiler at compile Time It does not check and provide  any warning.  */
		
		System.out.println (Total);
	}
	
}
