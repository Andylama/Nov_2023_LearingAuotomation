package com.java.Jan_21_2024_Day17_ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class Program13_throws_Keyword_In_Java {
public static void main(String[]args) throws FileNotFoundException {
	findingFile();	
}
/*  throws keyword gives an indicator to caller method that the method you are calling
    has an Exception and it could not handle it so it is your job now to handle that Exception.
    You can use throws keyword or else surround that method with try-catch block.                          */

//---------------------------------------------------
public static void findingFile() throws FileNotFoundException {
	FileInputStream ip = new FileInputStream("C:\\Users\\andyl\\Desktop\\abc.txt");
	
}
}
