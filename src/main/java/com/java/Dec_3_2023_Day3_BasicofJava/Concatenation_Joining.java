package com.java.Dec_3_2023_Day3_BasicofJava;
public class Concatenation_Joining {

public static void main(String[] args) {
	// + symbol represents concatenation or joining
	int a = 10;
	int b = 20 ;
	System.out.println(a+b);
	String  s1 = "Hello";
	String  s2 = "World";
	System.out.println(a+b+s1+s2);
	System.out.println(s1+a+b+s2);
	// s1 + a = Hello10
	// s1+a+b = Hello10 + 20 = Hello1020
	// Hello1020 + World = Hello1020World
	
	//String assignment = " ThisyeartherewasverylesssnowinVirginia";//
	
	//This  year there was very less snow in Virginia
	System.out.println("This"+ " "+"year"+ " "+ "there" + " "+"was"+ " "+ "very"+ ""+"less"+ "snow" +" "+ "verginia.");
		
	}

}
