package com.tests;

import org.junit.BeforeClass;
import org.junit.Test;

//import com.pages.LeadsPage;
import com.pages.SignInPage;

import com.pages.HomePage;

public class TC002_HomeScreen {

	@Test
	public void loginAndLogout() throws Exception {
		
		//new SignInPage().launchApplication().enterUsername().enterPassWord().clickSubmit().verifyHomePage();
		new HomePage().verifyHomePage().clickCRMBtn();
	}
}
