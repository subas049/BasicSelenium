package com.selenium;

import java.util.Set;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertSimpleDemo extends SetupBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		String baseUrl = "https://www.gmail.com/";
		
		WebDriver driver = browserSetUP();

		driver.get(baseUrl);
		
		driver.findElement(By.linkText("Terms")).click();
		
		Thread.sleep(5000);
		
		Set<String> allwindow = driver.getWindowHandles();
		
		for (String eachwindow : allwindow) {
			driver.switchTo().window(eachwindow);
		}		
		
		Assert.assertTrue("Title is incorrect", driver.getTitle().contains("Privacy & Terms"));
		
		/*
		 * if(driver.getTitle().contains("Privacy & Termsssss")) {
		 * 
		 * System.out.println("Test is Pass");
		 * 
		 * } else { System.out.println("Test is Fail");
		 * 
		 * }
		 */
		}

	}
