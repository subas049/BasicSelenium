package com.tests;


import org.testng.DependencyMap;
import org.testng.annotations.Test;

import com.common.ProjectGeneric;
//import com.pages.LeadsPage;
import com.pages.SignInPage;



public class TC001_LogintoApplication extends ProjectGeneric {

	@Test(priority = 0)
	public void vloginToApplication() throws Exception {
		
		System.out.println("I am vloginToApplication Method and My priority=0");		
		new SignInPage().enterUsername().enterPassWord().clickSubmit().verifyHomePage();
		
		
	}
	
	@Test(priority = 0)
	public void lverifyCRMButton() throws Exception {
		System.out.println("I am lverifyCRMButton Method and My priority=0");
		new SignInPage().enterUsername().enterPassWord().clickSubmit().verifyHomePage().clickCRMBtn().verifyMyHomPage();
		
	}
	
	@Test(priority = 1)
	public void verifyMyHomPag() throws Exception {
		
		System.out.println("I am verifyMyHomPag Method and My priority=1");
		new SignInPage().enterUsername().enterPassWord().clickSubmit().verifyHomePage().clickCRMBtn().verifyMyHomPage();
		
	}
	
	
	
	
	
	
}
