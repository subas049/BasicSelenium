package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsSortingDemo {

	public static void main(String[] args) {
		String baseUrl = "https://jqueryui.com/sortable/";
		System.setProperty("webdriver.chrome.driver", "./drivers/chrome/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Maximize browser
		driver.manage().window().maximize();

		driver.get(baseUrl);
		
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		
		Actions builder = new Actions(driver);
		
		builder.contextClick(driver.findElement(By.xpath("//*[@id='sortable']/li[1]"))).build().perform();
		
		List<WebElement> st = driver.findElements(By.xpath("//*[@id='sortable']/li"));
		
		for (WebElement wb : st) {
			
			System.out.println(wb.getText());
		}

		
		}

	}
