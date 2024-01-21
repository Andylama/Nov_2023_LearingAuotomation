package com.java.Jan_18_2024_OOPS_Abstraction_AbstractClass_Injava_Day16;

public class PublicSchool extends Student {// This is the child Class named  PublicSchool.
	
	
	public void publicSchoolCourseCurriculum() {
		System.out.println("This is public's school course curriculum");
		
	}
//-------------------------------------------------------------
	public void prayerHall() {
		System.out.println("This is public's school prayerHall and Assembly");
	}
//-------------------------------------------------------------------
	@Override
	public void studentMarksheet() {
	System.out.println("Student's marksheet")	;
		
	}
	@Override
	public void studentPlayground() {
	System.out.println("Student's playground")	;
	}
	
}
