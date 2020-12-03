package com.common;

import org.testng.annotations.*;


public class ProjectGeneric extends GenericImplementation {
	
	
	public static String userName = prop.getProperty("userId");
	public static String passWord = prop.getProperty("passWord");
	public static String usernamelocator = prop.getProperty("userNameTextBox_ID");
	public static String passwordLocator = prop.getProperty("passWordTextBox_ID");
	public static String submitbtnLocator = prop.getProperty("submitButton_Classname");
	
	@BeforeMethod
	public void beforeMethod() throws Exception {
		invokeApp();
		System.out.println("application launched successfully");
	}
	
	@AfterMethod
	public void afterMethod() {
		
		closeBrowser();
		System.out.println("Browser closed successfully");
		
	}
	@BeforeSuite
	public void beforeSuite() throws Exception {
		
		System.out.println("Im from before suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		
		
		System.out.println("Im from after suite");
		
	}
	
	@BeforeClass
	public void beforeClass() throws Exception {
		
		System.out.println("Im from before Class");
	}
	
	@AfterClass
	public void afterClass() {
		
		
		System.out.println("Im from after Class");
		
	}
	
	@BeforeTest
	public void beforeTest() throws Exception {
		System.out.println("Im from before Test");
	}
	
	@AfterTest
	public void afterTest() {
		
		System.out.println("Im from after Test");
	}
}
