package com.atp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atp.testcases.BaseClass;

public class Addtocart extends BaseClass {
	
	public Addtocart()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul[@class='products']/li/a/img")WebElement image1;
	@FindBy(xpath = "//button[@class='single_add_to_cart_button button alt']")WebElement Addcartbutton;
	@FindBy(xpath = "//img[@alt='Selenium Ruby']")WebElement Imageclick;

	
	public void image_nav()
	{
		image1.click();
	}
	public void Addbutton()
	{
		Addcartbutton.click();
	}
	
	public void Image()
	{
		Imageclick.click();
	}
	
	

}
