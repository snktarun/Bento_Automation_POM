package com.Bento.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Bento.qa.base.TestBase;

public class Employersignuppage extends TestBase {

	@FindBy(xpath = "//a[@href='#/Sign-Up']")
	WebElement new_signup_link ;
	
	@FindBy(xpath = "//input[@name='company_name']")
	WebElement company_name ;
	
	@FindBy(xpath = "//input[contains(@id, 'CompanyAddress1')]")
	WebElement company_address_1 ;
	
	@FindBy(xpath = "//input[contains(@id, 'CompanyAddress2')]")
	WebElement company_address_2 ;
	
	@FindBy(xpath = "//input[contains(@id, 'City')]")
	WebElement city ;
	
	@FindBy(xpath = "//input[contains(@id, 'Zip')]")
	WebElement Zipcode ;
	
	@FindBy(xpath = "//input[contains(@id,'FirstName')]")
	WebElement AdminFirstName ;
	
	@FindBy(xpath = "//input[contains(@id,'MiddleName')]")
	WebElement AdminMiddleName ;
	
	@FindBy(xpath = "//input[contains(@id,'LastName')]")
	WebElement AdminLastName ;
	
	@FindBy(xpath = "//input[contains(@id,'Email')]")
	WebElement AdminEmail ;
	
	@FindBy(xpath = "//input[contains(@id,'PhoneNumber')]")
	WebElement AdminPhoneNumber;
	
//	m_driver.findElement(By.xpath("//input[contains(@id,'EnterCity')]")).sendKeys(Keys.TAB , "Ohio", Keys.ENTER);
//	String res = m_driver.findElement(By.xpath("//div[@class='css-1hwfws3']")).getText();
//	System.out.println("result : " + res);
	
	 @FindBy(xpath = "//input[contains(@id,'EnterCity')]")
	 WebElement tabcity;
	
	@FindBy(xpath = "//div[@class='css-1hwfws3']")
	WebElement DropDownValue;
	
	
	@FindBy(id = "agreeToCambalt")
	WebElement checkbox ;
	
	@FindBy(xpath = "//span[contains(text(),'Sign Up')]")
	WebElement SignupButton ;
	
	public Employersignuppage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void new_signup_click()
	{
		new_signup_link.click();
		}
	
	public void statedropdown(String State) throws InterruptedException
	{
    driver.findElement(By.xpath("//input[contains(@id,'EnterCity')]")).sendKeys(Keys.TAB , State, Keys.ENTER);
		String res = driver.findElement(By.xpath("//div[@class='css-1hwfws3']")).getText();
		System.out.println("result : " + res);
	}
	
	public void companydetails(String CompanyName,String CompanyAddress1,String CompanyAddress2,String CityName,String ZipCode,String FirstName,String MiddleName,String LastName,String Email,String PhoneNumber) throws InterruptedException
	{
		company_name.sendKeys(CompanyName);
		Thread.sleep(1000);
		company_address_1.sendKeys(CompanyAddress1);
		Thread.sleep(1000);
		company_address_2.sendKeys(CompanyAddress2);
		Thread.sleep(1000);
		city.sendKeys(CityName);
		Thread.sleep(1000);
		Zipcode.sendKeys(ZipCode);
		Thread.sleep(1000);
		AdminFirstName.sendKeys(FirstName);
		Thread.sleep(1000);
		AdminFirstName.sendKeys(MiddleName);
		Thread.sleep(1000);
		AdminLastName.sendKeys(LastName);
		Thread.sleep(1000);
//		tabcity.sendKeys(Keys.TAB,State,Keys.ENTER);
//		Thread.sleep(1000);
//		DropDownValue.getText();
//		Thread.sleep(1000);
		AdminEmail.sendKeys(Email);
		Thread.sleep(1000);
		AdminPhoneNumber.sendKeys(PhoneNumber);
		Thread.sleep(1000);
			}
	
	public void clickcheckbox() throws InterruptedException
	{
		checkbox.click();
		Thread.sleep(1000);
	}
	public void signup_button()
	{
		SignupButton.click();
	}
	public void exit_browser()
	{
		driver.quit();
	}
	}
	
