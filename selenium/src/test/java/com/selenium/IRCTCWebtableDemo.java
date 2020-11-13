package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IRCTCWebtableDemo {

	public static WebDriver driver;
	
	public static String getDepartTime(String stationName) {
		

		return driver.findElement(By.xpath("//table[@class='table']/tbody//td[contains(text(),'"+stationName+"')]/../td[6]")).getText();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		String baseUrl = "https://www.irctc.co.in/";
		System.setProperty("webdriver.chrome.driver", "./drivers/chrome/chromedriver.exe");

		driver = new ChromeDriver();

		// Maximize browser
		driver.manage().window().maximize();

		driver.get(baseUrl);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Ok')]")));
		
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[contains(@placeholder,'From')]")));
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'From')]")).sendKeys("CHENNAI EGMORE - MS");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'To')]")).sendKeys("TIRUCHCHIRAPALI - TPJ");
		
		driver.findElement(By.xpath("//button[contains(text(),'Find trains')]")).click();
		
		Thread.sleep(8000);	
		
		driver.findElement(By.xpath("//span[contains(text(),'TEJAS EXPRESS')]")).click();
		
		Thread.sleep(5000);		
		
		System.out.println(getDepartTime("CHENNAI EGMORE"));
		
		
	}

}
