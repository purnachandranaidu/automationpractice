package com.atp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atp.testcases.BaseClass;

public class ProductCategeory extends BaseClass {
	
	public ProductCategeory()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='JavaScript']")WebElement categoryBooks;
	
	public void prdctcat()
	{
		categoryBooks.click();
	}

}
