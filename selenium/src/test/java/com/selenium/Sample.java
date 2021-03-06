package com.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample extends SetupBrowser {

	public static void main(String[] args) {
		 
		WebDriver driver = browserSetUP();
		
		// Open URL
		driver.get(" https://www.ebay.com/");
		 
		WebElement month_dropdown=driver.findElement(By.id("gh-cat"));
		 
		 Select month=new Select(month_dropdown);
		 
		 month.selectByVisibleText("Cameras & Photo");
		 
		 List<WebElement> DropdwnValues = 	month.getOptions();
		 
		 
		 for (WebElement WB : DropdwnValues) {
			
			 System.out.println(WB.getText());
		}
		 
		 
		 driver.findElement(By.id("gh-ac")).sendKeys("camera");		 
		 driver.findElement(By.id("gh-btn")).click();
		 
		 System.out.println(driver.getTitle());
		 //System.out.println(driver.findElement(By.className("srp-controls__control srp-controls__count")).getText());
		 driver.close();
		 
		
		
		 
		}
		 
	
	
}
