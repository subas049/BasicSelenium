package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserDemo extends SetupBrowser {

	public static void main(String[] args) {
		
		WebDriver driver = browserSetUP();
		// Open facebook
		driver.get("http://www.facebook.com");
		 
		

	}

}
