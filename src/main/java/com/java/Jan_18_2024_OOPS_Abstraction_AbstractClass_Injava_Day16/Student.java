package com.java.Jan_18_2024_OOPS_Abstraction_AbstractClass_Injava_Day16;

public  abstract class Student {// This is the Parent class named Student
	
	String name;
	int age;
	
	
	/* This is unimplemented Method without creating body because to hide logic.	*/
	
	
	
	public  abstract void studentMarksheet();
	
	public abstract void studentPlayground();

		
	public void studentLibrary() {
	System.out.println("This is a concrete or simple or normal or regular Method of Parent class");
	}

}
