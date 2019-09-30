package com.atp.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.atp.testcases.BaseClass;


public class ShippingAaddress extends BaseClass {
	
	public ShippingAaddress()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="billing_first_name")WebElement firsrtname;
	@FindBy(id="billing_last_name")WebElement lastname;
	@FindBy(id="billing_email")WebElement email;
	@FindBy(id="billing_phone")WebElement phone;
	@FindBy(id="billing_address_1")WebElement address;
	@FindBy(id="billing_city")WebElement city;
	@FindBy(id="billing_postcode")WebElement postalcode;
	
	public void fname(String ftname)
	{
		firsrtname.sendKeys(ftname);
	}

	public void lname(String ltname)
	{
		lastname.sendKeys(ltname);
	}
	public void email(String mail)
	{
		email.sendKeys(mail);
	}
	public void phone(String ph)
	{
		phone.sendKeys(ph);
	}
	public void address(String add)
	{
		address.sendKeys(add);
	}
	public void city(String cit)
	{
		city.sendKeys(cit);
	}
	public void postal(String pin)
	{
		postalcode.sendKeys(pin);
	}
	public void dropdown()
	{
		Select drpdown=new Select(driver.findElement(By.id("s2id_autogen2_search")));
		drpdown.selectByIndex(1);
	}
	
	
	
	
}
