package com.tests;


import org.testng.annotations.Test;

import com.common.ProjectGeneric;
import com.pages.HomePage;
//import com.pages.LeadsPage;
import com.pages.SignInPage;


public class TC002_VerifyMyHomePageNavigaion extends ProjectGeneric {

	@Test
	public void verifyCRMButton() throws Exception {
		
		System.out.println("the driver seaation is "+driver.getSessionId());

		new SignInPage(driver).enterUsername().enterPassWord().clickSubmit().verifyHomePage().clickCRMBtn().verifyMyHomPage();
		
	}
}
