package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo extends SetupBrowser {

	public static void main(String[] args) throws InterruptedException {
		String baseUrl = "https://jqueryui.com/sortable/";
		WebDriver driver = browserSetUP();

		driver.get(baseUrl);
		
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);	
		
		Thread.sleep(5000);
		Actions builder = new Actions(driver);
		
		//builder.contextClick(driver.findElement(By.xpath("//*[@id='sortable']/li[1]"))).build().perform();
		
		WebElement locatorFrom = driver.findElement(By.xpath("//*[@id='sortable']/li[1]"));
		WebElement locatorTo = driver.findElement(By.xpath("//*[@id='sortable']/li[2]"));
		
		System.out.println("The class name is : "+locatorFrom.getAttribute("class"));
		
		System.out.println(locatorFrom.getText());
		
		builder.clickAndHold(locatorFrom).moveToElement(locatorTo).pause(java.time.Duration.ofSeconds(8)).release(locatorTo).build().perform();
		
		
		
		
		  List<WebElement> st =
		  driver.findElements(By.xpath("//*[@id='sortable']/li"));
		  
		  for (WebElement wb : st) {
		  
		  System.out.println(wb.getText()); }
		  
		  driver.switchTo().parentFrame();
		 
		  driver.findElement(By.linkText("Demos")).click();

	}

}
