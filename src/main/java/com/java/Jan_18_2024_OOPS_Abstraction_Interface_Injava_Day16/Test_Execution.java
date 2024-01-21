package com.java.Jan_18_2024_OOPS_Abstraction_Interface_Injava_Day16;

public class Test_Execution  extends SecretMoney implements  Introduction,Conclusion{
	
	public static void main(String[]args) {
/*   Interface is pure 100% Abstract than Abstract Clas. So  We can not create the Object of  both Interface and Abstract Class                         */		
		
		
		Introduction intro = new Test_Execution();
		intro.display1();
		intro.display();
		
	
		
		
	}

	@Override
	public void display() {
		System.out.println(name);	
	}	
		

	@Override
	public void display1() {
		System.out.println("This is the display1  Method overriding of introduction interface");
		
	}

	
	@Override
	public void display2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tearDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tearDown1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tearDown2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void blackMoney() {
		// TODO Auto-generated method stub
		
	}

}
