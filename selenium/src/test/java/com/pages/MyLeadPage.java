package com.pages;

import com.common.GenericImplementation;

public class MyLeadPage extends GenericImplementation {
	
	public static String leadspagLablActVal = prop.getProperty("leadsPagActVal");
	public static String leadspagLablLocatrVal = prop.getProperty("leadspag_ById");
	public static String leadCreationTabLocatrVal = prop.getProperty("leadCreation_ByLink");
	
	public MyLeadPage verifyLeadPage () {		
		verifyTextById(leadspagLablLocatrVal,leadspagLablActVal);
		return this;		
		
	}
	
public LeadCreatePage clickCreateLeadLink() throws Exception {
		
		clickByLink(leadCreationTabLocatrVal);
		return new LeadCreatePage();
	}

}
