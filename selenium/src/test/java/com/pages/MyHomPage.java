package com.pages;

import com.common.GenericImplementation;

public class  MyHomPage extends GenericImplementation {
	
	public static String myHompagLablActVal = prop.getProperty("myHomPagActVal");
	public static String myHompagLablLocatrVal = prop.getProperty("myhompag_ById");
	public static String leadsTabLocatrVal = prop.getProperty("leadsTab_ByLink");
	

	public MyHomPage verifyMyHomPage () {		
		verifyTextById(myHompagLablLocatrVal, myHompagLablActVal);
		return this;		
		
	}
	
	public MyLeadPage clickLeadsTab() throws Exception {
		
		clickByLink(leadsTabLocatrVal);
		return new MyLeadPage();
	}
	
	
}
