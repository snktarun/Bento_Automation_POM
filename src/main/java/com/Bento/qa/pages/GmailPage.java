package com.Bento.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Bento.qa.base.TestBase;

public class GmailPage extends TestBase {
	
	
	public GmailPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@type='email']") 
	WebElement email ;
	
	@FindBy(xpath = "//*[@id='identifierNext']/content/span[@class='RveJvd snByac']")
	WebElement nextbtn;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement pwd;
	
	@FindBy(xpath = "//*[@id='passwordNext']/content/span[@class='RveJvd snByac']")
	WebElement pwdnext;
	
	@FindBy(xpath = "//*[@class='adn ads']/div[2]/div[3]/div[3]/div[1]/div[1]/div[1]/br[4]")
	WebElement mytext;
	
	
	public void gmailsignin(String emailid,String gpwd) throws InterruptedException
	{
		email.sendKeys(emailid);
		Thread.sleep(1000);
				nextbtn.click();
		Thread.sleep(2000);	
		pwd.sendKeys(gpwd);
		Thread.sleep(1000);
		pwdnext.click();
		Thread.sleep(2000);	
		
		List <WebElement> inbox = driver.findElements(By.xpath("//*[@class='zA yO']"));
		System.out.println("entered into the list ");
		//String mytext = "Your Bento Plan Coverage Has Started";
		
		for(int i=0;i<inbox.size();i++)
		{
			
			inbox.get(i).click();
				System.out.println("my mail is find successfully");
			break;
		}
		Thread.sleep(1000);
		String emplertextid = mytext.getText();
		
		System.out.println(emplertextid);	
	}
	
	}
