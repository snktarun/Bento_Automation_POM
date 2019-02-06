package com.Bento.qa.pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.MouseAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Bento.qa.base.TestBase;
import com.Bento.qa.util.TestUtil;

public class AdminPortalPage extends TestBase {
	
	@FindBy(xpath = "//input[contains(@type,'text')]") WebElement username;
	@FindBy(xpath = "//input[@type='password']") WebElement password;
	@FindBy(xpath ="//button[@type='button']") WebElement signin;
	@FindBy(xpath = "//button[@data-route='/Employers']") WebElement Employers;
	@FindBy(xpath = "//div[@class = 'home-layout']/div[1]/div[1]/div[1]/div[1]/div[1]/h2") WebElement pendingemptext;
	@FindBy(xpath = "//div[@class = 'home-layout']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table/tbody/tr/td[6]/div/button") WebElement review;
	@FindBy(xpath = "//div[@id='root']/following-sibling::div[2]/div/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]") WebElement statusdropdwon;	
	@FindBy(xpath = "//div[@role='menu']/div[2]/span") WebElement inactive;
	@FindBy(xpath = "//div[@role='menu']/div[1]/span") WebElement active;
	@FindBy(xpath = "//div[@id='root']/following-sibling::div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[9]/div[1]/div[1]/button") WebElement okbutton;
	
	
	
	public AdminPortalPage() {
		PageFactory.initElements(driver, this);
	}
		
	public void adminsignin(String UserName,String Password,String identifytext,String dropdownval) throws InterruptedException
	{
		System.out.println("login page ");
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		username.sendKeys(UserName);
		
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		password.sendKeys(Password);
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		signin.click();
		Thread.sleep(2000);
		Employers.click();
		
		String textdata = pendingemptext.getText();
		if(textdata.equalsIgnoreCase(identifytext))
		{
			System.out.println("Identified as expected text data");
		}
		else 
		{
			System.out.println("Identified as different text data");

		}
		Thread.sleep(2000);
		review.click();
		statusdropdwon.click();
		//inactive.click();
		active.click();
		/*String val = active.getText();
		if(val.equalsIgnoreCase(dropdownval))
		{
			System.out.println("Active text is identified");
		}
		else{
			//
			System.out.println("inactive button is selected");
			
		}*/
		
		okbutton.click();
	
	}
		
		/*public void method1() 
		{
		String mainwindow = driver.getWindowHandle();
		
		Set <String> set = driver.getWindowHandles();
		
	Iterator<String> ite = set.iterator();
	
	while(ite.hasNext())
	{
		System.out.println(ite.next());
		
		String childwindow = ite.next();
		
		if(!mainwindow.equals(childwindow))
		{
			System.out.println("opened window");
			driver.switchTo().window(childwindow);
			System.out.println(driver.switchTo().window(childwindow).getTitle());
			System.out.println("opened window2314234");
		}
	}	
	
		}*/
		public void quitwindow()
		{
			driver.quit();
		}
}