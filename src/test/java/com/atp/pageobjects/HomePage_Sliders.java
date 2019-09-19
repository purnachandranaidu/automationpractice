package com.atp.pageobjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atp.testcases.BaseClass;

public class HomePage_Sliders extends BaseClass 
{
	
	public HomePage_Sliders()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@id='menu-item-40']//a[1]") WebElement shop;
	@FindBy(xpath = "//a[text()='Home']")WebElement retunhome;
	
	
	public void shop_link()
	{
		shop.click();
	}
	
	public void home_return()
	{
		retunhome.click();
	}
	
	public void count()
	{
		java.util.List<WebElement> list=driver.findElements(By.tagName("h3"));
		list.size();
		System.out.println(list.size());
	}
}
