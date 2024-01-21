package com.java.Jan_17_2024_OOPs_Inheritance_Injava_Day16;

public class TestExecution {

	public static void main(String[] args) {
	/*    I will create the Object of the Child class.                     */	
		Child child = new Child ();
		child.superBike();
		child.superCar();
	    child.bankBalance();
	    child.farmHouse();
	    child.polticalOffice();
	    child.creditUnion();
	    
	    Child_No_2 child2 = new Child_No_2();
	    
	    child2.guitar();
	    child2.bar();
	    child2.bankBalance();
	    child2.farmHouse();
	    child2.polticalOffice();
	    child2.creditUnion();
	    

  /*    I will create the Object of the Parent class.                     */	
	    
	Parent parent = new Parent();
	parent.bankBalance();
	parent.farmHouse();
    parent.creditUnion();
    parent.polticalOffice();
   
	}
	
}
