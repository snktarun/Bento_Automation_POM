package com.Bento.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.Bento.qa.base.TestBase;
import com.Bento.qa.pages.AdminPortalPage;

public class AdmiLoginTest extends TestBase {
	AdminPortalPage admin;
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization("Admin");
		
	 admin = new AdminPortalPage();
	Thread.sleep(2000);
		
	}
	
	@Test
	public void logintest() throws InterruptedException
	{
		System.out.println("admin login successfully");
		admin.adminsignin(prop.getProperty("UserName"),prop.getProperty("Password"),prop.getProperty("identifytext"),prop.getProperty("dropdownval"));
		admin.quitwindow();
		
	}
	

}
