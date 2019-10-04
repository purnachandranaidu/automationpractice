package com.atp.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.atp.testcases.BaseClass;

public class Shop_FilterPrice extends BaseClass {
	
	public Shop_FilterPrice()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Filter']")WebElement Filterbtn;
	
	
	public void filterByPrice()
	{
		WebElement slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-state-default ui-corner-all']"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider,297, 380).build().perform();
	}
public void filterPrice()
{
	Filterbtn.click();
}
}
