package com.tests;


import org.testng.annotations.Test;

import com.common.ProjectGeneric;
import com.pages.HomePage;
//import com.pages.LeadsPage;
import com.pages.SignInPage;


public class TC003_VerifyLeadsPage extends ProjectGeneric {

	@Test
	public void verifyLeadsPage() throws Exception {
		
		new SignInPage().enterUsername().enterPassWord().clickSubmit().verifyHomePage()
		.clickCRMBtn().verifyMyHomPage().clickLeadsTab().verifyLeadPage();
	}
}
