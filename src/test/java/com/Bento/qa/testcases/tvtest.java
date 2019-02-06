package com.Bento.qa.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Bento.qa.base.TestBase;

public class tvtest extends TestBase {
	
	@Test
	public void tvmethod () throws InterruptedException
	{
		initialization("tv");
		List allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total links available in Techvedika site " + allLinks.size());
		Thread.sleep(4000);
		for(int i=1;i<allLinks.size();i++){
			System.out.println(allLinks.get(i));
	
		}
		
	
	}
}
