package com.Bento.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Bento.qa.base.TestBase;

public class DentistSignupPage extends TestBase {

	
	
	public DentistSignupPage () {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@href='#/signup']") WebElement signuplinkclick;
	
	@FindBy(xpath = "//input[@type='checkbox']") WebElement termscheckbox;
	
	@FindBy(xpath = "//div[@class='signup']/div[2]/div[1]/div[1]/div[1]/div[1]/button/div[1]/div[1]") WebElement nextbutton;
	
	
	public void step1(String dentistemail,String pracname,String pracurl,String businessname,String ein,
			String businesstaxid,String businessaddress1,String businessaddress2,String businesscity,
			String alaska,String businesszipcode,String ownerfirstname,String ownermiddlename,
			String ownerlastname,String ownerdob,String ownerlast4ssn) throws InterruptedException
	{
		signuplinkclick.click();
		Thread.sleep(2000);
		List <WebElement> textele1 = driver.findElements(By.xpath("//input[@type='text']"));
		
		textele1.get(0).sendKeys(dentistemail);
		Thread.sleep(1000);
		textele1.get(1).sendKeys(pracname);
		Thread.sleep(1000);
		textele1.get(2).sendKeys(pracurl);
		Thread.sleep(1000);
		textele1.get(3).sendKeys(businessname);
		Thread.sleep(1000);
		textele1.get(4).sendKeys(ein,Keys.ENTER);
		Thread.sleep(2000);
		textele1.get(5).sendKeys(businesstaxid);
		Thread.sleep(2000);
		textele1.get(6).sendKeys(businessaddress1);
		Thread.sleep(2000);
		textele1.get(7).sendKeys(businessaddress2);
		Thread.sleep(2000);
		textele1.get(8).sendKeys(businesscity);
		Thread.sleep(2000);
		textele1.get(9).sendKeys(alaska,Keys.ENTER);
		Thread.sleep(2000);
		textele1.get(10).sendKeys(businesszipcode);
		Thread.sleep(2000);
		textele1.get(11).sendKeys(ownerfirstname);
		Thread.sleep(2000);
		textele1.get(12).sendKeys(ownermiddlename);
		Thread.sleep(2000);
		textele1.get(13).sendKeys(ownerlastname);
		Thread.sleep(2000);
		textele1.get(14).sendKeys(ownerdob);
		Thread.sleep(2000);
		textele1.get(16).sendKeys(ownerlast4ssn);
		Thread.sleep(2000);
		termscheckbox.click();
		Thread.sleep(1000);
		nextbutton.click();
		Thread.sleep(4000);
		}
	
}
