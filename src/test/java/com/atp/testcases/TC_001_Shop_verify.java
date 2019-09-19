package com.atp.testcases;



import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import com.atp.pageobjects.HomePage_Sliders;

public class TC_001_Shop_verify extends BaseClass {
	@Test(priority=1)
	public void Title_Verification() throws IOException
	{
		HomePage_Sliders slider=new HomePage_Sliders();
		slider.shop_link();
		
		
		
		try {
			String actal = driver.findElement(By.xpath("//button[@class='button']")).getText();
			String expected="Filter";
			if(actal.equalsIgnoreCase(expected))
			{
				AssertJUnit.assertTrue(true);
				System.out.println("Page Navigated succcessfully");
			}
			else {
				throw new Exception("Page navigation fails");
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
	@Test(priority = 2)
	public void count_slides()
	{
		HomePage_Sliders slider=new HomePage_Sliders();
		slider.home_return();
		slider.count();
	}
}
