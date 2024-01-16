package com.java.Jan_15_2024_OOPs_Objects_Injava_Day15;

public class Student {
	
//------------------------------------------------------------	
	String name ;                     /* What is the default value of a String is  Null             */
	int age;                          /*  What is the default value of a int is  0                   */
	boolean promotion;	                 /*  What is the default value of a boolean is  false   */
	String classRoomEnrollment;
	String primarySubject ;
//-----------------------------------------------------	
	
	
	public Student(String name, int age, boolean promotion, String classRoomEnrollment,String primarySubject) {
	this.name = name;
	this.age = age;
	this.promotion = promotion;
	this.classRoomEnrollment = classRoomEnrollment;
	this.primarySubject = primarySubject;
	}	
	
//------------------------------------------------	
	public static void main (String[]args) {
		
/*	           Student student = new Student(); // Object has been created   */
/*             A contructor is invoked the moment Object is created .Employee() is the construtor.              */	
 Student student1 = new Student("Tom",10,true,"4B","Science");	
/*             You created the Object and passed the parameters(Student Infomation in the construtor
 *             But have you manually invoked the construtor yet ? NO                              */
  System.out.println(student1.name+"__"+student1.age+"__"+student1.promotion+"__"+student1.classRoomEnrollment+"__"+student1.primarySubject);	
  Student student2 = new Student("Hari",20,true,"5B","Science");	
  System.out.println(student2.name+"__"+student2.age+"__"+student2.promotion+"__"+student2.classRoomEnrollment+"__"+student2.primarySubject);	
}
}