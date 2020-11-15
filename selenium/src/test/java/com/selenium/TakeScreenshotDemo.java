package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotDemo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chrome/chromedriver.exe");

		// Initialize browser
		WebDriver driver = new ChromeDriver();

		// Open URL
		driver.get("https://www.guru99.com/take-screenshot-selenium-webdriver.html");

		// Maximize browser
		driver.manage().window().maximize();

		TakesScreenshot ts = (TakesScreenshot) driver;

		File srcf = ts.getScreenshotAs(OutputType.FILE);

		File dscf = new File("./Output/img.jpg");

		FileUtils.copyFile(srcf, dscf);

	}

}
