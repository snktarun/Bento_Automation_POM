package com.Bento.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Bento.qa.base.TestBase;
import com.Bento.qa.pages.DentistSigninPage;


public class DentistSigninTest extends TestBase {
	
	DentistSigninPage dentistsignin;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization("Dentist"); // Call initialization method from testBase class
		dentistsignin = new DentistSigninPage();
		Thread.sleep(2000);
		}
	
/*	@Test(priority =0)
	 public void loginWithvalidPassword() throws InterruptedException, IOException {
		 
		  // Login with valid Password
		  
		System.out.println("successfully login");
		dentistsignin.DentistLogin(prop.getProperty("dentistid"),prop.getProperty("dentistpassword"));
		driver.close();
		}*/
	
	@Test(priority =0)
	 public void loginWithinvalidPassword() throws InterruptedException, IOException {
		 
		  // Login with valid Password
		  
		
		dentistsignin.DentistLogin(prop.getProperty("dentistid"),prop.getProperty("dentistinvalidpassword"));
		System.out.println("successfully login");
		 }
		}
