package com.tests;


import org.openqa.selenium.WebDriver;
import org.testng.DependencyMap;
import org.testng.annotations.Test;

import com.common.ProjectGeneric;
//import com.pages.LeadsPage;
import com.pages.SignInPage;



public class TC001_LogintoApplication extends ProjectGeneric {
	

	@Test
	public void loginToApplication() throws Exception {
		
		System.out.println("the driver seaation is "+driver.getSessionId());
		new SignInPage(driver).enterUsername().enterPassWord().clickSubmit().verifyHomePage();
		
		
	}
	
		
		
}
