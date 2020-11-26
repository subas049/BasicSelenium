package com.pages;

import com.common.GenericImplementation;

public class MyHome extends GenericImplementation {
	
	
	public LeadsPage clickCRMBtn() throws Exception {
		
		clickByClassName("decorativeSubmit");
		return new LeadsPage();
	}	
		
	

}
