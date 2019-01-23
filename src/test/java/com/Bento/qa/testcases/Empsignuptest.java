package com.Bento.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Bento.qa.base.TestBase;
import com.Bento.qa.pages.Employersignuppage;
import com.Bento.qa.pages.LoginPage;


public class Empsignuptest extends TestBase {
	
Employersignuppage empsignup ;

public Empsignuptest()
{
	super();
}

@BeforeMethod
public void setUp() throws InterruptedException {
	initialization(); // Call initialization method from testBase class
	empsignup = new Employersignuppage();
	Thread.sleep(2000);
	}

@Test
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
	//empsignup.exit_browser();
}

}
