package com.TestNG.Jan_25_2024_Day18_TestNG_Groups;

import org.testng.annotations.Test;

/*   Learning from School, Home, PNT:-  we can only show you maximum 5-6 Test Cases.
 *   But in Realtime Project there might be 500, 600, 2000 Test cases in order to run those Test cases
 *   Seggerate them divide in multiple groups .
 *   
 *   Groups :
 *   How to create Groups :
 *   Execute Groups:
 *   Meta Groups: Example you want to define TestCases which will run everynight. overnight Test Cases
 *   Regular Expressions:
 *   Groups at a Class level:
 *              
 *               
 *               */

@Test (groups = "CompleteClassLevelGroup")
public class Groups {

//------------------------------------------------------	
@Test (groups = {"Smoke"})	
public void TestCase1() {
System.out.println("This is Test Case T1 Logic");

}
//-------------------------------------------------------
@Test 	(groups = {"Smoke","Sanity"})	
public void TestCase2() {
System.out.println("This is Test Case T2 Logic");

}
//-------------------------------------------------------
@Test 	(groups = {"Smoke","Sanity","Regression"})	
public void TestCase3() {
System.out.println("This is Test Case T3 Logic");

}
//-------------------------------------------------------
@Test (groups = {"Windows.Sanity"})		
public void TestCase4() {
System.out.println("This is Test Case T4 Logic");

}
//-------------------------------------------------------
@Test 	(groups = {"macOS.Regression"})	
public void TestCase5() {
System.out.println("This is Test Case T5 Logic");

}
//-------------------------------------------------------

}
