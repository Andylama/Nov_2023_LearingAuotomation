package com.java.Jan_21_2024_Day17_SpecialClasses_Scanner_Class;

import java.util.Scanner;

public class Scanner_Concept {
	
	public static Scanner read;
	/* Scanner class is a pre define class in Java under java.util package.
	 * Use of Scanner Class :- It helps to acknowledge user input
	 * Scanner class has a lot of inbuilt metods- next(), nextInt(), nextLong()    */
	
	public static void main(String [] args)  {
		
/* Create the Object of Scanner Class and you have to pass the System.in as the input
   parameter inside the Constructor  */
		
		
		 read = new Scanner(System.in);
		System.out.println("Enter name:");
		String  name= read.next();
		
		System.out.println("Enter gender:");
		// M or F  One entity means you can store it as a character
		
		char gender = read.next().charAt(0);
		
		System.out.println("Enter age:");
		 int age = read.nextInt();
		 
		 System.out.println("Enter phone number:");
		 long phoneNumber = read.nextLong();
		 
		 System.out.println("The name of the person is:"+ name);
		 System.out.println("The gender of the person is:"+ gender);
		 System.out.println("The age of the person is:"+ age);
		 System.out.println("The phoneNumber of the person is:"+ phoneNumber);
		 
		 
}

}
