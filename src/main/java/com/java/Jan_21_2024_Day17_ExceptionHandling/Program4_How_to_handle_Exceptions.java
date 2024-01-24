package com.java.Jan_21_2024_Day17_ExceptionHandling;

public class Program4_How_to_handle_Exceptions {

	
	public static void main(String[]args) {
		example1();
	}
	
	public static void example1() {
	/*  In this example we will work with a RunTime/Unchecked Exception       */	
		
		int A= 10 , B =0;
		int Total = A/B ;
		System.out.println(Total);
		
	}
	public static void explanation() {
		/* Exception occurs at Row No : 14    This line int Total = A/B  is under example1() Method
		   example1() Method will create an Object whenever encouters an Exceptons.
		   This Object has 3 things :-  1. Exception Name [it technically has the Class name] . 
		                                2. Description [What type of exception it is .
		                                3. StacTrace [Which line and method has the exception.   
		                                 
		  Example1() Method will not be able to handle the exception                             
		  This Object will be passed to JVM.JVM will check if it handle the exception.
		  If JVM can not handle the exception it will pass it on the Default Exception Handleer
		  But Before JVM passes the object of Default Exception Handler, it will abnormally terminate the program
		  Default Exception Handler will print the exception.
		                               
		                                 *
		>>>How to handle this Exception Manually?   
		   By Using 5 different Keywords:
		   1. try
		   2. catch
		   3. finally
		   4. throw
		   5. throws
		                              */
	}                                
}
