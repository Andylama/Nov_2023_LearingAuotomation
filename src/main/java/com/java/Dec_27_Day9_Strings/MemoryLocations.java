package com.java.Dec_27_Day9_Strings;

public class MemoryLocations {

	public static void main(String[] args) {
		
		// In Java there are 5 Memory locations.
		// 1. Heap Memory.
		// 2.Stack Memory.
		// 3. Pc Register
		// 4. Method area
		// 5. Native Method area.
		
// What is Java ? :- It is an Object Oriented Programming Language.
// Objects are physical entities so they occupy memory.
// One of the  way to create object in java is by the help of new keyword.
		
	MemoryLocations Point  = new MemoryLocations(); 
	// new MemoryLocations():----- is the Object here in Java.
	// Point :---------------is the refrence of Object hrer in Java.
	// MemoryLocations ;-----------is the class here in Java.
	
	
	String S1 = "Helloworld"; // String Literal Pool or Sting Constant Pool.
	String S2 = new String(" Ocean is blue");
	
	}

}
