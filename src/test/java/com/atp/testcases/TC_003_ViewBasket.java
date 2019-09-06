package com.atp.testcases;

import org.testng.annotations.Test;


import com.atp.pageobjects.ViewBasket;

public class TC_003_ViewBasket extends BaseClass {
	
	@Test(priority = 7)
	public void Basket()
	{
		try {
			Thread.sleep(5000);
			ViewBasket basket=new ViewBasket();
			Thread.sleep(5000);
			basket.clickbasket();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

}
