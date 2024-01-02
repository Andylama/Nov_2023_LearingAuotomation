package com.java.Dec_27_Day9_Strings;

public class PasswordProtection {

	public static void main(String[] args) {
// Will you save your password in a Char Array or will you save your password in String.
	
		String S1 = new String("Secret")	;
		System.out.println("The retrived value of password is:" + S1);
		
	
//	Char Array is more safe to store password because you can not retrieve password.
		char S2 [] = {'p','a','s','s','w','o','r','d'} ;
		System.out.println("The retrived value of password is:" + S2);
	

	}

}
