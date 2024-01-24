package com.java.Jan_21_2024_Day17_ExceptionHandling;
public class Program8_Final_VS_Finally_Finalize {

	/*  >>> Final is  a keyword
	 *  >>> Finally is also a keyword but it can not be used without a block
	 *  >>> Finalize() is a Mehtod
	 *  
	 *  Once Final is used for a variable the value of variable can not be changed because it is 
	 *  already declared.
	 *  Final can be used with variable, Method and Class.  
	 *  Final Method can not be over-ridden.
	 *  Finally block can be used with try block or try- catch block.              
	 *  Finally block mostly holds cleanup code.                   
	 *      
	 >>>> Finalize() Method :-  <<<<<<<
	 * It is used for overiding an Object.
	 * This Method can be overriden.
	 * Executes just befor Garbage Collection.
	 * If any object is about deleted, and if there is some resources related to that Object is open,
	 * then the code inside finalize() Method will close the resources. 
	 * So technically fianlize() Method also does the clean up Job.                   */
	
	
public static void main(String[] args) {
final int A = 10; //Once Final is used for a variable the value of variable can not be changed.
System.out.println("The value of A is: " + A); // Using the variable A to print its value   
}

//-------------------------------------------------------------
public static final void show() {
System.out.println("This is show Method which is final");
}

//------------------------------------------------------------
protected void fianlize() throws Throwable {
/* * It is used for overiding an Object.
	 * This Method can be overriden.
	 * Executes just befor Garbage Collection.
	 * If any object is about deleted, and if there is some resources related to that Object is open,
	 * then the code inside finalize() Method will close the resources. 
	 * So technically fianlize() Method also does the clean up Job.            */	
}

//----------------------------------------------------------------------------------------

}
