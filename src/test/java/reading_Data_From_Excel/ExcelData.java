package reading_Data_From_Excel;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelData {
	public static FileInputStream ip ;
	public static XSSFWorkbook workbook ;
	public static  XSSFSheet sheet;
	
	/*STEPS:--
	1. Create an Excel sheet(.XlsX) Which has the data.
	2. Copy that Excel sheet in your Eclipse (Package).
	3. If you edit the local Excel sheet, it will make no difference to the Excel
	   sheet which is copied here. So please delete the Excel sheet from here and 
	   copy the updated Excel sheet and paste it here in this Package.  */

//------------------------	
	@DataProvider()
	public Object [][] getRediffExcelData() throws IOException {
		Object[][] data = ExcelData.readFromExcelRediffData("Login");
		return data;
}
	@DataProvider()
	public Object [][] getTutorialsNinjaExcelData() throws IOException {
		Object[][] data = ExcelData.readFromExcelTNData("LoginTN");
		return data;
}	
//--------------------------	
	
	
	//Step:	1 Create a Static Method and pass a String sheetName parameter. 

    public static Object[] [] readFromExcelRediffData(String sheetName ) throws IOException {
	
//Step: 2 Create the Object of FileInputStream and pass the path of the Excel sheet in
//    	its  Constructor.
    	
     ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\reading_Data_From_Excel\\RediffData.xlsx");
	
  //Step : 3 Create the Object of XSSFWorkbook
     workbook = new XSSFWorkbook(ip);
    	
  //Step : 4 Use the workbook refrence to call the getSheet(overloaded Method).
  //        getSheet () Method will return XSSFSheet
     sheet = workbook.getSheet(sheetName);
              
  //Step :5  Once you get the sheet, now you need No of Row and No of Columns .
     int rows    = sheet.getLastRowNum();
     int columns = sheet.getRow(0).getLastCellNum();
   	
 // Step: 6   Create a 2 Dimensioanl Object Array.
            Object [][] data = new Object[rows][columns];
            
            for (int i= 0; i<rows; i++)    {
          XSSFRow row =  	sheet.getRow(i+1);
          
          for(int j= 0; j<columns; j++)  {
            XSSFCell cell = row.getCell(j);
         
 //Step: 7  Determine the cell datatype     
        CellType cellType =   cell.getCellType();
        switch(cellType) {
        case STRING:
        	data[i][j] =cell.getStringCellValue();
        	break;
        case NUMERIC:
        	data[i][j] =Integer.toString((int)cell.getNumericCellValue());
        	break;
        case BOOLEAN:
        	data[i][j]=cell.getBooleanCellValue();
}
}
}
            return data;
}
//--------------------------------------------------
    
    
    public static Object[] [] readFromExcelTNData(String sheetName ) throws IOException {
    	
    	
  	 ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\reading_Data_From_Excel\\RediffData.xlsx");
    		
     workbook = new XSSFWorkbook(ip);
    	    	
     sheet = workbook.getSheet(sheetName);
    	              
     int rows    = sheet.getLastRowNum();
     int columns = sheet.getRow(0).getLastCellNum();
    	   	
         Object [][] data = new Object[rows][columns];
    	            
    	 for (int i= 0; i<rows; i++)    {
    	          XSSFRow row =  	sheet.getRow(i+1);
    	          
    	         for(int j= 0; j<columns; j++)  {
    	          XSSFCell cell = row.getCell(j);
    	         
    	 
    	 CellType cellType =   cell.getCellType();
    	        switch(cellType) {
    	        case STRING:
    	        	data[i][j] =cell.getStringCellValue();
    	        	break;
    	        case NUMERIC:
    	        	data[i][j] =Integer.toString((int)cell.getNumericCellValue());
    	        	break;
    	        case BOOLEAN:
    	        	data[i][j]=cell.getBooleanCellValue();
    	}
    	}
    	}
    	            return data;
    	}
    	}