package ReadingData_From_Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelData {
	public static FileInputStream ip;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;

	@DataProvider(name = "Rediff")
	public Object[][] getRediffExcelData() throws IOException {
		Object[][] data = ExcelData.readFromExcelRediffData("Login");
		return data;
	}
	
	@DataProvider(name = "TutorialsNinja")
	public Object[][] gettutorialsNinjaExcelData() throws IOException {
		Object[][] data = ExcelData.readFromExcelTNData("LoginTN");
		return data;
	}

	public static Object[][]readFromExcelRediffData (String sheetName) throws IOException {
		
		ip = new FileInputStream(System.getProperty("user.dir")  +  "\\src\\test\\java\\ReadingData_From_Excel\\RediffData.java");
	    workbook  = new XSSFWorkbook(ip); 
	    sheet = workbook.getSheet(sheetName);
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		
		Object[][]data = new Object[rows][cols];
		
		for(int i=0; i<rows; i++) {
		   XSSFRow row = sheet.getRow(i+1);
		
		
		for(int j=0; j<cols ; j++) {
		XSSFCell cell = row.getCell(j);
	
         CellType cellType = cell.getCellType();
           
         switch(cellType)   {
           
          case STRING:
        	   data[i][j] = cell.getStringCellValue();
        	   break;
        	   
          case NUMERIC:
        	   data[i][j] = Integer.toString((int)cell.getNumericCellValue());
        	   break;
        	   
           case BOOLEAN:
        	   data[i][j] = cell.getBooleanCellValue();
         }
		}
		}
        return data;
         }
           
		       
	


public static Object[][]readFromExcelTNData (String sheetName) throws IOException {
	
	ip = new FileInputStream(System.getProperty("user.dir")  +  "\\src\\test\\java\\ReadingData_From_Excel\\RediffData.java");
    workbook  = new XSSFWorkbook(ip); 
    sheet = workbook.getSheet(sheetName);
	
	int rows = sheet.getLastRowNum();
	int cols = sheet.getRow(0).getLastCellNum();
	
	Object[][]data = new Object[rows][cols];
	
	for(int i=0; i<rows; i++) {
	   XSSFRow row = sheet.getRow(i+1);
	
	
	for(int j=0; j<cols ; j++) {
	XSSFCell cell = row.getCell(j);

     CellType cellType = cell.getCellType();
       
     switch(cellType)   {
       
      case STRING:
    	   data[i][j] = cell.getStringCellValue();
    	   break;
    	   
      case NUMERIC:
    	   data[i][j] = Integer.toString((int)cell.getNumericCellValue());
    	   break;
    	   
       case BOOLEAN:
    	   data[i][j] = cell.getBooleanCellValue();
    	   
    return data;
    
     }
	}
	}
	return data;
}
}