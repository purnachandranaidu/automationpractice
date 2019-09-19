package com.atp.testcases;

import org.testng.annotations.Test;
import com.atp.pageobjects.ShippingAaddress;
import com.atp.utilities.XLUtilities;

public class TC_005_ShippingAddress extends BaseClass {
	
	@Test(priority = 9,dataProvider = "registerdata",dataProviderClass = XLUtilities.class,enabled = false)
	public void ShippinDetails(String ffname,String llname,String mails,String phones,String Add,String town,String zip)
	{
		ShippingAaddress address=new ShippingAaddress();
		address.fname(ffname);
		address.lname(llname);
		address.email(mails);
		address.phone(phones);
		address.address(Add);
		address.city(town);
		address.postal(zip);
		
	}

}
