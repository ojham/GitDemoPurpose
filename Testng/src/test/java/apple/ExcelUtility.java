package apple;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;

import junit.framework.Assert;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;


public class ExcelUtility {
	/*****
	 * Read Excel value's and Return a Constructor
	 * @param excelFilePath 
	 * @param sheetName
	 * @throws IOException
	 */
	public LinkedHashMap<Object, LinkedHashMap<Object, Object>> readExcel(String excelFilePath,String sheetName) throws IOException{
		LinkedHashMap<Object, LinkedHashMap<Object, Object>> excelCollection=new LinkedHashMap<Object, LinkedHashMap<Object, Object>>();
		try {
			FileInputStream ExcelFile = new FileInputStream(excelFilePath);
			 Workbook wb = new XSSFWorkbook (ExcelFile);
			 Sheet mySheet = wb.getSheet(sheetName);
			
			 
			 int rownum = mySheet.getLastRowNum();
			 for(int row=1;row<=rownum;row++)
			 {
				 LinkedHashMap<Object, Object> secondaryHashmap=new LinkedHashMap<Object, Object>();
				Object primaryKey= fetchCellValue(mySheet.getRow(row).getCell(0));
				short colnum = mySheet.getRow(0).getLastCellNum();
				
			     for(int col=1;col<colnum;col++){
			    	Object secondaryKey= fetchCellValue(mySheet.getRow(0).getCell(col));
			    	Object value= fetchCellValue(mySheet.getRow(row).getCell(col));
			    	secondaryHashmap.put(secondaryKey, value);
			     }             
			     excelCollection.put(primaryKey, secondaryHashmap) ;
			 }
		} catch (IOException e) {
			Reporter.log("readExcel: Method had Exceptions >>"+e.getMessage());
			Assert.fail("readExcel: Method had Exceptions >>"+e.getMessage());
		}
		return excelCollection;
	}
	/**
	 * Used to fetch value's from Cell based on Cell Type
	 * @return
	 */
	public Object fetchCellValue(Cell cell){
		Object cellValue = "No_Value";
		 try {
			CellType type = cell.getCellTypeEnum();
			 if (type == CellType.STRING) {
				 cellValue=cell.getStringCellValue();
			 } else if (type == CellType.NUMERIC) {
				 cellValue=cell.getNumericCellValue();
			 } else if (type == CellType.BOOLEAN) {
				 cellValue=cell.getBooleanCellValue();
			 } else if (type == CellType.BLANK) {
				 cellValue="No_Value";
			 }
		} catch (Exception e) {
			Reporter.log("fetchCellValue: Method had Exceptions >>"+e.getMessage());
			Assert.fail("fetchCellValue: Method had Exceptions >>"+e.getMessage());
		}
		return cellValue;
		
	}
	

}
