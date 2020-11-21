package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupBrowser {
	
	public static WebDriver browserSetUP() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chrome/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Maximize browser
		driver.manage().window().maximize();
		
		return driver;
		
	}

}
