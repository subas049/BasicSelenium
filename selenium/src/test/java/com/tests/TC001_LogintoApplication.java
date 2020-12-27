package com.tests;


import org.openqa.selenium.WebDriver;
import org.testng.DependencyMap;
import org.testng.annotations.Test;

import com.common.ProjectGeneric;
//import com.pages.LeadsPage;
import com.pages.SignInPage;



public class TC001_LogintoApplication extends ProjectGeneric {
	

	@Test(dataProvider="fetchData")
	public void loginToApplication(String userName, String passWord, String sample) throws Exception {
		
		System.out.println("the sample valtue is" +sample);
		new SignInPage(driver).enterUsername(userName).enterPassWord(passWord).clickSubmit().verifyHomePage();		
		
	}
	
		
		
}
