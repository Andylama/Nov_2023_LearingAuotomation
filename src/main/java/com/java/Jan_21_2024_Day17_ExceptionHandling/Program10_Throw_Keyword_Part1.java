package com.java.Jan_21_2024_Day17_ExceptionHandling;
public class Program10_Throw_Keyword_Part1 {
/*     Cocepts :-
 *                                                            
 * 1.  Divide by Zero Method() will create an Exception Object and JVM will ask Divide by Zero Method()
       if it can handlde the Exception.
   2.  Divide by Zero Method()  will deny handling the Exception, so JVM will abruptly terminate Divide by Zero Method().                                                
   3.  Now JVM will ask the Main Method if it will be able to handle the Exception or not.
   4.  Main method ()  will also deny saying it can not hadle the Exception. So JVM will also terminate the main Method.
   5.  JVM but to transfer  this to Default Exception handler and Default Exception handler will print the Objects.
                                                     */
	
	
public static void main(String[] args) {
	
	
		
}
//----------------------------------------------------------	
public static void dividedByZero () {
int A= 10 , B= 0;
int Total = A/B ;
System.out.println(Total);
throw new ArithmeticException(); 
/* Here the Exception Object will be created but the twist is Progammer is creating it manually. 
 * throw Keyword is basically used for custom/user-defined Exceptions
 Note:-  Avoid usig ir for Pre-defined Exceptions.                                                                   */
}
//-----------------------------------------------------

}
