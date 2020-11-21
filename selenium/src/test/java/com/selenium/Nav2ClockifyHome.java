package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nav2ClockifyHome extends SetupBrowser {

	public static void main(String[] args) {
		 
		WebDriver driver = browserSetUP();
		
		// Open URL
		driver.get("https://clockify.me/login");
		 
		
		driver.findElement(By.id("email")).sendKeys("varulmurugan@inlogic.in");
		driver.findElement(By.id("password")).sendKeys("Kl@key5");
		 
		}
		 
	
	
}
