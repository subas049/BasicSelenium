package com.tests;

import org.junit.BeforeClass;
import org.junit.Test;

//import com.pages.LeadsPage;
import com.pages.SignInPage;

import com.pages.HomePage;
import com.pages.MyHomPage;
import com.pages.MyLeadPage;

public class TC004_MyLeadScreen {

	@Test
	public void loginAndLogout() throws Exception {		
		
		new MyLeadPage().verifyLeadPage().clickCreateLeadLink();
	}
}
