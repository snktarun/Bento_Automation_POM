package com.Bento.qa.testcases;

import java.awt.event.KeyEvent;
import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Bento.qa.base.TestBase;
import com.Bento.qa.pages.GmailPage;

public class GmailTest extends TestBase {
	GmailPage gmailp;
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization("gmail");
	
	    
		gmailp = new GmailPage();
		Thread.sleep(2000);
		
		}
	@Test
	public void gmailsignintest()throws InterruptedException, IOException 
	{
		System.out.println("gmail test done");
		gmailp.gmailsignin(prop.getProperty("Emailid"),prop.getProperty("Gmailpwd"));
		
		}

}
