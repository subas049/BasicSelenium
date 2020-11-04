package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nav2ClockifyHome {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open URL
		driver.get("https://clockify.me/login");
		 
		// Maximize browser		 
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("varulmurugan@inlogic.in");
		driver.findElement(By.id("password")).sendKeys("Kl@key5");
		 
		}
		 
	
	
}
