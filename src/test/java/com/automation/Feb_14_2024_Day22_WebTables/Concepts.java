package com.automation.Feb_14_2024_Day22_WebTables;

public class Concepts {
	/*   How to identify a  Webtable in DOM  ?
	 *   Webtables are dynamic in nature.
	 *   Webtables will hava a specific id or Class.
	 *   
	 *   <"dataTable">
	 *   
	 *   1.  THead:
	 *      <TR>: This represents row.
	 *      <TH>: This represents  specfic Column of Header row.
	 * 
	 *   2.  TBody :    	       
	 *      <TR>: Each TR represents  each row.
	 *      <TD>: Each TD represents each Column of the  rows.
	 *      
	 *        Having good xpath knowledge is very important.  
	 *        
	 *  1. //table[@class ='dataTable']:>>>> this represents the whole WebTable.
	 *  2. //table[@class ='dataTable']/thead:>>>> this represents the header of the Webtable.                               
	 *  3. //table[@class ='dataTable']/thead/tr:>>> this represents  the header row of the WebTable.  
        4. //table[@class ='dataTable']/thead/tr/th:>>> this represents all the cols of the header row.          
        5. //table[@class ='dataTable']/thead/tr/th[1]:>>> This represents the 1st col of the header row.
        6. //table[@class ='dataTable']/thead/tr/th[5]:>>> This represents the 5th col of the header row.    
        7. //table[@class ='dataTable']/tbody :>>>This represents the body of the Webtable without the header of first row.                                                                   
        8. //table[@class ='dataTable']/tbody/tr :>>>This represents all Total rows of the body of the Webtable.                                                                             *
        9. //table[@class ='dataTable']/tbody/tr[1] :>>>This represents the first row of the body of the Webtable.                 
       10. //table[@class ='dataTable']/tbody/tr/td :>>>This represents all the column of all the rows both  total coloumn and row of the body of the Webtable.            
       11. //table[@class ='dataTable']/tbody/tr[1]/td :>>>This represents all the column of the frist row of the Webtable.                                                                                                  
       12. //table[@class ='dataTable']/tbody/tr[1]/td[1] :>>>This represents all the frist column of the first row of the Webtable.                                                                                                                                                                                                    
       13. //table[@class ='dataTable']/tbody/tr[1]/td[1] :>>>This represents all values in the first column.    
       14. //table[@class ='dataTable']/tbody/tr[1]/td[4] :>>>This represents all values in the fourth column.    
                                                                                                                                                                                                                                                                                                                                                                                   
                                                                                                    */



}  