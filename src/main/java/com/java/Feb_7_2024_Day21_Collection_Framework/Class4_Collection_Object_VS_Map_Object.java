package com.java.Feb_7_2024_Day21_Collection_Framework;

import java.util.ArrayList;
import java.util.HashMap;

public class Class4_Collection_Object_VS_Map_Object {
/*     Collection is an Interface.
 *     Map is also an Interface.        */
	
	
	public static void main(String[] args) {
		
		ArrayList aL = new ArrayList();
		aL.add(10);
		aL.add("Selenium");
		aL.add(true);
		aL.add('c');
		
		
		HashMap hm = new HashMap();
		hm.put(101, "Hari");
		hm.put(102, "Tina");
		hm.put(103, "Ronald");
	}
	
}
