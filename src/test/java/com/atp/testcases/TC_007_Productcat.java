package com.atp.testcases;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atp.pageobjects.ProductCategeory;

public class TC_007_Productcat extends BaseClass {
	
	@Test(priority = 11)
	public void productCat() throws IOException
	{
		try {
			ProductCategeory items=new ProductCategeory();
			items.prdctcat();
			
			if(driver.findElement(By.xpath("//h3[text()='Functional Programming in JS']")).isDisplayed())
			{
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
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

}
