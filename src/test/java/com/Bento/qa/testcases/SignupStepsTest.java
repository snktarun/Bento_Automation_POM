package com.Bento.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Bento.qa.base.TestBase;
import com.Bento.qa.pages.EmployerSignupStepsPages;
import com.Bento.qa.pages.GmailPage;
import com.Bento.qa.pages.LoginPage;
import com.Bento.qa.util.TestUtil;

public class SignupStepsTest extends TestBase{
	
/*	public SignupStepsTest() {
		super();
	}*/
	
	EmployerSignupStepsPages SignupSteps;
	GmailPage gmailp;
	
	@BeforeTest
	public void setup() throws InterruptedException
	{
		initialization("gmail");
		
		gmailp = new GmailPage();
		Thread.sleep(2000);
		
		}
	@BeforeClass
	public void gmailsignintest()throws InterruptedException
	{
		System.out.println("gmail test done");
		gmailp.gmailsignin(prop.getProperty("Emailid"),prop.getProperty("Gmailpwd"));
		
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization("Employer"); // Call initialization method from testBase class
		SignupSteps = new EmployerSignupStepsPages();
		//Thread.sleep(2000);
		}
	
	@Test(priority = 0)
	 public void LoginStep2WithValidPassword() throws InterruptedException, IOException {
		 /*
		  * Login with valid Password
		  */
		SignupSteps.employerlogin(TestBase.EmployerID,TestBase.Password/*prop.getProperty("empid"),prop.getProperty("pwd")*/);
		System.out.println("successfully login");
		Thread.sleep(4000);
		
		//Step-3
		SignupSteps.Step3_Payment_Information(prop.getProperty("bank_account"),prop.getProperty("confirm_bank_account"),
				prop.getProperty("bank_routing"),prop.getProperty("confirm_bank_routing"),prop.getProperty("Bank_name"),
				prop.getProperty("Account_holder_name"),prop.getProperty("date_of_birth"),prop.getProperty("tax_id"));
		Thread.sleep(3000);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		System.out.println("payment bank information filled successfully");
		
		
		//Step-4
		SignupSteps.step4_select_plans(prop.getProperty("PlatinumAnnualMax"),prop.getProperty("PlatinumAdultCustomOrtho"),
		                        		prop.getProperty("GoldCustomOrtho"));
		System.out.println("step-4 info");
	
		
		//Step -5
		SignupSteps.step5_enrol_dates(prop.getProperty("InitialOpenEnrollmentPeriodFromDate"),
				prop.getProperty("InitialOpenEnrollmentPeriodToDate"),
				prop.getProperty("InitialCoveragePeriodFromDate"),
				prop.getProperty("Re_enrollmentOpenEnrollmentStartDate"),
				prop.getProperty("Re_enrollmentOpenEnrollmentToDate"),
				prop.getProperty("Re_enrollmentPlanSwitchDate"));
				}
}
