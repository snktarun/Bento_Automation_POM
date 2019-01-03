package com.Bento.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Bento.qa.base.TestBase;
import com.Bento.qa.pages.LoginPage;

public class LoginTest extends TestBase {
	LoginPage loginPage;
	
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization(); // Call initialization method from testBase class
		loginPage = new LoginPage();
		Thread.sleep(2000);
		}
	
	@Test
	 public void loginWithvalidPassword() throws InterruptedException {
		 /*
		  * Login with valid Password
		  */
		System.out.println("successfully login");
		loginPage.employerlogin(prop.getProperty("empid"),prop.getProperty("pwd"));
		Thread.sleep(5000);
			}
	
//	 @Test(priority = 2)
//	 public void loginWithInvalidPhoneNumber() throws InterruptedException {
//		 
//		 /*
//		  * Login with invalid phone Number
//		  * Verify invalid phone number error text
//		  */
//
//	  loginPage.login("998900141", prop.getProperty("password"));
//	  
//	  Thread.sleep(1000);
//
//	  String invalidPhoneNumberErrorMsg = loginPage.getErrorMsgUnderMobileNumber(); //Get Invalid phone number Error Msg
//
//	  System.out.println("Actual : " + invalidPhoneNumberErrorMsg + " &&& Excpected : Enter valid mobile number");
//
//	  Assert.assertEquals(invalidPhoneNumberErrorMsg, "Enter valid mobile number");
//	  
//	 }
//
//	 @Test(priority = 3)
//	 public void loginWithValidPhoneNumberButNotRegistered() throws InterruptedException {
//		 
//		 /*
//		  * Login with Valid Phone Number but not registered
//		  * Verify phone number not registered error text
//		  */
//
//	  loginPage.login("9989001410", prop.getProperty("password"));
//		 
//	  Thread.sleep(1000);
//
//	  String validPhoneNumberButNotRegisteredErrorMsg = loginPage.getErrorMsgUnderMobileNumber(); //Get Invalid Username Error Msg
//
//	  System.out.println("Actual : " + validPhoneNumberButNotRegisteredErrorMsg + " &&& Excpected : Your mobile number is not register with us.");
//
//	  Assert.assertEquals(validPhoneNumberButNotRegisteredErrorMsg, "Your mobile number is not register with us.");
//	  
//	 }
//
//
//	 @Test(priority = 4)
//	 public void loginWithEmptydPhoneNumber() throws InterruptedException {
//		 /*
//		  * Login with empty phone number
//		  * Verify empty password error text
//		  */
//
//  loginPage.login("", prop.getProperty("password"));
//		 
//	  Thread.sleep(1000);
//
//	  String emptydPhoneNumberErrorMsg = loginPage.getErrorMsgUnderMobileNumber(); //Get enter phone number Error Msg
//
//	  System.out.println("Actual : " + emptydPhoneNumberErrorMsg + " &&& Excpected : Enter your mobile number");
//
//	  Assert.assertEquals(emptydPhoneNumberErrorMsg, "Enter your mobile number");
//
//	 }
//
//	 @Test(priority = 5)
//	 public void loginWithEmptydPassword() throws InterruptedException {
//		 /*
//		  * Login with empty password
//		  * Verify empty password error text
//		  */
//
//	  loginPage.login(prop.getProperty("phoneNumber"), "");
//		 
//	  Thread.sleep(1000);
//
//	  String emptyPasswordErrMsg = loginPage.getErrorMsgUnderPassword(); //Get Invalid Username Error Msg
//
//	  System.out.println("Actual : " + emptyPasswordErrMsg + " &&& Excpected : Enter password");
//
//	  Assert.assertEquals(emptyPasswordErrMsg, "Enter password");
//
//	 }
//
//	 @Test(priority = 6)
//	 public void loginWithValidCredentials() throws InterruptedException {
//		 /*
//		  * Login with valid credentials
//		  * Verify way2sms image && welcome text is displayed or not on dash board screen 
//		  */
//
//	  loginPage.login(prop.getProperty("phoneNumber"), prop.getProperty("password"));
//	  
//	  Thread.sleep(5000);
//
//	  Boolean imagStatus = sideNavWebElements.getWay2SmsImgIsDisplayed();
//	  
//	  Boolean way2SmsImg = true;
//	  
//	  Assert.assertEquals(imagStatus, way2SmsImg);
//
//	  String welcomeSmallText = sideNavWebElements.getWlecomeText();
//
//	  System.out.println("Actual : " + welcomeSmallText + " &&& Excpected : welcome");
//
//	  Assert.assertEquals(welcomeSmallText, "welcome");
//
//	 }
	
//	@AfterMethod
//	public void tearDown() {
//		driver.quit();
//	}
}
