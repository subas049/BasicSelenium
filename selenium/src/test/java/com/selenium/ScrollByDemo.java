package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chrome/chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open URL
		driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
		 
		// Maximize browser		 
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Scroll using pixels
		js.executeScript("window.scrollBy(0,1000)");
		
		//scroll using element visible downwards
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//ul[@id='menu-products']//li[2]/a")));
		
		Thread.sleep(5000);
		
		//scroll using element visible upwards
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.linkText("Home")));
		
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//ul[@id='menu-products']//li[2]/a")));
		
		driver.findElement(By.xpath("//ul[@id='menu-products']//li[2]/a")).click();
		
	}

}
