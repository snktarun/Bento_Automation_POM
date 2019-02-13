package com.Bento.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Bento.qa.base.TestBase;
import com.Bento.qa.pages.EmployerSignupStepsPages;
import com.Bento.qa.pages.Employersignuppage;
import com.Bento.qa.pages.GmailPage;
import com.Bento.qa.pages.LoginPage;
import com.Bento.qa.util.TestUtil;


public class Empsignuptest extends TestBase {
	
Employersignuppage empsignup ;

GmailPage gmailp;

EmployerSignupStepsPages empsignupsteps;

LoginPage lognpage;

@BeforeTest
public void setUp() throws InterruptedException {
	initialization("Employer"); // Call initialization method from testBase class
	empsignup = new Employersignuppage();
	Thread.sleep(1000);
	}

@Test(priority=0)
public void signuplink_click() throws InterruptedException
{
	
	empsignup.new_signup_click();
	empsignup.companydetails(prop.getProperty("CompanyName"),
			prop.getProperty("CompanyAddress1"),prop.getProperty("CompanyAddress2"),
			prop.getProperty("CityName"),prop.getProperty("State"),prop.getProperty("ZipCode"),
			prop.getProperty("FirstName"),prop.getProperty("LastName"),prop.getProperty("MiddleName"),
			prop.getProperty("Email"),prop.getProperty("PhoneNumber"));

	empsignup.clickcheckbox();
	empsignup.signup_button();
	Thread.sleep(2000);
	empsignup.exit_browser();
	Thread.sleep(1000);
}

@Test(priority=1)
public void setup() throws InterruptedException
{
	initialization("gmail");
	gmailp = new GmailPage();
	Thread.sleep(2000);
			
	}

@Test(priority=2)
public void gmailsignintest()throws InterruptedException,IOException 
{
	System.out.println("gmail test done");
	gmailp.gmailsignin(prop.getProperty("Emailid"),prop.getProperty("Gmailpwd"));
	Thread.sleep(2000);
	gmailp.quitgmail();
	Thread.sleep(2000);
}
@Test(priority=3)
public void employerlauncher() throws InterruptedException,IOException  {
	
	initialization("Employer");
	Thread.sleep(2000);
	System.out.println("launch employer browser");
}

@Test(priority=4)
public void employerlogin() throws InterruptedException,IOException  {
	
	
	empsignupsteps.employerlogin();
	//lognpage.employerlogin();
	System.out.println("successfully login");
	Thread.sleep(4000);
	
	//Step-3
	empsignupsteps.Step3_Payment_Information(prop.getProperty("bank_account"),prop.getProperty("confirm_bank_account"),
			prop.getProperty("bank_routing"),prop.getProperty("confirm_bank_routing"),prop.getProperty("Bank_name"),
			prop.getProperty("Account_holder_name"),prop.getProperty("date_of_birth"),prop.getProperty("tax_id"));
	Thread.sleep(3000);
	
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	
	System.out.println("payment bank information filled successfully");
	
	
	//Step-4
	empsignupsteps.step4_select_plans(prop.getProperty("PlatinumAnnualMax"),prop.getProperty("PlatinumAdultCustomOrtho"),
	                        		prop.getProperty("GoldCustomOrtho"));
	System.out.println("step-4 info");

	
	//Step -5
	empsignupsteps.step5_enrol_dates(prop.getProperty("InitialOpenEnrollmentPeriodFromDate"),
			prop.getProperty("InitialOpenEnrollmentPeriodToDate"),
			prop.getProperty("InitialCoveragePeriodFromDate"),
			prop.getProperty("Re_enrollmentOpenEnrollmentStartDate"),
			prop.getProperty("Re_enrollmentOpenEnrollmentToDate"),
			prop.getProperty("Re_enrollmentPlanSwitchDate"));
}

}