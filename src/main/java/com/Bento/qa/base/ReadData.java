package com.Bento.qa.base;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.testng.annotations.Test;

public class ReadData {

	@Test
	public static String[] reading_data()
	{
		String[] valArr = new String[2];
		try{
			//Finding a file
		File file = new File("/home/tarun/workspace1/HelloWorldWork/Bento_Automation/Resources/Bento_Data.xls");
		//Loading a file
		FileInputStream fileload = new FileInputStream(file);
		System.out.println("file uploaded successfully");
		
		HSSFWorkbook wb = new HSSFWorkbook(fileload);
		HSSFSheet sh = wb.getSheet("data");
		
		System.out.println(sh.getLastRowNum());
		
		System.out.println(sh.getLeftCol());
		
		for(int i=1;i<	sh.getLastRowNum();i++)
		{
			Cell celldata1 =sh.getRow(i).getCell(0);
			Cell celldata2 =sh.getRow(i).getCell(1);
			String valOne = celldata1.getStringCellValue();
			String valTwo = celldata2.getStringCellValue();
			valArr[0] = valOne;
			valArr[1] = valTwo;
			System.out.println(celldata1);
			System.out.println(celldata2);
			break;
		}
			}catch(Exception e){
			System.out.println(e);
		} 
		
		return valArr;
	}
}
	
		
