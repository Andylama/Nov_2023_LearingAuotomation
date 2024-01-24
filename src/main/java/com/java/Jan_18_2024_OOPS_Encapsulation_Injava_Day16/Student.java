package com.java.Jan_18_2024_OOPS_Encapsulation_Injava_Day16;


/*  Steps to acheive Encapsulation:
    1. Declare the variables private to hide the data
    2. Provide public setter and getter Methods to modify and view the data     */

public class Student {
	
	private String teacher_name;  // data hiding
	private int teacher_age;     // data hiding
	
	
	public void setData(String name, int age) {
	this .teacher_name= name;
	this .teacher_age = age;
	

}
	public String getData1() {
	return teacher_name;
		
}
	
	
	public int getData2()    {
	return teacher_age;
}
}