package com.pages;

import com.common.GenericImplementation;

public class HomePage extends GenericImplementation {
	
	public static String welComLablActVal = prop.getProperty("homPagWelcomLablActVal");
	public static String welComLablLocatrVal = prop.getProperty("welcomLabl_Xpath");
	public static String crmBtnLocatorVal = prop.getProperty("crmBtn_ByLink");	
	
	public HomePage verifyHomePage () {	 	
		verifyTextContainsByXpath(welComLablLocatrVal, welComLablActVal);
		return this;
	}
	
	public MyHomPage clickCRMBtn() throws Exception {
	
		clickByLink(crmBtnLocatorVal);
		return new MyHomPage();
	}	

}

