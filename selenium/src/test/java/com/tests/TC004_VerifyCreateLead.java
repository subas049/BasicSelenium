package com.tests;

import org.testng.annotations.Test;

import com.common.ProjectGeneric;
import com.pages.HomePage;
//import com.pages.LeadsPage;
import com.pages.SignInPage;


public class TC004_VerifyCreateLead extends ProjectGeneric {

	@Test
	public void loginAndLogout() throws Exception {		
		
		new SignInPage(driver).enterUsername().enterPassWord().clickSubmit().verifyHomePage()
		.clickCRMBtn().verifyMyHomPage().clickLeadsTab().verifyLeadPage().clickCreateLeadLink().enterLeadCompanyNam().enterLeadFirstNam()
		.enterLeadLastNam().enterLeadPinCod().clickCreateLeadBtn().verifyLeadCreation();
	}
}
