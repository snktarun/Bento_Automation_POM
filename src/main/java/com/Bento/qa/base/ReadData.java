package com.Bento.qa.base;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class ReadData {

	
	public static void reading_data()
	{
		try{
			//Finding a file
		File file = new File("/home/tarun/workspace1/HelloWorldWork/Bento_Automation_POM/Resources/Bento_Data.xls");
		//Loading a file
		FileInputStream fileload = new FileInputStream(file);
		System.out.println("file uploaded successfully");
		
		HSSFWorkbook wb = new HSSFWorkbook(fileload);
		HSSFSheet sh = wb.getSheet("data");
		System.out.println(sh.getLastRowNum());
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			Cell celldata =sh.getRow(i).getCell(0);
			String cellvalue = celldata.getStringCellValue();
			if (cellvalue.equalsIgnoreCase("empid")){
				System.out.println(sh.getRow(i+1).getCell(0).getNumericCellValue());
			}
					
			System.out.println(celldata);	
		}

		}catch(Exception e){
			System.out.println(e);
		}
	}
		public static void main(String args[])
		{
			reading_data();
		}
	}

