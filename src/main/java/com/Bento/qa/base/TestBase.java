package com.Bento.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Bento.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	/*public static HSSFWorkbook workbook;
	public static HSSFSheet sheet;
	public static HSSFCell cell;*/
	
	
	//Contructor method to initialize config.properties
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/home/tarun/workspace1/HelloWorldWork/Bento_Automation/src/main/java/com/Bento/qa/config/config.properties");
			
			prop.load(ip);
								
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	/*public void TestBase() 
	{
		try{
			//finding the file location
			File src = new File("home/tarun/workspace1/HelloWorldWork/Bento_Automation/Resources/Bento_Data.xls");
		//load the file 
			FileInputStream load_file = new FileInputStream(src);
		}catch(FileNotFoundException x){
		x.printStackTrace();
		}catch(Exception x1){
			x1.printStackTrace();
		}
		//load the workbook
		workbook = new HSSFWorkbook();
		
		//load the sheet
		sheet = workbook.getSheetAt(0);
		
		for(int i=2;i<sheet.getLastRowNum();i++)
		{
			
			cell = sheet.getRow(i).getCell(1);
		    cell.setCellType(cell.getCellType());
			String abc = cell.getStringCellValue();
		
		}
		
		*/

	
	//initialization of browsers and handle multiple windows
	public static void initialization() throws InterruptedException {
		
		String browserName = prop.getProperty("browser");//Read the browser property in config.properties file
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","/home/tarun/workspace1/HelloWorldWork/Bento_Automation/Resources/chromedriver");
			
			driver = new ChromeDriver();
			
			driver.manage().window().fullscreen();
			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "/home/tarun/workspace1/HelloWorldWork/Bento_Automation/Resources/geckodriver");
			
			driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			
		}	
		
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("url3"));
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		
		/* Code for handle multiple windows */

		  String mainWindow = driver.getWindowHandle();

		  Thread.sleep(3000);

		  System.out.println(mainWindow);

		  Set < String > set = driver.getWindowHandles();//To get all windows
		  
		  System.out.println("Total number of windows opened "+set.size());
		  
		  if(set.size()>1) {
		  
			  System.out.println(set);
			
			  // Using Iterator to iterate with in windows
			  Iterator < String > itr = set.iterator();
			
			  while (itr.hasNext()) {
			
			   String childWindow = itr.next();
			
			   //System.out.println(childWindow);
			
			   // Compare whether the main windows is not equal to child window. If not equal, we will close.
			   if (!mainWindow.equals(childWindow)) {
			
			    driver.switchTo().window(childWindow);
			
			    //System.out.println(driver.switchTo().window(childWindow).getTitle());
			
			    driver.close(); //Close child window
			   }
			  }
			  // This is to switch to the main window
			  driver.switchTo().window(mainWindow);
		  
		  }

		 }
		
}
