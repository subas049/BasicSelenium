package com.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ResizeWindowsDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "./drivers/chrome/chromedriver.exe");
		 
		ChromeOptions options = new ChromeOptions();
		 
		 options.addArguments("window-size=400,400");
		 
		 DesiredCapabilities cap = DesiredCapabilities.chrome();
		 cap.setCapability(ChromeOptions.CAPABILITY, options);
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver(cap);
		 
		// Open facebook
		driver.get("http://www.facebook.com");
		
		driver.manage().window().fullscreen();
		
		Dimension ds = new Dimension(400, 400);
		
		 
		// resize browser		 
		driver.manage().window().setSize(ds);
		
		
	}

}
