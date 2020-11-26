package com.tests;

import org.junit.BeforeClass;
import org.junit.Test;

import com.pages.LeadsPage;
import com.pages.SignInPage;

public class TC001_LogintoApplication {

	@Test
	public void loginAndLogout() throws Exception {
		
		new SignInPage().launchApplication().enterUsername().enterPassWord().clickSubmit().verifyHomePage();
	}
}
