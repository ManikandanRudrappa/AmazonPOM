package excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import base.ProjectSpecMethods;

public class Excel extends ProjectSpecMethods
{
	public String[][] readExcel(String FileName) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("./TestData/"+FileName+".xlsx"); 		
		XSSFSheet sheet = book.getSheetAt(0); 		
		int rowCount = sheet.getLastRowNum(); 		
		System.out.println("Row Count " + rowCount);
		XSSFRow firstRow = sheet.getRow(0);
		int colCount = firstRow.getLastCellNum();
		System.out.println("Col Count " + colCount);
		String[][] data = new String[rowCount][colCount];
		for (int j = 1; j <= rowCount; j++) {
			XSSFRow row = sheet.getRow(j);
			for (int i = 0; i < colCount; i++) {
				XSSFCell cell = row.getCell(i); 
				String value = cell.getStringCellValue(); 
				data[j-1][i]= value;
				System.out.println(value);
			}	}
		book.close(); 		
		return data;		
	
	
	
	
	
	}

}