package com.Bento.qa.pages;

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
	
	//Auto id file path - /home/tarun/Documents/autoit-v3-setup.exe
	
	
	public void employerlogin(String empid,String pwd) {
		employeeid.sendKeys(empid);
		password.sendKeys(pwd);
		signinbtn.click();
	}
	
	public void Step2_Payment_Information(String bank_account,String confirm_bank_account,
			String bank_routing,String confirm_bank_routing,
			String name_bank_account,String Account_holder_name,
			String date_of_birth,String tax_id)throws InterruptedException
	{
		bankaccount.sendKeys(bank_account);
		Thread.sleep(3000);
		confirmbankaccount.sendKeys(confirm_bank_account);
		Thread.sleep(3000);
		bankrouting.sendKeys(bank_routing);
		Thread.sleep(1000);
		confirmbankrouting.sendKeys(confirm_bank_routing);
		Thread.sleep(1000);
		bankaccountname.sendKeys(name_bank_account);
		Thread.sleep(2000);
		accountholdername.sendKeys(Account_holder_name);
		Thread.sleep(3000);
		accounttaxid.sendKeys(tax_id);
		Thread.sleep(3000);
		dob.sendKeys(date_of_birth);
		Thread.sleep(3000);
		
			}
	
	
}
