package com.Bento.qa.pages;

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
	
	public void employerlogin(String empid,String pwd) {
		employeeid.sendKeys(empid);
		password.sendKeys(pwd);
		signinbtn.click();
	}
	
}
	