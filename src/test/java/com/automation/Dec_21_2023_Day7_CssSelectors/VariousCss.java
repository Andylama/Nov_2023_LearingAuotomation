package com.automation.Dec_21_2023_Day7_CssSelectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousCss {
public static void main(String[] args) throws InterruptedException              {
	
	//          rediffLoginAndLogout () ;
	 //             TnLoginAndLogout () ;
    //  TnRegisterAndAcknowledgement () ;
	                  TncartCheckout () ;
}
//------------------------------------------------------------------------------------
        public static void rediffLoginAndLogout ()    { //CSS Selector
	    WebDriver driver = new ChromeDriver (); 
		driver.manage().window().maximize();
		driver.get("https://rediff.com");  
		driver.findElement(By.cssSelector("a.signin")).click();
		driver.findElement(By.cssSelector("input#login1")).sendKeys("Seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		driver.findElement(By.cssSelector("a.rd_logout")).click();
	
}
//----------------------------------------------------------------------------------
       public static void TnLoginAndLogout ()               {
	   WebDriver driver = new ChromeDriver (); 
	   driver.manage().window().maximize();
	   driver.get("https://tutorialsninja.com/demo/");  
	   driver.findElement(By.cssSelector(" div#top-links>ul>li.dropdown>a")).click();
	   driver.findElement(By.cssSelector(" div#top-links>ul>li.dropdown>ul>li:nth-child(2)>a")).click();
	   driver.findElement(By.cssSelector("input#input-email")).sendKeys("  seleniumpanda26@gmail.com");
	   driver.findElement(By.cssSelector("input#input-password")).sendKeys(" Selenium@123");
	   driver.findElement(By.cssSelector(" input.btn.btn-primary")).click();
	
	
}
//---------------------------------------------------------------------------------
        public static void TnRegisterAndAcknowledgement ()   {
    	WebDriver driver = new ChromeDriver (); 
    	driver.manage().window().maximize();
    	driver.get("https://tutorialsninja.com/demo/");  
    	driver.findElement(By.cssSelector(" div#top-links>ul>li.dropdown>a")).click();
    	driver.findElement(By.cssSelector("	div#top-links>ul>li.dropdown>ul>li:nth-child(1)")).click();
    	driver.findElement(By.cssSelector(" input#input-firstname")).sendKeys("Automation");
     	driver.findElement(By.cssSelector(" input#input-lastname")).sendKeys(" Lama");
     	driver.findElement(By.cssSelector(" input#input-email")).sendKeys(" Automationlama@myyahoo.com");
        driver.findElement(By.cssSelector(" input#input-telephone")).sendKeys(" 1234567890");
        driver.findElement(By.cssSelector(" input#input-password")).sendKeys("Selenium");
        driver.findElement(By.cssSelector(" input#input-confirm")).sendKeys("Selenium");
        driver.findElement(By.cssSelector(" fieldset#account+fieldset+fieldset>div>div>label:nth-child(1)>input\r\n"
        		+ "  ")).click();
    	driver.findElement(By.cssSelector("input[name=agree] ")).click();
    	driver.findElement(By.cssSelector("input.btn.btn-primary ")).click();  
       	
 }
//-------------------------------------------------------------------------------------	
        public static void TncartCheckout () throws InterruptedException   {
        	WebDriver driver = new ChromeDriver (); 
        	driver.manage().window().maximize();
        	driver.get("https://tutorialsninja.com/demo/");  
        	driver.findElement(By.cssSelector("input.form-control.input-lg ")).sendKeys("HP");
        	driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg ")).click();
        	driver.findElement(By.cssSelector(" div.caption>h4>a")).click();
        	driver.findElement(By.cssSelector("button#button-cart")).click();
        	driver.findElement(By.cssSelector("span#cart-total  ")).click(); 
            Thread.sleep(2000);
        	driver.findElement(By.cssSelector("p.text-right>a:nth-child(1) ")).click();
        	driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
        	 Thread.sleep(2000);
        	driver.findElement(By.cssSelector("input#input-email ")).sendKeys(" Automationlama@myyahoo.com");
        	driver.findElement(By.cssSelector(" input#input-password")).sendKeys("Selenium");
        	Thread.sleep(2000);
            driver.findElement(By.cssSelector("input#button-login ")).click(); 
            driver.findElement(By.cssSelector(" a.btn.btn-primary")).click();   
     
        }

       
//------------------------------------------------------------------------------------
}