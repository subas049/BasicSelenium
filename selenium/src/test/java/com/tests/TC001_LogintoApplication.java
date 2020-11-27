package com.tests;

import org.junit.BeforeClass;
import org.junit.Test;

//import com.pages.LeadsPage;
import com.pages.SignInPage;

import com.pages.HomePage;
import com.pages.LeadCreatePage;
import com.pages.MyHomPage;
import com.pages.MyLeadPage;

public class TC001_LogintoApplication {

	@Test
	public void loginAndLogout() throws Exception {		
		
		new SignInPage().launchApplication().enterUsername().enterPassWord().clickSubmit().verifyHomePage();
		new HomePage().verifyHomePage().clickCRMBtn();
		new MyHomPage().verifyMyHomPage().clickLeadsTab();
		new MyLeadPage().verifyLeadPage().clickCreateLeadLink();
		new LeadCreatePage().enterLeadCompanyNam().enterLeadFirstNam().enterLeadLastNam().enterLeadPinCod().clickCreateLeadBtn();
		
		
		
	}
}