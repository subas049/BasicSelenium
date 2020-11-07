package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsSortingDemo {

	public static void main(String[] args) throws InterruptedException {
		
		//https://www.vinsguru.com/selenium-webdriver-automating-custom-controls-jquery-sortable-elements/
		String baseUrl = "https://jqueryui.com/sortable/";
		System.setProperty("webdriver.chrome.driver", "./drivers/chrome/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Maximize browser
		driver.manage().window().maximize();

		driver.get(baseUrl);
		
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		
		Thread.sleep(5000);
		Actions builder = new Actions(driver);
		
		//builder.contextClick(driver.findElement(By.xpath("//*[@id='sortable']/li[1]"))).build().perform();
		
		WebElement locatorFrom = driver.findElement(By.xpath("//*[@id='sortable']/li[1]"));
		WebElement locatorTo = driver.findElement(By.xpath("//*[@id='sortable']/li[2]"));
		
		builder.clickAndHold(locatorFrom).moveToElement(locatorTo).pause(java.time.Duration.ofSeconds(8)).release(locatorTo).build().perform();
		
		
		
		/*
		 * List<WebElement> st =
		 * driver.findElements(By.xpath("//*[@id='sortable']/li"));
		 * 
		 * for (WebElement wb : st) {
		 * 
		 * System.out.println(wb.getText()); }
		 */
		
		}

	}
