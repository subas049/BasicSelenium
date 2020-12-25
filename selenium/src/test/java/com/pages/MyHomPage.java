package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


import com.common.ProjectGeneric;

public class  MyHomPage extends ProjectGeneric {
	
	
	public static String myHompagLablActVal = prop.getProperty("myHomPagActVal");
	public static String myHompagLablLocatrVal = prop.getProperty("myhompag_ById");
	public static String leadsTabLocatrVal = prop.getProperty("leadsTab_ByLink");
	
	//public RemoteWebDriver driver;
	
public MyHomPage(RemoteWebDriver driver) {
		
		this.driver=driver;
	}

	public MyHomPage verifyMyHomPage() {		
		verifyTextById(myHompagLablLocatrVal, myHompagLablActVal);
		return this;		
		
	}
	
	public MyLeadPage clickLeadsTab() throws Exception {
		
		clickByLink(leadsTabLocatrVal);
		return new MyLeadPage(driver);
	}
	
	
}
