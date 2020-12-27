package com.tests;


import org.testng.annotations.Test;

import com.common.ProjectGeneric;
import com.pages.HomePage;
//import com.pages.LeadsPage;
import com.pages.SignInPage;


public class TC003_VerifyLeadsPage extends ProjectGeneric {

	@Test(dataProvider="fetchData")
	public void verifyLeadsPage(String userName, String passWord) throws Exception {
		
		new SignInPage(driver).enterUsername(userName).enterPassWord(passWord).clickSubmit().verifyHomePage()
		.clickCRMBtn().verifyMyHomPage().clickLeadsTab().verifyLeadPage();
	}
}
