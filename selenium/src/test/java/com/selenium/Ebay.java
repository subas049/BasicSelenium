package com.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ebay {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open URL
		driver.get(" https://www.ebay.com/");
		 
		// Maximize browser		 
		driver.manage().window().maximize();
		
		
		WebElement categry_dropdown=driver.findElement(By.id("gh-cat"));
		 
		 Select category = new Select(categry_dropdown);
		 
		 //category.selectByVisibleText("Cameras & Photo");
		 
		 List<WebElement> DropdwnValues = 	category.getOptions();
		 
		 
		 for (WebElement WB : DropdwnValues) {
			
			 System.out.println(WB.getText());
		}
		 
		 
		 //driver.findElement(By.id("gh-ac")).sendKeys("camera");		 
		 //driver.findElement(By.id("gh-btn")).click();
		 
		 //System.out.println(driver.getTitle());
		 //System.out.println(driver.findElement(By.className("srp-controls__control srp-controls__count")).getText());
		 //driver.close();	 
		
		
		 
		}
		 
	
	
}
