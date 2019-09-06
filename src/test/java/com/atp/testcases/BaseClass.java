package com.atp.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.atp.utilities.ReadConfig;

public class BaseClass {
	
	public static WebDriver driver;
	public static String timestamp;
	public static String errorMsg;
	
	ReadConfig readconfig=new ReadConfig();
	public String url=readconfig.getApplicationurl();
	
	
	@BeforeSuite
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\EdgeDriver\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	@AfterSuite(enabled = false)
	public void tearDown()
	{
		driver.close();
	}
	
	public void capturescreen(WebDriver driver, String tname) throws IOException
	{
		timestamp=tname;
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir") + "/Screenshots/"+ timestamp + ".png");
		FileHandler.copy(source, target);
		System.out.println("screenshot taken");
		
	}

}
