package com.Bento.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Bento.qa.base.TestBase;
import com.Bento.qa.pages.DentistSignupPage;

public class DentistSignupTest extends TestBase {
	
	DentistSignupPage dentistsignup;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization("Dentist"); // Call initialization method from testBase class
		dentistsignup = new DentistSignupPage();
		Thread.sleep(2000);
	}
	
	
	@Test(priority =0)
	 public void loginWithvalidPassword() throws InterruptedException, IOException 
		 {
		dentistsignup.step1(prop.getProperty("Dentistemail"),prop.getProperty("practicename"),prop.getProperty("practticeurl"),
				prop.getProperty("BusinessName"),prop.getProperty("EIN"),prop.getProperty("BusinessTaxID"),
				prop.getProperty("BusinessAddress1"),prop.getProperty("BusinessAddress2"),prop.getProperty("BusinessCity"),
				prop.getProperty("StateName"),prop.getProperty("BusinessZipcode"),prop.getProperty("OwnerFirstName"),
				prop.getProperty("OwnerMiddleName"),prop.getProperty("OwnerLastName"),prop.getProperty("OwnerDOB")
				,prop.getProperty("OwnerLast4SSN"));
		 }
	}

