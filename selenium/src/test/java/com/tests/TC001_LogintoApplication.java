package com.tests;


import org.testng.annotations.Test;

import com.common.ProjectGeneric;
import com.pages.HomePage;
//import com.pages.LeadsPage;



public class TC001_LogintoApplication extends ProjectGeneric {

	@Test
	public void loginToApplication() throws Exception {		
		
		new HomePage().verifyHomePage();
		
		
	}
}
