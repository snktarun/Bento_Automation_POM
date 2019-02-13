package com.Bento.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.Test;

public class writedata extends TestBase {

	@Test
	public void writedatainexcel() throws IOException
	{
		File file12 = new File("/home/tarun/workspace1/HelloWorldWork/Bento_Automation/Resources/Bento_Data.xls");
		
		System.out.println("uploaded file successfully");
		
		FileInputStream fileload = new FileInputStream(file12);
		
		HSSFWorkbook wb = new HSSFWorkbook(fileload);
		
		HSSFSheet sh = wb.getSheet("data");
		
	//	System.out.println(sh.getLastRowNum());
		
	//	System.out.println(sh.getLeftCol());
		
		 Row row = sh.createRow(0);
		 Cell cell1 = row.createCell(0);
		 cell1.setCellValue("email id details");
		 //cell.setCellValue(TestBase.EmployerID);
		 
		 Cell cell2 = row.createCell(1);
		 cell2.setCellValue("password details");
		 
		// cell2.setCellValue(TestBase.Password);
		 
			System.out.println(cell1);
			
			System.out.println(cell2);
			
		 FileOutputStream fos = new FileOutputStream("/home/tarun/workspace1/HelloWorldWork/Bento_Automation/Resources/Bento_Data.xls");
		 wb.write(fos);
			System.out.println("file write success");
		 //fos.close();
		
	}
}
