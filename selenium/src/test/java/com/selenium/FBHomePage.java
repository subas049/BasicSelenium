package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBHomePage extends SetupBrowser {

	public static void main(String[] args) {
		 
		WebDriver driver = browserSetUP();
		 
		// Open facebook
		driver.get("http://www.facebook.com");
		 
		driver.findElement(By.name("email")).sendKeys("8608201848");
		driver.findElement(By.name("pass")).sendKeys("4855arul4855");
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.id("loginbutton")).click();
		
		String s  = driver.findElement(By.className("_1vp5")).getText();
		System.out.println(s);
		
		//driver.close();
		 
		}
		 
	
	
}
