package com.pages;

import com.common.GenericImplementation;

public class MyHome extends GenericImplementation {
	
		
	public  MyHome clickCreateLead() throws Exception {
		
		clickByLink("Create Lead");
		return new MyHome();
	}

	

}
