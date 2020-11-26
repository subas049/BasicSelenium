package com.pages;

import com.common.GenericImplementation;

public class SignInPage extends GenericImplementation {
	
	public static String browser = prop.getProperty("browser");
	public static String url = prop.getProperty("url");
	public static String userName = prop.getProperty("userId");
	public static String passWord = prop.getProperty("passWord");
	public static String usernamelocator = prop.getProperty("userNameTextBox_ID");
	public static String passwordLocator = prop.getProperty("passWordTextBox_ID");
	public static String submitbtnLocator = prop.getProperty("submitButton_Classname");
	
	public SignInPage launchApplication () throws Exception {
		invokeApp(browser, url);
		return this;
	}
	
	public SignInPage enterUsername () throws Exception {
		enterById(usernamelocator, userName);
		return this;
	}
	
	public SignInPage enterPassWord () throws Exception {
		enterById(passwordLocator, passWord);
		return this;
	}
	
	public HomePage clickSubmit() throws Exception {
		
		clickByClassName(submitbtnLocator);
		return new HomePage();
	}	
	

	
	
	
	
	

}
