package com.atp.testcases;

import org.testng.annotations.Test;
import com.atp.pageobjects.ShippingAaddress;
import com.atp.utilities.XLUtilities;

public class TC_005_ShippingAddress extends BaseClass {
	
	@Test(priority = 9,dataProvider = "registerdata",dataProviderClass = XLUtilities.class)
	public void ShippinDetails(String ffname,String llname,String mails,String phones,String Add,String town,String zip) throws InterruptedException
	{
		ShippingAaddress address=new ShippingAaddress();
		address.fname(ffname);
		Thread.sleep(1000);
		address.lname(llname);
		Thread.sleep(1000);
		address.email(mails);
		Thread.sleep(1000);
		address.phone(phones);
		Thread.sleep(1000);
		address.address(Add);
		Thread.sleep(1000);
		address.city(town);
		Thread.sleep(1000);
		address.postal(zip);
		Thread.sleep(1000);
		/* address.dropdown(); */
		
		
	}

}
