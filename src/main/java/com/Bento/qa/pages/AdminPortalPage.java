package com.Bento.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Bento.qa.base.TestBase;
import com.Bento.qa.util.TestUtil;

public class AdminPortalPage extends TestBase {
	
	@FindBy(xpath = "//input[contains(@type,'text')]") WebElement username;
	@FindBy(xpath = "//input[@type='password']") WebElement password;
	@FindBy(xpath ="//button[@type='button']") WebElement signin;
	
	public AdminPortalPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void adminsignin(String UserName,String Password)
	{
		System.out.println("login page ");
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		username.sendKeys(UserName);
		
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		password.sendKeys(Password);
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		signin.click();
		
	}

}
