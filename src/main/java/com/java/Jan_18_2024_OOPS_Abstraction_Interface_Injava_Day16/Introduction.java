package com.java.Jan_18_2024_OOPS_Abstraction_Interface_Injava_Day16;

public interface Introduction {
	public static final int i =10;
	public static final String name = "john";
	
	public abstract void display();
	public abstract void display1();
	public abstract void display2();
	public abstract void display3();
	
	
	default void Check()        {// This is default concrete Method.
}
	private void Check1()       {// This is private concrete Method.
}
    public static void Check2() {// This is public static concrete Method.
}
}