package com.atp.testcases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.atp.pageobjects.Addtocart;

public class TC_002_Addtocart extends BaseClass {
	
	@Test(priority = 3)
	
	public void Additem() throws IOException
	{
		Addtocart item=new Addtocart();
		item.image_nav();
		try {
			String btnname=driver.findElement(By.xpath("//button[@class='single_add_to_cart_button button alt']")).getText();
			if(btnname.equalsIgnoreCase("Add to basket"))
			{
				AssertJUnit.assertTrue(true);
				System.out.println("Page navigated sucusss");
			}
			
			else
			{
				AssertJUnit.assertTrue(false);
				System.out.println("Page navigated faild");
			}
			
		} catch (Exception e) {
			errorMsg=e.getMessage();
			timestamp=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
			capturescreen(driver,timestamp);
			System.out.println(e.getMessage());
			//Assert.assertTrue(false);
			Assert.fail(e.getMessage());
			
		}
		
	}

	@Test(priority = 4)
	public void Addbasket()
	{
		Addtocart item=new Addtocart();
		item.Addbutton();
	}
	
	@Test(priority = 5,groups = "Regression")
	public void imageclick()
	{
		Addtocart item=new Addtocart();
		item.Image();
	}
	
	
	
	@Test(priority = 6)
	public void popup() throws InterruptedException
	
	{
		Thread.sleep(5000);
		WebElement ele=driver.findElement(By.xpath("(//div[@class='pp_details']//a)[4]"));
		Thread.sleep(5000);
		System.out.println(ele.getText());
		
		if(ele.isDisplayed()==true)
		{
			System.out.println("Image is Clickble");
		}
		else {
			System.out.println("Image is Not Clicable");
		}
		
		ele.click();
	}
}
