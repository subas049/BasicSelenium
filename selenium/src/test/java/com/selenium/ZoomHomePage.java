package com.selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZoomHomePage {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "./drivers/chrome/chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open facebook
		driver.get("https://www.zoom.us/signin");
		 
		// Maximize browser		 
		driver.manage().window().maximize();
		
		// add implicit wait 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
		
			
		driver.findElement(By.name("email")).sendKeys("arulvma@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Zum.YouS97");
		//driver.findElement(By.className("btn btn-primary submit signin user").clic
		//driver.findElement(By.id("loginbutton")).click();		
		//driver.close();
		 
		}
		 
	
	
}
