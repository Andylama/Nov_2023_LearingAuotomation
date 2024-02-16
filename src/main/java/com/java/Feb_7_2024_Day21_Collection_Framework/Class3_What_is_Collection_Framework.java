package com.java.Feb_7_2024_Day21_Collection_Framework;

import java.util.ArrayList;
import java.util.HashSet;

public class Class3_What_is_Collection_Framework {

	
		
/*     Collection: is a pre-defined interface.
 *     Collection : (as a genereal understand in java) is a single entity or an object which can store multiple data
 *     Framework: represents a library.
 *     Collection Framework: It is a set of pre defined Classes and Methhods which is used to store multiple data
 *     
 *     Collection Framwork contains 2 Main packages:
 *     1. Java.util.Collection:  we can store the data directly.
 *     2. Java.util.Map: We store the data in Key Value Pair.
 *                           */
		
		


		
	public static void main(String[] args) {
		
		ArrayList aL = new ArrayList();
		aL.add(10);
		aL.add("Selenium");
		aL.add(true);
		aL.add('c');
		
				HashSet Hs = new HashSet();
		Hs.add("Python");
		Hs.add("false");
		Hs.add(20);
		Hs.add('d');
		
		/*	aL and Hs both are collection Objects which are storing objects it self.
		 * 
		 *  What is the difference between the two Collection Objects?
		 *  Objects have different properties. Internally working principle is different 
		 *  This is the most important aspect in interviews.                   */
	}
}
