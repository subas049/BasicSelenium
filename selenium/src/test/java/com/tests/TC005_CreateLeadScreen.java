package com.tests;

import org.junit.BeforeClass;
import org.junit.Test;

//import com.pages.LeadsPage;
import com.pages.SignInPage;

import com.pages.HomePage;
import com.pages.LeadCreatePage;
import com.pages.MyHomPage;
import com.pages.MyLeadPage;

public class TC005_CreateLeadScreen {

	@Test
	public void loginAndLogout() throws Exception {		
		
		//new AppnMyLeadPage().verifyLeadPage().clickCreateLeadLink();
		new LeadCreatePage().enterLeadCompanyNam().enterLeadFirstNam().enterLeadLastNam().enterLeadPinCod().clickCreateLeadBtn();
	}
}
