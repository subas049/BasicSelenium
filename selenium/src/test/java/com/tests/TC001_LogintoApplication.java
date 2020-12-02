package com.tests;


import org.testng.DependencyMap;
import org.testng.annotations.Test;

import com.common.ProjectGeneric;
//import com.pages.LeadsPage;
import com.pages.SignInPage;



public class TC001_LogintoApplication extends ProjectGeneric {

	@Test
	public void loginToApplication() throws Exception {		
		
		new SignInPage().enterUsername().enterPassWord().clickSubmit().verifyHomePage();
		
		
	}
	
	@Test
	public void verifyCRMButton() throws Exception {
		
		new SignInPage().enterUsername().enterPassWord().clickSubmit().verifyHomePage().clickCRMBtn().verifyMyHomPage();
		
	}
}
