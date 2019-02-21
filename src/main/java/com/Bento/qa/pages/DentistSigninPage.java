package com.Bento.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Bento.qa.base.TestBase;

public class DentistSigninPage extends TestBase {
	
	@FindBy(xpath = "//input[@type='text']")
	WebElement dentistid;
	
	@FindBy(xpath = "//input[contains(@type,'password')]")
	WebElement dentistpassword;
	
	@FindBy(xpath = "//button[contains(@type,'button')]")
	WebElement dentistsigninbtn;
	
	@FindBy(xpath = "//div[@class='row marB10']/div[2]/button/div[1]/div[1]/span")
	WebElement bulkemp;
	
	@FindBy(xpath = "//div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]")
	WebElement invalidcredentials;
	

	//Constructor: Initialize webdriver from base class
	public DentistSigninPage () {
		PageFactory.initElements(driver, this);
	}
	
	public void DentistLogin (String DentistID,String DentistPassword) throws IOException, InterruptedException {
		
		dentistid.sendKeys(DentistID);
		Thread.sleep(2000);
		dentistpassword.sendKeys(DentistPassword);
		Thread.sleep(2000);
		dentistsigninbtn.click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,80	);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]")));
		String actualres = driver.findElement(By.xpath("//div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]")).getText();
				
		String expectedres = "Unable to log in with provided credentials.";
		
		Assert.assertEquals(actualres, expectedres,"both are same");
		
		System.out.println(actualres);
	}
		

}
