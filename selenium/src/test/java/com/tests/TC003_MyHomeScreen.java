package com.tests;

import org.junit.BeforeClass;
import org.junit.Test;

//import com.pages.LeadsPage;
import com.pages.SignInPage;

import com.pages.HomePage;
import com.pages.MyHomPage;

public class TC003_MyHomeScreen {

	@Test
	public void loginAndLogout() throws Exception {
		
		//new SignInPage().launchApplication().enterUsername().enterPassWord().clickSubmit().verifyHomePage();
		new MyHomPage().verifyMyHomPage().clickLeadsTab();
	}
}
