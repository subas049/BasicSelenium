package com.common;

import org.testng.annotations.*;


public class ProjectGeneric extends GenericImplementation {
	
	
	public static String userName = prop.getProperty("userId");
	public static String passWord = prop.getProperty("passWord");
	public static String usernamelocator = prop.getProperty("userNameTextBox_ID");
	public static String passwordLocator = prop.getProperty("passWordTextBox_ID");
	public static String submitbtnLocator = prop.getProperty("submitButton_Classname");
	
	@BeforeSuite
	public void beforeTest() throws Exception {
		invokeApp();
		System.out.println("application launched successfully");
	}
	
	@AfterSuite
	public void afterTest() {
		
		closeBrowser();
		System.out.println("Browser closed successfully");
		
	}

}
