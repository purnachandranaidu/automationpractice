package com.atp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atp.testcases.BaseClass;

public class ViewBasket extends BaseClass {
	
	public ViewBasket()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='button wc-forward']") WebElement basketbtn;
	
	public void clickbasket()
	{
		basketbtn.click();
	}

}
