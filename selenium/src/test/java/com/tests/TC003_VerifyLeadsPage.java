package com.tests;


import org.testng.annotations.Test;

import com.pages.HomePage;
//import com.pages.LeadsPage;
import com.pages.SignInPage;


public class TC003_VerifyLeadsPage {

	@Test
	public void loginAndLogout() throws Exception {
		
		new HomePage().verifyHomePage()
		.clickCRMBtn().verifyMyHomPage().clickLeadsTab().verifyLeadPage();
	}
}
