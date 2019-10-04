package com.atp.testcases;

import org.testng.annotations.Test;

import com.atp.pageobjects.HomePage_Sliders;
import com.atp.pageobjects.Shop_FilterPrice;

public class TC_006_FilterByPrice extends BaseClass {
	
	@Test(priority = 10)
	public void priceFilter()
	{
		HomePage_Sliders.shop_link();
		Shop_FilterPrice filter=new Shop_FilterPrice();
		filter.filterByPrice();
		filter.filterPrice();
	}

}
