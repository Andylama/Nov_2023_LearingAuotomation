package com.java.Jan_21_2024_Day17_SpecialClasses;

import java.util.Scanner;

public class Scanner_Calculator {
	
	public static Scanner read;
	
	public static void main (String []args) {
	/*   I will give you two numbers and ADD, SUBSTRACT, MULTIPLE, DIVIDE                                      */
		
		
 read = new Scanner(System.in)	;
	
	System.out.println("Enter First Number:");
	int number1 = read.nextInt();
	
	System.out.println("Enter Second Number:");
	int number2 = read.nextInt();
	
	System.out.println("Select mathmatical operation:(+, -,*,/)	");
    String mathmaticalOperation =  read.next();

int result;
switch(mathmaticalOperation)  {
case "+" : result = number1 +number2;
System.out.println("The sum of two number is :"+result);
break;


case "-" : result = number1 - number2;
System.out.println("The difference of two number is :"+result);
break;


case "*" : result = number1 * number2;
System.out.println("The Multipiation   value of two number is :"+result);
break;


case "/" : result = number1 / number2;
System.out.println("The Division  value of two number is :"+result);
break;


default: System.out.println("Invalid mathmaticalOperation");
break;
}

	
	
	}

}
