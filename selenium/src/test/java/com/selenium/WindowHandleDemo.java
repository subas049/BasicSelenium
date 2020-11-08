package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) throws InterruptedException {
		String baseUrl = "https://www.gmail.com/";
		System.setProperty("webdriver.chrome.driver", "./drivers/chrome/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Maximize browser
		driver.manage().window().maximize();

		driver.get(baseUrl);
		
		driver.findElement(By.linkText("Terms")).click();
		
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		
		String parentWindow = driver.getWindowHandle();
		
		System.out.println(parentWindow);
		
		Set<String> allwindow = driver.getWindowHandles();
		
		System.out.println(allwindow.size());
		
		for (String eachwindow : allwindow) {
			driver.switchTo().window(eachwindow);
			System.out.println(eachwindow);
		}
		
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("About these terms")).click();
		
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.linkText("Privacy")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		
		for (String eachwindow : allwindows) {
			driver.switchTo().window(eachwindow);
			System.out.println(eachwindow);
			
		}
		
		System.out.println(driver.getTitle());
		
		int i=0;
		for (String eachwindow : allwindows)  {
			
			i++;
			if (i==2) {
				driver.switchTo().window(eachwindow);
				break;
			}
		}
		
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		driver.quit();

	}

}