package com.pages;

import com.common.GenericImplementation;

public class HomePage extends GenericImplementation {
	
	public HomePage verifyHomePage () {		
		verifyTextContainsByXpath("//div[@id='form']/h2[contains(text(),'Welcome')]", "Welcome");
		return this;
	}
	
	public MyHome clickCRMBtn() throws Exception {
	
		clickByLink("CRM/SFA");
		return new MyHome();
	}	

}
