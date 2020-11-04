package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomHomePage {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open facebook
		driver.get("https://www.zoom.us/signin");
		 
		// Maximize browser		 
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("arulvma@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Zum.YouS97");
		//driver.findElement(By.className("btn btn-primary submit signin user").clic
		//driver.findElement(By.id("loginbutton")).click();		
		//driver.close();
		 
		}
		 
	
	
}
