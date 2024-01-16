package com.TestNG.Jan_13_Day14_TestNG_Repeat_DataDrivenTesting_ExcelSheet;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelCode {
	
	public static FileInputStream ip ;
	public static XSSFWorkbook workbook ;
	public static  XSSFSheet sheet;
		 	
	@DataProvider ()
	public  static Object [][]getExcelLoginData() throws Exception {
		Object [][] data = ExcelCode.readFromExcelTNSheet("LOGINTN");
		return data;
//---------------------		
	}
	
	
	//Step:	1 Create a Static Method and pass a String sheetName parameter. 

	
	public static Object [] [] readFromExcelTNSheet(String sheetName) throws Exception  {
	//Step: 2 Create the Object of FileInputStream and pass the path of the Excel sheet in
//    	its  Constructor.
		 ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\TestNG\\Jan_13_Day14_TestNG_Repeat_DataDrivenTesting_ExcelSheet\\ExcelData.xlsx") ;
		
		
		 
		//Step : 3 Create the Object of XSSFWorkbook
				 workbook = new XSSFWorkbook (ip);
  				
	//Step : 4 Use the workbook refrence to call the getSheet(overloaded Method).
	//        getSheet () Method will return XSSFSheet				
		sheet =	workbook.getSheet(sheetName);
	
	
		//Step :5  Once you get the sheet, now you need No of Row and No of Columns .
	     
	 int rows    = sheet.getLastRowNum();
	 int columns = sheet.getRow(0).getLastCellNum() ;
	 
	// Step: 6   Create a 2 Dimensioanl Object Array.
	 Object [][] data = new Object [rows][columns];
	 // you need to traverse between the Excel sheet to every row and column and use the data This is done using nested for loop.
	 // Outer for loop is  for Rows
	 // Inner for loop is for Columns
	 
	 for (int i = 0; i < rows ; i++) {// outer for loop
	XSSFRow row = sheet.getRow(i+1);
		  
	    for(int j=0; j<columns; j++)  {// inner for loop
	    	XSSFCell cell = row.getCell(j)	;
	    	
 ///Step: 7  Determine the cell datatype 
	    	CellType celltype = cell.getCellType();
	    	switch(celltype) {
	    	case STRING:
	    		data[i][j] = cell.getStringCellValue();
	    		break;
	    	case NUMERIC:	
	    		data[i][j] = Integer.toString((int)cell.getNumericCellValue());// you neeed to convert to String using Wrappper class
	            break;
	    	case BOOLEAN :
	  			data[i][j] =  cell.getBooleanCellValue();
	 		
	 }
	 }
	 }
	 return data;
	}
	

}