package com.tests;

import org.junit.Test;

import com.pages.SignInPage;

public class LogintoApplication {

	@Test
	public void loginAndLogout() throws Exception {
		
		new SignInPage().launchApplication().enterUsername().enterPassWord().clickSubmit().verifyHomePage();
		
	}
}
