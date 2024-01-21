package com.java.Jan_18_2024_OOPS_Abstraction_AbstractClass_Injava_Day16;

public class PrivateSchool extends Student {// This is another child class named PrivateSchool
	
public static void main(String[]args) {
	
	
	PrivateSchool ps = new PrivateSchool ();	
	System.out.println(ps.age=20);
	System.out.println(ps.name= "Ram");
	
	
/*   In Abstraction :  You can not create the Object of the Abstract(Parent) Class directly.  
     But  indirectly we will use the Abstract(Parent) class to refer the Object of Child Class.                                         */	
	
    Student ref = new PrivateSchool ();	
            ref.studentMarksheet();
            ref.studentPlayground();
            ref.studentLibrary();
   /*  *  Student is the Abstract(Parent) Class.
       *  ref is the Reference.
       *  new PrivateSchool() is the Object of Child Class. 
       *  A parent class reference is pointing towards the object of Child Class.                                 */       
            
}

	public void privateSchoolCourseCurriculum() {
		System.out.println("This is private's school course curriculum");
		
	}
//-------------------------------------------------------------
	public void privateSchoolHallAssembly() {
		System.out.println("This is private's school prayerHall and Assembly");
	}
//-------------------------------------------------------------------		

@Override
public void studentMarksheet() {
	System.out.println("Write your own logic in here child class because you are overriding the Method of Parent class");
}

@Override
public void studentPlayground() {
	System.out.println("Write your own logic  in here child clas because you are overriding the Method of Parent class");	
	
}
		
	}


