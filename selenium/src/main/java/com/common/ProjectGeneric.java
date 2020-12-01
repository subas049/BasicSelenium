package com.common;

import org.testng.annotations.*;


public class ProjectGeneric extends GenericImplementation {
	
	public static String browser = prop.getProperty("browser");
	public static String url = prop.getProperty("url");
	public static String userName = prop.getProperty("userId");
	public static String passWord = prop.getProperty("passWord");
	public static String usernamelocator = prop.getProperty("userNameTextBox_ID");
	public static String passwordLocator = prop.getProperty("passWordTextBox_ID");
	public static String submitbtnLocator = prop.getProperty("submitButton_Classname");
	
	@BeforeMethod
	public void beforeTest() throws Exception {
		invokeApp(browser, url);
		enterById(usernamelocator, userName);
		enterById(passwordLocator, passWord);
		clickByClassName(submitbtnLocator);
		System.out.println("application launched successfully");
	}
	
	@AfterMethod
	public void afterTest() {
		
		closeBrowser();
		System.out.println("Browser closed successfully");
		
	}

}
