package com.Bento.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Bento.qa.base.TestBase;

public class EmployerSignupStep2 extends TestBase {

	public EmployerSignupStep2() {
		PageFactory.initElements(driver, this);
	}
	
	//sign in for step-2
	@FindBy(xpath = "//input[contains(@type,'text')]")
	WebElement employeeid;
	
	@FindBy(xpath = "//input[contains(@type,'password')]")
	WebElement password;
	
	@FindBy(xpath = "//button[contains(@type,'button')]")
	WebElement signinbtn;
	
//	Payment Account Information :
	//Bank Account
	@FindBy(xpath="//input[contains(@id,'account_number')]")
	WebElement bankaccount ;
	//Confirm Bank Account
	@FindBy(xpath="//input[contains(@id,'confirm_account_number')]")
	WebElement confirmbankaccount ;
	//Bank Routing
	@FindBy(xpath="//input[contains(@id,'routing_number')]")
	WebElement bankrouting ;
	//Confirm Bank Routing
	@FindBy(xpath="//input[contains(@id,'confirm_routing_number')]")
	WebElement confirmbankrouting ;
	//Bank Account Name	
	@FindBy(xpath="//input[contains(@id,'bank_name')]")
	WebElement bankaccountname ;
	
	//Account Holder Name
	@FindBy(xpath = "//input[contains(@id,'account_holder_name')]")
	WebElement accountholdername;
	//Date of birth
	@FindBy(xpath="//input[contains(@id,'MMDDYYYY')]")
	WebElement dob;
	//Account SSN
	@FindBy(xpath="//input[contains(@id,'taxid')]")
	WebElement accounttaxid ; 
	
	//upload file button - xpath 
	/*@FindBy(xpath="//form[@name='signupForm']/div[1]/div[1]/div[6]/div[1]/label")
	WebElement browse;*/
	
	@FindBy(xpath="//div[@class='appTheme']/button")
	WebElement nextbutton;
	
   public void employerlogin(String empid,String pwd) {
		employeeid.sendKeys(empid);
		password.sendKeys(pwd);
		signinbtn.click();
	}
	
	public void Step2_Payment_Information(String bank_account,String confirm_bank_account,
			String bank_routing,String confirm_bank_routing,
			String name_bank_account,String Account_holder_name,
			String date_of_birth,String tax_id)throws InterruptedException, IOException
	{
		bankaccount.sendKeys(bank_account);
		Thread.sleep(2000);
		confirmbankaccount.sendKeys(confirm_bank_account);
		Thread.sleep(2000);
		bankrouting.sendKeys(bank_routing);
		Thread.sleep(1000);
		confirmbankrouting.sendKeys(confirm_bank_routing);
		Thread.sleep(1000);
		bankaccountname.sendKeys(name_bank_account);
		Thread.sleep(2000);
		accountholdername.sendKeys(Account_holder_name);
		Thread.sleep(2000);
		accounttaxid.sendKeys(tax_id);
		Thread.sleep(2000);
		dob.sendKeys(date_of_birth);
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].setAttribute('style', arguments[1])", driver.findElement(By.xpath("//input[@type='file']")), "1");
		js.executeScript("arguments[0].setAttribute('class', arguments[1])", driver.findElement(By.xpath("//input[@type='file']/../../div[2]")), "a");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("//home//tarun//Pictures//lookup.png");
		Thread.sleep(2000);
		//click Next button
		nextbutton.click();
		Thread.sleep(2000);
		
			}
	
	
}
