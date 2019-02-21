package com.Bento.qa.testcases;


import com.Bento.qa.base.TestBase;

public class tvtest extends TestBase {
	
/*	@Test
	public void tvmethod () throws InterruptedException
	{
		initialization("tv");
		List allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total links available in Techvedika site " + allLinks.size());
		Thread.sleep(4000);
		for(int i=1;i<allLinks.size();i++){
			System.out.println(allLinks.get(i));
	
		}*/
	
	public static void main (String [] args)
	{
		
		String s1 = "tarun";
		String rev ="";
		int len = s1.length();
		
		for(int a=len-1;a>=0;a--)
		{
			rev = rev + s1.charAt(a);
			
		}
		
		System.out.println(rev);	
	}
	
	}

