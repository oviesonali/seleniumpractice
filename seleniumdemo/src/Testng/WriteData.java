package Testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteData {
  @Test
  public void getSheetName() throws FileNotFoundException, IOException {

	  FileInputStream fis = new FileInputStream(".\\ExcelData\\ReadData.xlsx");

	  XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheetCount=workbook.getNumberOfSheets();
		System.out.println("Sheet Count: "+sheetCount);
		System.out.println("Active sheet index: " + workbook.getActiveSheetIndex());
		for (int i = 0; i < sheetCount; i++) {
			System.out.println(workbook.getSheetName(i));
		}
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
  
	  
  }
}
