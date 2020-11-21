/**
 * 
 */
package com.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author subash
 *
 */
public class GenericImplementation implements Generic {
	
	public static WebDriver driver;

	public void invokeApp(String browser, String url) throws Exception {
		
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chrome/chromedriver.exe");
			driver = new ChromeDriver();

		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/firefox/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		// Maximize browser
		driver.manage().window().maximize();
		driver.get(url);
		
	}

	public void enterById(String idValue, String data) throws Exception {
		driver.findElement(By.id(idValue)).clear();
		driver.findElement(By.id(idValue)).sendKeys(data);
		
	}

	public void enterByName(String nameValue, String data) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void enterByXpath(String xpathValue, String data) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public boolean verifyTitle(String title) {
		boolean bReturn = false;
		
		if (driver.getTitle().equals(title)) {
			bReturn = true;			
		} 
		
		return bReturn;
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		if (driver.findElement(By.id(id)).getText().equals(text)) {
			System.out.println("The text is matching");
		}
		System.out.println("The text is not matching");
		
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
	}

	public void clickById(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void clickByClassName(String classVal) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void clickByName(String name) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void clickByLink(String name) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void clickByLinkNoSnap(String name) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void clickByXpath(String xpathVal) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void clickByXpathNoSnap(String xpathVal) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		
		String value = driver.findElement(By.id(idVal)).getText();
		return value;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		return null;
	}

	public void selectVisibileTextById(String id, String value) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void selectIndexById(String id, int value) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	public long takeSnap() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		
	}

}
