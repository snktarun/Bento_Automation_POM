package com.Bento.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Bento.qa.base.TestBase;
import com.Bento.qa.util.TestUtil;

public class AdminPortalPage extends TestBase {
	
	@FindBy(xpath = "//input[contains(@type,'text')]") WebElement username;
	@FindBy(xpath = "//input[@type='password']") WebElement password;
	@FindBy(xpath ="//button[@type='button']") WebElement signin;
	@FindBy(xpath = "//button[@data-route='/Employers']") WebElement Employers;
	@FindBy(xpath = "//div[@class = 'home-layout']/div[1]/div[1]/div[1]/div[1]/div[1]/h2") WebElement pendingemptext;
	@FindBy(xpath = "//div[@class = 'home-layout']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table/tbody/tr/td[6]/div/button") WebElement review;
	
	
	public AdminPortalPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void adminsignin(String UserName,String Password,String identifytext) throws InterruptedException
	{
		System.out.println("login page ");
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		username.sendKeys(UserName);
		
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		password.sendKeys(Password);
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		signin.click();
		Thread.sleep(2000);
		Employers.click();
		
		String textdata = pendingemptext.getText();
		if(textdata.equalsIgnoreCase(identifytext))
		{
			System.out.println("Identified as expected text data");
		}
		else 
		{
			System.out.println("Identified as different text data");

		}
		Thread.sleep(2000);
		review.click();
		
	}

}
