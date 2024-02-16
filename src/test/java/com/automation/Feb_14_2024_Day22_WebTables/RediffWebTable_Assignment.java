package com.automation.Feb_14_2024_Day22_WebTables;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RediffWebTable_Assignment {
    public WebDriver driver;
    public ChromeOptions options;
    public WebDriverWait wait;
    
    @BeforeMethod
    public void LaunchWebsite() {
        // Set up Chrome options
        options = new ChromeOptions();
        
        // Maximize the browser window when it starts
        options.addArguments("--start-maximized");
        
        // Disable browser notifications
        options.addArguments("--disable-notifications");
        
        // Initialize the ChromeDriver with the specified options
        driver = new ChromeDriver(options);
        
        // Open the Rediff Money Gainers page
        driver.get("https://money.rediff.com/gainers");
        
        
        
    }
    
    @Test
    public void PrintTotalcompanylisted() {
    	/*            Please print Total No  listed companies ?                           */
    	
        // Find all elements in the first column (company names) of the table
        List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));

        // Print only the total number of company names
        int totalCompanyNames = companyNames.size();
        System.out.println("Total number of company names:-------------> " + totalCompanyNames);
    }	
    
    
    @Test
    
    public void PrintTotalcurrentPrice() {
        /* Please print Total No listed current price ? */

        // Find all elements in the fourth column (current prices) of the table
        List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));

        // Print only the total number of currentPrices
        int totalCurrentPrices = currentPrices.size();
        System.out.println("Total number of currentPrices:-----------> " + totalCurrentPrices);
    }

    
    @Test
    public void printAllCompanyNames_WithforEachloop() {
   	/*            Please print all names the companies listed ?                           */
    	    	
            // Find all elements in the first column (company names) of the table
            List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));

            // Iterate through the list of company names and print each one
            for (WebElement companyNameElement : companyNames) {
                String companyName = companyNameElement.getText();
                System.out.println("Company Name:-----------> " + companyName);
            }
        }	
    @Test
    public void PrintAllCompanyNames_WithForLoop() {
        /* Print all names of the companies listed */

        // Find all elements in the first column (company names) of the table
        List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));

        // Iterate through the list of company names and print each one
        for (int i = 0; i < companyNames.size(); i++) {
            // Get the text of the current company name element
            String companyName = companyNames.get(i).getText();
            
            // Print the current company name
            System.out.println("Company Name: " + companyName);
        }
    }

    @Test
    public void Print_Name_and_CurrentPrice() {
        /* Please print  both Company Name and their corresponding Current Prices */

        // Find all elements in the first column (company names) of the table
        List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));

        // Find all elements in the fourth column (current prices) of the table
        List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));

        // Iterate through the list of company names and print each one along with its corresponding current price
        for (int i = 0; i < companyNames.size(); i++) {
            String companyName = companyNames.get(i).getText();
            String currentPrice = currentPrices.get(i).getText();
            System.out.println("Company Name:------> " + companyName + " Current Price:------> " + currentPrice);
        }
    }
    @Test
    public void Print_Rownumber_Name_and_CurrentPrice() {
        /* Please print both Company Name and their corresponding Current Prices */

        // Find all elements in the first column (company names) of the table
        List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));

        // Find all elements in the fourth column (current prices) of the table
        List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));

        // Iterate through the list of company names and print each one along with its corresponding current price and row number
        for (int i = 0; i < companyNames.size(); i++) {
            // Increment the row number
            int rowNumber = i + 1;

            String companyName = companyNames.get(i).getText();
            String currentPrice = currentPrices.get(i).getText();

            // Print the row number, Company Name, and Current Price
            System.out.println("Row: " + rowNumber + " Company Name:------> " + companyName + " Current Price:------> " + currentPrice);
        }
    }


    @Test
    public void Assignment5() {
        /* Please find the current Price (Rs of "Modern Steels" Company ?
           Answer should be RS 19.60 Please show in Automation.                       */
    	
    	// Company name to search for
        String companyName = "Modern Steels";
        
        // Find all elements in the first column (company names) of the table
        List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
        
        // Find all elements in the fourth column (current prices) of the table
        List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));

        // Iterate through each row in the table
        for (int i = 0; i < companyNames.size(); i++) {
            // Check if the current row's company name matches the target company name
            if (companyName.equals(companyNames.get(i).getText())) {
                // Print the company name and its corresponding current price
                System.out.println(companyNames.get(i).getText() + "------->" + currentPrices.get(i).getText());
                break;
                // Break out of the loop after finding the target company (assuming unique company names)
        }   
        
        }}
    
    @Test
    
    
    public void findPriceOfCompanyIn10thRow() {
        /* Find the current Price of the company present in the 10th Row */

        // Assuming the company names are in the first column and current prices in the fourth column
        String xpathCompanyName = "//table[@class='dataTable']/tbody/tr[10]/td[1]";
        String xpathCurrentPrice = "//table[@class='dataTable']/tbody/tr[10]/td[4]";

        // Find the elements representing the 2000th row of company name and current price
        WebElement companyNameIn2000thRow = driver.findElement(By.xpath(xpathCompanyName));
        WebElement currentPriceIn2000thRow = driver.findElement(By.xpath(xpathCurrentPrice));

        // Get the text of the company name and current price in the 2000th row
        String companyName = companyNameIn2000thRow.getText();
        String currentPrice = currentPriceIn2000thRow.getText();

        // Print the row number, company name, and current price
       
        System.out.println("Company Name in 10th Row: " + companyName);
        System.out.println("Current Price in 10th Row: " + currentPrice);
    }
    @Test
    public void FindPriceOfCompanyIn_the_Specefic_Row() {
        /* Find the current Price of the company present in the specefic Row */
    	// Find the index of the company present in the Specefic row
          	    	
    	 int rowNumber =7;  
    	 
    	// Adjust the index accordingly based on your needs
        // Assuming the company names are in the first column and current prices in the fourth column
    	 
        String xpathCompanyName = "//table[@class='dataTable']/tbody/tr/td[1]";
        String xpathCurrentPrice = "//table[@class='dataTable']/tbody/tr/td[4]";

        // Find all elements representing the company names and current prices
        List<WebElement> companyNames = driver.findElements(By.xpath(xpathCompanyName));
        List<WebElement> currentPrices = driver.findElements(By.xpath(xpathCurrentPrice));

        
     // Check if the index is within the bounds of the lists
     // Check if the specified rowNumber is non-negative and within the bounds of both companyNames and currentPrices lists
        if (rowNumber >= 0 && rowNumber < companyNames.size() && rowNumber < currentPrices.size()) {
 
            // Get the text of the company name and current price at the specified row index when row index is valid
            String companyName = companyNames.get(rowNumber).getText();
            String currentPrice = currentPrices.get(rowNumber).getText();

            // Print the row number, company name, and current price
            System.out.println("Row Number: " + (rowNumber + 1));  // Adding 1 to convert from zero-based index
            System.out.println("Company Name in " + (rowNumber + 1) + "th Row: " + companyName);
            System.out.println("Current Price in " + (rowNumber + 1) + "th Row: " + currentPrice);
        } else {
            System.out.println("Row Number " + (rowNumber + 1) + " is out of bounds.");
        }
    }

    @Test
    public void FindPriceOfCompanyIn_the_Particular_Row() {
        // Find all elements in the first column (company names) of the table
        List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));

        // Find all elements in the fourth column (current prices) of the table
        List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));

        // Check if there are at least 15 rows in the table
        if (companyNames.size() >= 15 && currentPrices.size() >= 15) {
            // Get the company name and current price of the 15th row
            String fifteenthCompanyName = companyNames.get(14).getText();
            String fifteenthCurrentPrice = currentPrices.get(14).getText();

            // Print the company name and its corresponding current price
            System.out.println("Company Name (15th Row): " + fifteenthCompanyName);
            System.out.println("Current Price (15th Row): " + fifteenthCurrentPrice);
        } else {
            System.out.println("The table does not have at least 15 rows.");
        }
    }

    	
    
    
    
    @Test
    public void Assignment6() {
    
    	
    	
    	
    }
   
    @Test
    
    public void Assignment7() {
    	/* Print 5 rows of the webtable with the company name and all the values associated with it ?  */	
   
    	List<WebElement> First5rows = driver.findElements(By.xpath("//table[@class ='dataTable']/tbody/tr[position()>0 and position()<=5]"));   
    
       for(int i= 0 ; i<First5rows.size(); i++) {
    	   System.out.println(First5rows.get(i).getText());
       }
    }
    @Test
    public void Assignment8() {
        // Company names to search for
        String[] CompanyNamesToPrint = {"Modern Steels", "BMW Industries", "Kovai Medical", "Tinna Trade", "Cranex Ltd"};

        // Find all elements in the first column (company names) of the table
        List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));

        // Find all elements in the fourth column (current prices) of the table
        List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));

        // Iterate through each row in the table
        for (int i = 0; i < companyNames.size(); i++) {
            // Check if the current row's company name is one of the target company names
            for (String targetCompanyName : CompanyNamesToPrint ) {
                if (targetCompanyName.equals(companyNames.get(i).getText())) {
                    // Print the company name and its corresponding current price
                    System.out.println(companyNames.get(i).getText() + "------->" + currentPrices.get(i).getText());
                    break; // Break out of the inner loop once a match is found
                }
            }
        }
    }

    
    @ AfterMethod
    
    public void TearDown() {
        //  closing the browser
        driver.quit();
    }
    }
