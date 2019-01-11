package com.Bento.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Bento.qa.base.TestBase;
import com.Bento.qa.pages.EmployerSignupStep2;
import com.Bento.qa.pages.LoginPage;
import com.Bento.qa.util.TestUtil;

public class SignupStep2Test extends TestBase{
	
	public SignupStep2Test() {
		super();
	}
	
	EmployerSignupStep2 SignupStep2;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization(); // Call initialization method from testBase class
		SignupStep2 = new EmployerSignupStep2();
		//Thread.sleep(2000);
		}
	
	@Test(priority = 0)
	 public void LoginStep2WithValidPassword() throws InterruptedException, IOException {
		 /*
		  * Login with valid Password
		  */
		SignupStep2.employerlogin(prop.getProperty("empid"),prop.getProperty("pwd"));
		System.out.println("successfully login");
		Thread.sleep(4000);
		//Step-3
		SignupStep2.Step3_Payment_Information(prop.getProperty("bank_account"),prop.getProperty("confirm_bank_account"),
				prop.getProperty("bank_routing"),prop.getProperty("confirm_bank_routing"),prop.getProperty("Bank_name"),
				prop.getProperty("Account_holder_name"),prop.getProperty("date_of_birth"),prop.getProperty("tax_id"));
		Thread.sleep(3000);
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		System.out.println("payment bank information filled successfully");
		
		//Step-4
		SignupStep2.step4_select_plans(prop.getProperty("PlatinumAnnualMax"),prop.getProperty("PlatinumAdultCustomOrtho"),
				prop.getProperty("GoldCustomOrtho"));
		
				/*
				prop.getProperty("Platinum_Custom_Ortho"),prop.getProperty("GoldAnnualMax"),
				prop.getProperty("GoldAdultCustomOrtho"),*/
		System.out.println("step-4 info");
		
		//Step -5
		SignupStep2.step5_enrol_dates(prop.getProperty("InitialOpenEnrollmentPeriodFromDate"),
				prop.getProperty("InitialOpenEnrollmentPeriodToDate"),
				prop.getProperty("InitialCoveragePeriodFromDate"),
				prop.getProperty("Re_enrollmentOpenEnrollmentStartDate"),
				prop.getProperty("Re_enrollmentOpenEnrollmentToDate"),
				prop.getProperty("Re_enrollmentPlanSwitchDate"));
				}
}
