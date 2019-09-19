package com.atp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atp.testcases.BaseClass;

public class ProceedCheckout extends BaseClass {
	
	public ProceedCheckout()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")WebElement proceedcheckout;
	
	public void checkout()
	{
		proceedcheckout.click();
	}

}
