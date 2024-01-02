package com.java.Dec_3_2023_Day3_BasicofJava;

    public class Operations_In_Java {
	public static void main(String[] args) {
		
		ArithmeticOperators();
		AssignmentOperators();
		
		}

	   public static void ArithmeticOperators() {        
		
		//Addition +
		int x =1 ;
		int y = 2 ;
		System.out.println("The Addition of x + y is :"+(x+y));	//Syso + Ctrl + Spacebar
		 
		// Subtraction -
		// Multiplication *
		// Division /
		// Modulus %  Modulus (also known as remainder) is the result of dividing one number (dividend) by another number (divisor) and keeping only the leftover amount.
			
		int a = 56 ;
		int b = 11 ;
		System.out.println ("The Modulus of a%b is ; " +(a % b));
		// Increment
		// Decrement
				
	}	
	
	 public static void AssignmentOperators() {   
       	
		 // += 		 x + =  3     this   means  x =  x + 3 ;
		 // - =       x - =  3    this   means  x =  x - 3 ;
		  // *=      x*  =  3     this   means  x =  x * 3 ;
		 // / =       x / =  3    this   means  x =  x / 3 ;
		 // % =      x % =  3     this   means  x  = x % 3 ;
		 // & =      x & =  3     this   means  x =  x & 3 ;
		 // ! =
		 //^   =
		 // >> =
		 // << =
		  
		 int x = 10;
	     x += 5; // Add 5 to x
	     System.out.println("x after adding 5: " + x);
	            
			 }
	 
	 public static void comparisonOperators() {   
		//   ==:  Equal to
		//	 !=:  Not equal to
		//	 <:   Less than
		//	 <=:  Less than or equal to
		//	 >:   Greater than
		//	 >=:  Greater than or equal to
			 		 
	 }
	 
	 public static void LogicalOperators() {     
		 // Logical AND (&&): Returns true only if both operands are true.
		//  Logical OR (||): Returns true if at least one operand is true.
		// Logical NOT (!): Inverts the truth value of the operand. 
		 	
	 }
	 
	 public static void BitwiseOperators() { 
		 
		// Bitwise AND (&): Performs AND operation on corresponding bits.
		// Bitwise OR (|): Performs OR operation on corresponding bits.
		// Bitwise XOR (^): Performs XOR operation on corresponding bits.
		// Bitwise NOT (~): Inverts all bits in the operand.
		// Left Shift (<<): Shifts bits left by a specified number of positions.
		// Right Shift (>>): Shifts bits right by a specified number of positions.
		 
	 }
	
     }
