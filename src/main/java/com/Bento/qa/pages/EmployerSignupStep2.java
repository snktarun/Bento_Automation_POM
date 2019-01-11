package com.Bento.qa.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Bento.qa.base.TestBase;

public class EmployerSignupStep2 extends TestBase {

	private static final org.openqa.selenium.interactions.Action New = null;

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
	
	//Step - 3
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
	
	//Step -4
	//Drop down
	/*@FindBy(xpath="//div[contains(@id,'ChoosePlanType')]/div[1]/div[2]")
	WebElement drop_down;
	
	//select plans 
	@FindBy(xpath="//span[@role='menuitem']")
	WebElement select_plans;
	
	//select plan - Standard Plans
		@FindBy(xpath="//span[@role='menuitem']/div[1]/div[1]/div[text()='Standard Plans']")
		WebElement standard_plans;
		
		//select plan - Custom Plan
		@FindBy(xpath="//span[@role='menuitem']/div[1]/div[1]/div[text()='Standard Plans']")
		WebElement Custom_Plan;*/
	
	//Drop down element
	@FindBy(xpath="//*[@id='root']/div/div[2]/div[3]/div/div[1]/div/div[1]/div/div/p")
	WebElement drop_down;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div[3]/div/div[1]/div/div[2]/div/div[2]/div[1]/div[2]/div[1]/div[1]/div/input")
	WebElement platinum_Network;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div[3]/div/div[1]/div/div[2]/div/div[2]/div[1]/div[6]/div[1]/div[1]/div/input")
	WebElement Gold_Network;
	
	@FindBy(xpath="//div[@class='planView']/div[6]/div[2]/div[1]/div[1]/input[@type='text']")
	WebElement gold_custom_annual_max;
	
	@FindBy(xpath="//div[@class='planView']/div[6]/div[2]/div[2]/div[1]/input[@type='text']")
	WebElement Gold_Custom_Ortho;
	
	@FindBy(xpath="//div[@class='planView']/div[6]/div[2]/div[3]/div[1]/input[@type='text']")
	WebElement Gold_Custom_Adult_Ortho;
	
	@FindBy(xpath="//div[@class='planView']/div[2]/div[2]/div[1]/div[1]//input[@type='text']")
	WebElement platinum_custom_annual_max;
	
	@FindBy(xpath="//div[@class='planView']/div[2]/div[2]/div[2]/div[1]//input[@type='text']")
	WebElement Platinum_Custom_Ortho;
	
	@FindBy(xpath = "//div[@class='planView']/div[2]/div[2]/div[3]/div[1]//input[@type='text']")
	WebElement Platinum_Custom_Adult_Ortho;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div[3]/div/div[1]/div/div[2]/div/div[2]/div[2]/div/button/div/div")
	WebElement step4_next_button;

	//Step -5 Enroll Dates 
	@FindBy(xpath="//*[@id='form_view']/form/div[1]/h4[1]")
	WebElement Initial_Enroll_header;
	
	@FindBy(xpath="//div[@id='form_view']/form/div[1]/div[1]/div[1]/div[1]/div[1]/input")
	WebElement Initial_open_enrollment_period_from_date;
	
	@FindBy(xpath="//div[@id='form_view']/form/div[1]/div[1]/div[2]/div[1]/div[1]/input")
	WebElement Initial_open_enrollment_period_to_date;
	
	@FindBy(xpath="//div[@id='form_view']/form/div[1]/div[2]/div[1]/div[1]/div[1]/input")
	WebElement Initial_coverage_period_from_date;
	
	@FindBy(xpath="//div[@id='form_view']/form/div[1]/div[3]/div[1]/div[1]/div[1]/input")
	WebElement Re_enrollment_open_enrollment_start_date;
	
	@FindBy(xpath="//div[@id='form_view']/form/div[1]/div[3]/div[2]/div[1]/div[1]/input")
	WebElement Re_enrollment_open_enrollment_to_date;
	
	@FindBy(xpath="//div[@id='form_view']/form/div[1]/div[5]/div[1]/div[1]/div[1]/input")
	WebElement Re_enrollment_plan_switch_date; 
	
	@FindBy(xpath="//*[@id='form_view']/form/div[2]/div/button/div/div")
	WebElement submit_button;
	
	public void employerlogin(String empid,String pwd) {
		employeeid.sendKeys(empid);
		password.sendKeys(pwd);
		signinbtn.click();
	}
	
  	public void Step3_Payment_Information(String bank_account,String confirm_bank_account,
			String bank_routing,String confirm_bank_routing,
			String name_bank_account,String Account_holder_name,
			String date_of_birth,String tax_id)throws InterruptedException, IOException
	{
		Thread.sleep(4000);
		bankrouting.sendKeys(bank_routing);
		Thread.sleep(2000);
		confirmbankrouting.sendKeys(confirm_bank_routing);
		Thread.sleep(2000);
		bankaccount.sendKeys(bank_account);
		Thread.sleep(2000);
		confirmbankaccount.sendKeys(confirm_bank_account);
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
		Thread.sleep(5000);		
			}
	
	public void step4_select_plans(String PlatinumAnnualMax,String PlatinumAdultCustomOrtho,String GoldCustomOrtho) throws InterruptedException
	{
		Thread.sleep(2000);
		
		/*,String PlatinumCustomOrtho,
		String PlatinumAdultCustomOrtho,String GoldAnnualMax,
		String GoldAdultCustomOrtho,*/
	
		/*drop_down.getText();
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB, Keys.ENTER, Keys.ENTER).build().perform();
		Thread.sleep(4000);*/
		
		System.out.println("Test123");
		
		platinum_Network.click();
		Gold_Network.click();	
		Thread.sleep(1000);
		System.out.println("Test456");
		
		/*
		
		Platinum_Custom_Ortho.sendKeys(PlatinumCustomOrtho);
		Thread.sleep(2000);
		
		gold_custom_annual_max.sendKeys(GoldAnnualMax);
		Thread.sleep(2000);
		Gold_Custom_Adult_Ortho.sendKeys(GoldAdultCustomOrtho);
		Thread.sleep(2000);*/
		platinum_custom_annual_max.sendKeys(PlatinumAnnualMax);
		Thread.sleep(2000);
		Platinum_Custom_Adult_Ortho.sendKeys(PlatinumAdultCustomOrtho);
		Thread.sleep(2000);
		Gold_Custom_Ortho.sendKeys(GoldCustomOrtho);
		Thread.sleep(2000);
		step4_next_button.click();
	}
	
	public void step5_enrol_dates(String InitialOpenEnrollmentPeriodFromDate,
			String InitialOpenEnrollmentPeriodToDate,
			String InitialCoveragePeriodFromDate,String Re_enrollmentOpenEnrollmentStartDate,
			String Re_enrollmentOpenEnrollmentToDate,String Re_enrollmentPlanSwitchDate) throws InterruptedException
	{
		String abc = Initial_Enroll_header.getText();
		if(abc.equalsIgnoreCase("Initial Enrollment"))
		{
		System.out.println("Identified text is same as expected");
			}
		else
		{
			System.out.println("Identified text is not same as expected");
		}
		
		/*Actions act_tab = new Actions(driver);
		
		act_tab.sendKeys(Keys.TAB,Keys.ENTER);*/
		Thread.sleep(2000);
		Initial_open_enrollment_period_from_date.sendKeys(InitialOpenEnrollmentPeriodFromDate);
		Thread.sleep(2000);
		Initial_open_enrollment_period_to_date.sendKeys(InitialOpenEnrollmentPeriodToDate);
		Thread.sleep(2000);
		Initial_coverage_period_from_date.sendKeys(InitialCoveragePeriodFromDate);
		Thread.sleep(2000);
		Re_enrollment_open_enrollment_start_date.sendKeys(Re_enrollmentOpenEnrollmentStartDate);
		Thread.sleep(2000);
		Re_enrollment_open_enrollment_to_date.sendKeys(Re_enrollmentOpenEnrollmentToDate);
		Thread.sleep(2000);
		Re_enrollment_plan_switch_date.sendKeys(Re_enrollmentPlanSwitchDate);
		Thread.sleep(2000);
		submit_button.click();
		Thread.sleep(2000);
	}
	}
	
/*List <WebElement> list_of_elements = driver.findElements(By.xpath("//span[@role='menuitem']"));
int list_size=list_of_elements.size();
for(int i=1;i<=list_size;i++)
{
	WebElement element = list_of_elements.get(i);
	
	String text = element.getAttribute("name");
	
	if(text.equalsIgnoreCase("Custom Plan"))
	{
		System.out.println("identified link");
		element.click();
		break;
		
	}*/
