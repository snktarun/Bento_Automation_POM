package com.Bento.qa.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Bento.qa.base.TestBase;
import com.Bento.qa.util.TestUtil;

import java.util.regex.Pattern;

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
	
	@FindBy(xpath = "//*[@role='listitem']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]/div[1]/a[2]")
	WebElement verifylink;
	
	@FindBy(xpath = "//*[@class='aio UKr6le']/span")
	WebElement inbox;
	
	@FindBy(xpath="//*[@class='gE iv gt']/following-sibling::div[1]/following-sibling::div[1]/div[3]/div[1]/div[1]/div[1]")
	WebElement getempidtext;
	
	public void gmailsignin(String emailid,String gpwd) throws InterruptedException
	{
		
		
		email.sendKeys(emailid);
		Thread.sleep(1000);
				nextbtn.click();
		Thread.sleep(2000);	
		pwd.sendKeys(gpwd);
		Thread.sleep(1000);
		pwdnext.click();
	
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	//open the first mail and click on verify link 
		
		List <WebElement> maillist = driver.findElements(By.xpath("//*[@class='y2']"));
		System.out.println("entered into the list ");
				
		for(int i=0;i<maillist.size();i++)
		{
			
			maillist.get(i).click();
			System.out.println("first mail is opened successfully");
			break;
		}
	//verify link	
		Thread.sleep(1000);
		verifylink.click();
		
		Thread.sleep(2000);
		inbox.click();
		System.out.println("clicked on inbox");
		
		Thread.sleep(2000);
	//open the second mail and get the employer id and password 
		List <WebElement> maillist2 = driver.findElements(By.xpath("//*[@class='y2']"));
		System.out.println("entered into the second list ");
		
		for(int i=0;i<maillist2.size();i++)
		{
			maillist2.get(i).click();
			
			System.out.println("2nd mail is opened successfully ");
			break;
		}
        String getempid = getempidtext.getText();
		
		System.out.println("###### : " + getempid);
		
		String getempid1[] = getempid.split("\n");
		
        String EmployerID = getempid1[4].split(":")[1];
        String Password = getempid1[5].split(":")[1];

		System.out.println("****** : " + getempid1[4].split(":")[1]);
		System.out.println("****** : " + getempid1[5].split(":")[1]);
		
}
	
	}
