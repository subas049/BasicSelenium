package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertWithWaitDemo {

	public static void main(String[] args) {
		
		String baseUrl = "https://demoqa.com/alerts";
		System.setProperty("webdriver.chrome.driver", "./drivers/chrome/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Maximize browser
		driver.manage().window().maximize();

		driver.get(baseUrl);
		
		driver.findElement(By.id("timerAlertButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
			
		wait.until(ExpectedConditions.alertIsPresent());
		
		 Alert alert = driver.switchTo().alert();	
		 
		// Capturing alert message.    
	        String alertMessage= alert.getText();		
	        		
	        // Displaying alert message		
	        System.out.println(alertMessage);	
	        		
	        // Accepting alert		
	        alert.accept();		
	        
	        driver.findElement(By.id("promtButton")).click();
	        
	        String alertMessage1 = alert.getText();		
    		
	        System.out.println(alertMessage1);	
	        
	        alert.sendKeys("This is Subash");
	        
	        alert.accept();


	}

}
