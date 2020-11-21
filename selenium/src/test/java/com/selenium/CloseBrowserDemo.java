package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowserDemo extends SetupBrowser {

	public static void main(String[] args) {
		 
		WebDriver driver = browserSetUP();
		
		driver.close();		

	}

}
