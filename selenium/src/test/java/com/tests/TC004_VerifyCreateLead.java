package com.tests;

import org.testng.annotations.Test;

import com.common.ProjectGeneric;
import com.pages.HomePage;
//import com.pages.LeadsPage;
import com.pages.SignInPage;


public class TC004_VerifyCreateLead extends ProjectGeneric {

	@Test(dataProvider="fetchData")
	public void loginAndLogout(String userName, String passWord) throws Exception {		
		
		new SignInPage(driver).enterUsername(userName).enterPassWord(passWord).clickSubmit().verifyHomePage()
		.clickCRMBtn().verifyMyHomPage().clickLeadsTab().verifyLeadPage().clickCreateLeadLink().enterLeadCompanyNam().enterLeadFirstNam()
		.enterLeadLastNam().enterLeadPinCod().clickCreateLeadBtn().verifyLeadCreation();
	}
}
