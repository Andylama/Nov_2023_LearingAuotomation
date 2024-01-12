package com.TestNG.Jan_03_2024_Day10_TestNG_ExcelSheet_DaatProvider;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelCode {
// 0. Ads Poi Apache dependencie in pom.xml File.	
// 1. Create or	use the created Excel Sheet Which has the data.
// 2. Make sure the Sheet names are correct.
// 3. Copy the Excel sheet and put it inside the package where you want to keep your code.
// 4. Make sure the Exeel Sheet is updated, then only paste it as mentioned in point No: 3.
public static FileInputStream ip;
public static XSSFWorkbook workbook;
public static 	XSSFSheet sheet;

	@DataProvider()
    public Object[][] getTNExcelData() throws Exception {
	Object[][] data = ExcelCode.readFromExcelSheetTN("LOGINTN");
	return data;
}
 public static Object[][] readFromExcelSheetTN(String sheetName ) throws Exception  {  //Rule : 1
	 
	 
// 5. Create the Object of FileInputSream class and pass the path of the Excel sheet in its Construtor.	 //Rule :2 pass data row and Column
	  ip = new FileInputStream(System.getProperty("user.dir") +"\\src\\test\\java\\com\\TestNG\\Jan_03_2024_Day10_TestNG_ExcelSheet_DaatProvider\\ExcelData.xlsx");
// 6. Create the Object of XSSFWorkbook Class.                  
	  workbook = new XSSFWorkbook(ip);
// 7.Use the workbook refrence to address individual sheet.
       sheet = workbook.getSheet(sheetName);
   	
// 8.Identify the rowws and columns of the sheet.
   	int rows =    sheet.getLastRowNum();
   	int columns = sheet.getRow(0).getLastCellNum();
   	
 // 9.Create a 2-Dimensional Object Array and then return the Object Array.
   	//Declares a 2-dimensional object array named data to store the extracted data from the Excel sheet.
   	Object [][] data = new Object[rows][columns];
  
   	
   	//Starts a for loop that iterates through each row of the sheet, from row 0 to the last row. 	
   	for(int R =0;  R<rows ;    R++) {
   		
   	/*Retrieves the current row from the sheet using the getRow method. 
   	 Uses R + 1 because row indices in Excel start from 1, while in Java arrays they start from 0.*/	
   	XSSFRow row  =	sheet.getRow(R+1);
   	
   	//Starts a nested for loop that iterates through each cell within the current row, from column 0 to the last column.
   	for(int C=0;    C<columns ; C++) {
   		
   		
   	// Retrieves the cell at the current row and column using the getCell method.	
   	XSSFCell cell =    row.getCell(C);
   	
   	// Identifies the type of data stored in the cell (STRING, NUMERIC, BOOLEAN, etc.) using the getCellType method.
   	 CellType celltype = cell.getCellType();
   	
   	 switch(celltype) {
   	 case STRING:
   	 data[R][C] = cell.getStringCellValue();
   	 break ;
   	 
   	 case NUMERIC :
   		data[R][C] = Integer.toString((int)cell.getNumericCellValue());
   		break;
   		
   		
   	 case BOOLEAN:
   		data[R][C] = cell.getBooleanCellValue();
   		break;
   		
 }
 }  	
}   	
   	return data;
 }  
 
 
 //-----------------------------------
 @DataProvider
 public Object[][] getTNExcelLoginData() throws Exception {
	Object[][] data = ExcelCode.readFromExcelSheetTNRegister("RegisterTN");
	return data;
}
	

public static Object[][] readFromExcelSheetTNRegister(String sheetName ) throws Exception  {  //Rule : 1
	 
	 
//5. Create the Object of FileInputSream class and pass the path of the Excel sheet in its Construtor.	 //Rule :2 pass data row and Column
	  ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\TestNG\\Jan_03_2024_Day10_TestNG_ExcelSheet_DaatProvider\\ExcelData.xlsx ") ;
//6. Create the Object of XSSFWorkbook Class.                  
	  workbook = new XSSFWorkbook(ip);
	 
//7.Use the workbook refrence to address individual sheet.
    sheet = workbook.getSheet(sheetName);
	
//8.Identify the rowws and columns of the sheet.
	int rows =    sheet.getLastRowNum();
	int columns = sheet.getRow(0).getLastCellNum();
	
// 9.Create a 2-Dimensional Object Array and then return the Object Array.
	//Declares a 2-dimensional object array named data to store the extracted data from the Excel sheet.
	Object [][] data = new Object[rows][columns];

	
	//Starts a for loop that iterates through each row of the sheet, from row 0 to the last row. 	
	for(int R =0;  R<rows ;    R++) {
		
	/*Retrieves the current row from the sheet using the getRow method. 
	 Uses R + 1 because row indices in Excel start from 1, while in Java arrays they start from 0.*/	
	XSSFRow row  =	sheet.getRow(R+1);
	
	//Starts a nested for loop that iterates through each cell within the current row, from column 0 to the last column.
	for(int C=0;    C<columns ; C++) {
		
		
	// Retrieves the cell at the current row and column using the getCell method.	
	XSSFCell cell =    row.getCell(C);
	
	// Identifies the type of data stored in the cell (STRING, NUMERIC, BOOLEAN, etc.) using the getCellType method.
	 CellType celltype = cell.getCellType();
	
	 switch(celltype) {
	 case STRING:
	 data[R][C] = cell.getStringCellValue();
	 break ;
	 
	 case NUMERIC :
		data[R][C] = Integer.toString((int)cell.getNumericCellValue());
		break;
		
		
	 case BOOLEAN:
		data[R][C] = cell.getBooleanCellValue();
		break;
		
}
}  	
}   	
	return data;
	
}	


 //------------------------------------
 
	@DataProvider
	 public Object[][] getRediffExcelLoginData() throws Exception {
		Object[][] data = ExcelCode.readFromExcelSheetRediffLogin("LoginRediff");
		return data;
	}
		

	public static Object[][] readFromExcelSheetRediffLogin(String sheetName ) throws Exception  {  //Rule : 1
		 
		 
	//5. Create the Object of FileInputSream class and pass the path of the Excel sheet in its Construtor.	 //Rule :2 pass data row and Column
		  ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\TestNG\\Jan_03_2024_Day10_TestNG_ExcelSheet_DaatProvider\\ExcelData.xlsx ") ;
	//6. Create the Object of XSSFWorkbook Class.                  
		  workbook = new XSSFWorkbook(ip);
		 
	//7.Use the workbook refrence to address individual sheet.
	    sheet = workbook.getSheet(sheetName);
		
	//8.Identify the rowws and columns of the sheet.
		int rows =    sheet.getLastRowNum();
		int columns = sheet.getRow(0).getLastCellNum();
		
	// 9.Create a 2-Dimensional Object Array and then return the Object Array.
		//Declares a 2-dimensional object array named data to store the extracted data from the Excel sheet.
		Object [][] data = new Object[rows][columns];

		
		//Starts a for loop that iterates through each row of the sheet, from row 0 to the last row. 	
		for(int R =0;  R<rows ;    R++) {
			
		/*Retrieves the current row from the sheet using the getRow method. 
		 Uses R + 1 because row indices in Excel start from 1, while in Java arrays they start from 0.*/	
		XSSFRow row  =	sheet.getRow(R+1);
		
		//Starts a nested for loop that iterates through each cell within the current row, from column 0 to the last column.
		for(int C=0;    C<columns ; C++) {
			
			
		// Retrieves the cell at the current row and column using the getCell method.	
		XSSFCell cell =    row.getCell(C);
		
		// Identifies the type of data stored in the cell (STRING, NUMERIC, BOOLEAN, etc.) using the getCellType method.
		 CellType celltype = cell.getCellType();
		
		 switch(celltype) {
		 case STRING:
		 data[R][C] = cell.getStringCellValue();
		 break ;
		 
		 case NUMERIC :
			data[R][C] = Integer.toString((int)cell.getNumericCellValue());
			break;
			
			
		 case BOOLEAN:
			data[R][C] = cell.getBooleanCellValue();
			break;
			
	}
	}  	
	}   	
		return data;
		
 } 	
}