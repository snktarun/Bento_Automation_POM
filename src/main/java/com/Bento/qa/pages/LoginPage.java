package com.Bento.qa.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Bento.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath = "//input[contains(@type,'text')]")
	WebElement employeeid;
	
	@FindBy(xpath = "//input[contains(@type,'password')]")
	WebElement password;
	
	@FindBy(xpath = "//button[contains(@type,'button')]")
	WebElement signinbtn;
	
	@FindBy(xpath = "//div[@class='row marB10']/div[2]/button/div[1]/div[1]/span")
	WebElement bulkemp;

	//Constructor: Initialize webdriver from base class
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void employerlogin() throws IOException, InterruptedException {
		
		//Finding a file
		File file = new File("/home/tarun/workspace1/HelloWorldWork/Bento_Automation/Resources/Bento_Data.xls");
		//Loading a file
		FileInputStream fileload = new FileInputStream(file);
		System.out.println("file uploaded successfully");
		
		HSSFWorkbook wb = new HSSFWorkbook(fileload);
		HSSFSheet sh = wb.getSheet("data");
		
		System.out.println(sh.getLastRowNum());
	
	String id = sh.getRow(0).getCell(0).getStringCellValue();	
	String pwd = sh.getRow(0).getCell(1).getStringCellValue();	
			
		employeeid.sendKeys(id);
		Thread.sleep(2000);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		signinbtn.click();
}
}