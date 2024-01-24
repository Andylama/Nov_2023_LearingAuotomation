package com.java.Jan_21_2024_Day17_ExceptionHandling;
public class Program6_How_to_print_Exception_information {
public static void main(String[]args)  {
		
	try {
		int A= 10, B= 0;
		int  Total = A/B ;
		System.out.println(Total);
	} catch (Exception e) {
	e.printStackTrace(); /*  This will print Exception Name, description and stack trace.  */
	System.out.println(e);  /*  This will only print Exception Name & description not the Stack trace        */
	System.out.println(e.getMessage());/*  This will only print description  */
	}
}
}
