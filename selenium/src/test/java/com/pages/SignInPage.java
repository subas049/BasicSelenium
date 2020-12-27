package com.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


import com.common.ProjectGeneric;

public class SignInPage extends ProjectGeneric {
	
	

//	public static String userName = prop.getProperty("userId");
//	public static String passWord = prop.getProperty("passWord");
	public static String usernamelocator = prop.getProperty("userNameTextBox_ID");
	public static String passwordLocator = prop.getProperty("passWordTextBox_ID");
	public static String submitbtnLocator = prop.getProperty("submitButton_Classname");
	
	//public RemoteWebDriver driver;
	
	public SignInPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public SignInPage enterUsername (String userName) throws Exception {
	
		enterById(usernamelocator, userName);
		
		return this;
	}
	
	public SignInPage enterPassWord (String passWord) throws Exception {
		enterById(passwordLocator, passWord);
		return this;
	}
	
	public HomePage clickSubmit() throws Exception {
		
		clickByClassName(submitbtnLocator);
		return new HomePage(driver);
	}	
	
}


