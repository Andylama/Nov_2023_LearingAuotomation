package com.java.Jan_21_2024_Day17_ExceptionHandling;

import java.util.Scanner;

public class Program11_Scenario_Part2_Voting {

	public static void main(String[] args) {
	Scanner	 scan = new Scanner (System.in);
		System.out.println("Enter age :");
		
    try {
		int age = scan.nextInt();
		    
		if (age < 18)   {
			throw new Program11_Scenario_Part1("Not eligible for voting");
		}else {
			System.out.println("Eligible for voting");
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
