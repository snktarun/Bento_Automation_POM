package com.Bento.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Bento.qa.base.TestBase;

public class EmployerSignupStepsCustomplan extends TestBase {

	

	public EmployerSignupStepsCustomplan() {
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
	
	//Drop down element
		@FindBy(xpath="//*[@id='root']/div/div[2]/div[3]/div/div[1]/div/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
		WebElement drop_down;
		
	//select plan - Custom Plans
	@FindBy(xpath = "//div[@id='root']/following-sibling::div[3]/div[1]/div[1]/div[1]/div[2]/span") 
	WebElement customplan;
	
	//Customize Benifits:
	//cleaning per 12 months
	@FindBy(xpath="//div[@class='padL15']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]") 
	WebElement cleaning12m;
	
	@FindBy(xpath="//div[@id='root']/following-sibling::div[2]/div[1]/div[1]/div[1]/div[2]/span")
	WebElement cleaning1;
	
	//exam per 12 months
		
	@FindBy(xpath="//div[@class='padL15']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]")
	WebElement exam12m;
	
	@FindBy(xpath="//div[@id='root']/following-sibling::div[2]/div[1]/div[1]/div[1]/div[3]/span")
	WebElement exam1;
	
	//bitewing per 12 months
	@FindBy(xpath ="//div[@class='padL15']/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]")
	WebElement bitewing;
	
	//Additional fixed amount
	@FindBy(xpath ="//input[contains(@name,'additionalFixedAmount')]")
	WebElement addamount;
	
	//Standard ortho benefit
	@FindBy(xpath="//input[contains(@name,'StandardAmount')]")
	WebElement orthoamount;
	
	//Adult ortho benefit
	@FindBy(xpath="//input[contains(@name,'AdultAmount')]")
	WebElement adultamount;
		
		//platinum doctor accesss
		@FindBy(xpath="//div[@id='root'] /div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/input")
	WebElement platinumdocaccess;
		
		//Next buton
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
	
	public void step4_select_plans(String AddAmount,String OrthoAmount,String AdultAmount) throws InterruptedException
	{
		/*Thread.sleep(1000);
		drop_down.click();*/
		System.out.println("custom plan entering");
		Thread.sleep(1000);
		customplan.click();
		Thread.sleep(1000);
		cleaning12m.click();
		Thread.sleep(1000);
		cleaning1.click();
		Thread.sleep(1000);
		exam12m.click();
		Thread.sleep(1000);
		exam1.click();
		Thread.sleep(1000);
		bitewing.click();
		Thread.sleep(1000);
		addamount.sendKeys("AddAmount");
		Thread.sleep(1000);
		orthoamount.sendKeys("OrthoAmount");
		Thread.sleep(1000);
		adultamount.sendKeys("AdultAmount");
		Thread.sleep(1000);
		platinumdocaccess.click();
		Thread.sleep(1000);
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
