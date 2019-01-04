package com.Bento.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Bento.qa.base.TestBase;
import com.Bento.qa.pages.EmployerSignupStep2;
import com.Bento.qa.pages.LoginPage;

public class SignupStep2Test extends TestBase{
	
	public SignupStep2Test() {
		super();
	}
	
	EmployerSignupStep2 SignupStep2;
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization(); // Call initialization method from testBase class
		SignupStep2 = new EmployerSignupStep2();
		Thread.sleep(2000);
		}
	
	@Test(priority = 0)
	 public void LoginStep2WithValidPassword() throws InterruptedException, IOException {
		 /*
		  * Login with valid Password
		  */
		System.out.println("successfully login");
		
		SignupStep2.employerlogin(prop.getProperty("empid"),prop.getProperty("pwd"));
		Thread.sleep(5000);
		System.out.println("payment bank information");
		
		SignupStep2.Step2_Payment_Information(prop.getProperty("bank_account"),prop.getProperty("confirm_bank_account"),
				prop.getProperty("bank_routing"),prop.getProperty("confirm_bank_routing"),prop.getProperty("Bank_name"),
				prop.getProperty("Account_holder_name"),prop.getProperty("date_of_birth"),prop.getProperty("tax_id"));
		
			}
	//prop.getProperty("director_dob"),prop.getProperty("director_last_4_ssn"),
	
	
	/*@Test(priority = 1)
	public void PaymentPageStep2 () throws InterruptedException
	{

		SignupStep2.Step2_Payment_Information(prop.getProperty("bank_account"),prop.getProperty("confirm_bank_account"),
			prop.getProperty("bank_routing"),prop.getProperty("confirm_bank_routing"),prop.getProperty("director_dob"),prop.getProperty("director_last_4_ssn"),
			prop.getProperty("name_bank_account"));
}*/
	
}
