package com.java.Feb_7_2024_Day21_Collection_Framework;

import java.util.ArrayList;

public class Class_2_Arrays_VS_CollectionFramework {
	
	public static void main (String[]args) {
		
	}

	
	/* Difference No:1 :
	 1.Array can store  both primitive and non-primitive type of Data.
	 1.Collection Framework can only store non-primitive type of Data.
	 
	 *                  */
	
	public static void difference1() {
		int[] a = {1,2,3,4,5};
		
		Class_2_Arrays_VS_CollectionFramework  obj1 = new Class_2_Arrays_VS_CollectionFramework ();	
		Class_2_Arrays_VS_CollectionFramework  obj2 = new Class_2_Arrays_VS_CollectionFramework ();
		Class_2_Arrays_VS_CollectionFramework  obj3 = new Class_2_Arrays_VS_CollectionFramework ();
		Class_2_Arrays_VS_CollectionFramework  obj4 = new Class_2_Arrays_VS_CollectionFramework ();
		Class_2_Arrays_VS_CollectionFramework  obj5 = new Class_2_Arrays_VS_CollectionFramework ();
		
		Class_2_Arrays_VS_CollectionFramework  []  ref = { obj1,obj2,obj3,obj4,obj5};
		
		
		ArrayList  a1 = new ArrayList();
		a1.add(10); //10 is an Integer object
		a1.add("java");
		a1.add('c');
		a1.add(obj1);
		
}
	/* Difference No:2 :
		 1.Array can store  only homogenous type of Data  expecting in some cases like int as it can
		   be typecasted automatically.
		1.Collection Framework can store haterogeneous type of data.
		 
		 *                  */	
	
	
	public static void difference2() {
		
		int []a = {1,2,3,4,5};
		
		int []a1 = {1,2,'c',3,4,5};
		
		boolean []b1= {true, false, 1<2, 2>4};
		
		Class_2_Arrays_VS_CollectionFramework  obj5 = new Class_2_Arrays_VS_CollectionFramework ();
		ArrayList  a2 = new ArrayList();
		a2.add(10); //10 is an Integer object
		a2.add("java");
		a2.add('c');
		a2.add(obj5);
		
		
		
	}
	/* Difference No:3 :
	 1.Array size is fixed. we can not change size of array during runtime .
	1.Collection Framework can Change the size of collection framework entities during runtime.
	 
	 *                  */		
	
	/* Difference No:4 :
	 1.Arrays are inbuilt features of java so Algorithms have to developed by the developer .
	 1.Collection Framework is an API which means there are already pre defined classes and interfaces
	    and Methods inside the API. We can directly use it.
	 
	 *                  */
	
}