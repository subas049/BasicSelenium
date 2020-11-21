package com.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YahooCountryCodeDropDwn extends SetupBrowser {

	public static void main(String[] args) {
		 
		WebDriver driver = browserSetUP();
		
		// Open URL
		driver.get("https://login.yahoo.com/");
		 
		
		
		driver.findElement(By.id("createacc")).click();
		
		
	//	WebElement CountryCode_dropdown=driver.findElement(By.id("country-code-lbl-aria"));
		WebElement CountryCode_dropdown=driver.findElement(By.id("shortCountryCode"));
		
		 Select CountryCode = new Select(CountryCode_dropdown);
		 
		 List<WebElement> DropdwnValues = 	CountryCode.getOptions();
		 
		 
		 for (WebElement WB : DropdwnValues) {
			
			 System.out.println(WB.getText());
		}
		 
		 //CountryCode.selectByVisibleText("Cameras & Photo");
		 
		 
		 //driver.findElement(By.id("gh-ac")).sendKeys("camera");		 
		 //driver.findElement(By.id("gh-btn")).click();
		 
		//System.out.println(driver.getTitle());
		 //System.out.println(driver.findElement(By.className("srp-controls__control srp-controls__count")).getText());
		 //driver.close();	 
		
		
		 
		}
		 
	
	
}
