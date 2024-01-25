package com.java.Dec_30_2023_Day9_SpecialClasses_Date_Class;

import java.util.Date;

public class Util {

	public static String emailWithDateTimeStamp() {
		Date date = new Date();
		System.out.println(date);	
		String emailTimeStamp = date.toString().replace(" ","_").replace(":","_");
		System.out.println(emailTimeStamp);
		return "Seleniumpanda"+emailTimeStamp+"@gmail.com";
}

}
