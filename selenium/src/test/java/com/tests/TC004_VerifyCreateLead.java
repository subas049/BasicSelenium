package com.tests;

import org.testng.annotations.Test;

import com.pages.HomePage;
//import com.pages.LeadsPage;
import com.pages.SignInPage;


public class TC004_VerifyCreateLead {

	@Test
	public void loginAndLogout() throws Exception {		
		
		new HomePage().verifyHomePage()
		.clickCRMBtn().verifyMyHomPage().clickLeadsTab().verifyLeadPage().enterLeadCompanyNam().enterLeadFirstNam()
		.enterLeadLastNam().enterLeadPinCod().clickCreateLeadBtn().verifyLeadCreation();
	}
}
