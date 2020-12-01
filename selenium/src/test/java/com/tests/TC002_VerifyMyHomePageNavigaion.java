package com.tests;


import org.testng.annotations.Test;

import com.pages.HomePage;
//import com.pages.LeadsPage;
import com.pages.SignInPage;


public class TC002_VerifyMyHomePageNavigaion {

	@Test
	public void verifyCRMButton() throws Exception {
		
		new HomePage().verifyHomePage().clickCRMBtn().verifyMyHomPage();
		
	}
}
