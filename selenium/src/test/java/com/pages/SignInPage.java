package com.pages;

import com.common.GenericImplementation;

public class SignInPage extends GenericImplementation {
	
	public SignInPage launchApplication () throws Exception {
		invokeApp("chrome", "http://leaftaps.com/opentaps");
		return this;
	}
	
	public SignInPage enterUsername () throws Exception {
		enterById("username", "DemoSalesManager");
		return this;
	}
	
	public SignInPage enterPassWord () throws Exception {
		enterById("password", "crmsfa");
		return this;
	}
	
	public HomePage clickSubmit() throws Exception {
		
		clickByClassName("decorativeSubmit");
		return new HomePage();
	}	
	
public HomePage clickCRMBtn() throws Exception {
		
		clickByClassName("decorativeSubmit");
		return new HomePage();
	}	
	
	
	
	
	

}
