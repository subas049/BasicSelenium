package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class ActionsDemo {

	public static void main(String[] args) {
		String baseUrl = "http://www.facebook.com/";
		System.setProperty("webdriver.chrome.driver", "./drivers/chrome/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Maximize browser
		driver.manage().window().maximize();

		driver.get(baseUrl);
		WebElement txtUsername = driver.findElement(By.id("email"));

		Actions builder = new Actions(driver);
		Action act = builder.moveToElement(txtUsername).click().keyDown(txtUsername, Keys.SHIFT)
				.sendKeys(txtUsername, "hello").keyUp(txtUsername, Keys.SHIFT).doubleClick(txtUsername).contextClick().build();

				act.perform();

	}
}
