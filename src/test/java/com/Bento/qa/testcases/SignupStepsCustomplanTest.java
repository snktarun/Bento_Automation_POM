package com.Bento.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Bento.qa.base.TestBase;
import com.Bento.qa.pages.EmployerSignupStepsCustomplan;

import com.Bento.qa.util.TestUtil;

public class SignupStepsCustomplanTest extends TestBase{
	
	public SignupStepsCustomplanTest() {
		super();
	}
	
	EmployerSignupStepsCustomplan SignupSteps;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization("Employer"); // Call initialization method from testBase class
		SignupSteps = new EmployerSignupStepsCustomplan();
		//Thread.sleep(2000);
		}
	
	@Test(priority = 0)
	 public void LoginStep2WithValidPassword() throws InterruptedException, IOException {
		 /*
		  * Login with valid Password
		  */
		SignupSteps.employerlogin(prop.getProperty("empid"),prop.getProperty("pwd"));
		System.out.println("successfully login");
		Thread.sleep(4000);
	   /* //Step-3
		SignupSteps.Step3_Payment_Information(prop.getProperty("bank_account"),prop.getProperty("confirm_bank_account"),
				prop.getProperty("bank_routing"),prop.getProperty("confirm_bank_routing"),prop.getProperty("Bank_name"),
				prop.getProperty("Account_holder_name"),prop.getProperty("date_of_birth"),prop.getProperty("tax_id"));
		Thread.sleep(2000);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		System.out.println("payment bank information filled successfully");*/
		
		//Step-4
		SignupSteps.step4_select_plans(prop.getProperty("AddAmount"),prop.getProperty("OrthoAmount"),prop.getProperty("AdultAmount"));
		Thread.sleep(2000);	
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		System.out.println("custom plan fields filled successfully");
		
		//Step -5
		SignupSteps.step5_enrol_dates(prop.getProperty("InitialOpenEnrollmentPeriodFromDate"),
				prop.getProperty("InitialOpenEnrollmentPeriodToDate"),
				prop.getProperty("InitialCoveragePeriodFromDate"),
				prop.getProperty("Re_enrollmentOpenEnrollmentStartDate"),
				prop.getProperty("Re_enrollmentOpenEnrollmentToDate"),
				prop.getProperty("Re_enrollmentPlanSwitchDate"));
				}
}

