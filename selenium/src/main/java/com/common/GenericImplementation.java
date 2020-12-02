/**
 * 
 */
package com.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author subash
 *
 */
public class GenericImplementation implements Generic {
	
	public static WebDriver driver;
	public static int i=1;
	protected static Properties prop;
	public static String browser;
	public static String url;
	
	static {
		
		prop = new Properties();
		try {
			
			/*
			 * File f = new File("./props/input.properties"); FileInputStream fis = new
			 * FileInputStream(f); 
			 * prop.load(fis);
			 */
			prop.load(new FileInputStream(new File("./props/input.properties")));
			prop.load(new FileInputStream(new File("./props/webobject.properties")));
			
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void invokeApp() throws Exception {
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chrome/chromedriver.exe");
			driver = new ChromeDriver();

		}else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/firefox/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		// Maximize browser
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
	}

	public void enterById(String idValue, String data) throws Exception {
		driver.findElement(By.id(idValue)).clear();
		driver.findElement(By.id(idValue)).sendKeys(data);
		
	}

	public void enterByName(String nameValue, String data) throws Exception {
		// TODO Auto-generated method stub
		driver.findElement(By.name(nameValue)).clear();
		driver.findElement(By.name(nameValue)).sendKeys(data);
		
	}

	public void enterByXpath(String xpathValue, String data) throws Exception {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath(xpathValue)).clear();
		driver.findElement(By.xpath(xpathValue)).sendKeys(data);
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
		
		if(driver.findElement(By.xpath(xpath)).getText().equals(text)) {
			System.out.println("The Text is Matched");
		}
		System.out.println("The Text is not Matched");
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		if (driver.findElement(By.xpath(xpath)).getText().contains(text)) {
			System.out.println("The Text is Matched");
		} else {
			System.out.println("The Text is not Matched");
		}
	
	}
	
	public void elementDisplayedById(String id) throws Exception {
		// TODO Auto-generated method stub
		driver.findElement(By.id(id)).isDisplayed();
	}

	public void clickById(String id) throws Exception {
		// TODO Auto-generated method stub
		driver.findElement(By.id(id)).click();
	}

	public void clickByClassName(String classVal) throws Exception {
		// TODO Auto-generated method stub
		driver.findElement(By.className(classVal)).click();
	}

	public void clickByName(String name) throws Exception {
		// TODO Auto-generated method stub
		driver.findElement(By.name(name)).click();
	}

	public void clickByLink(String name) throws Exception {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText(name)).click();
		takeSnap();
	}

	public void clickByLinkNoSnap(String name) throws Exception {
		// TODO Auto-generated method stub
		//LinkNoSnap means?
	}

	public void clickByXpath(String xpathVal) throws Exception {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath(xpathVal)).click();
		takeSnap();
	}

	public void clickByXpathNoSnap(String xpathVal) throws Exception {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath(xpathVal)).click();
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		
		String value = driver.findElement(By.id(idVal)).getText();
		return value;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		
		driver.findElement(By.xpath(xpathVal)).getText();
		
		return null;
	}

	public void selectVisibileTextById(String id, String value) throws Exception {
		// TODO Auto-generated method stub
		
		WebElement dropDwnValues =driver.findElement(By.id(id));
		 
		 Select chosingdropDwn=new Select(dropDwnValues);
		 
		 chosingdropDwn.selectByVisibleText(value);
		
	}

	public void selectIndexById(String id, int value) throws Exception {
		// TODO Auto-generated method stub
		
		WebElement dropDwnValues =driver.findElement(By.id(id));
		 
		 Select chosingdropDwn=new Select(dropDwnValues);
		 
		 chosingdropDwn.selectByIndex(value);
		 
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub		
		
		String parentWindow = driver.getWindowHandle();
		driver.switchTo().window(parentWindow);
		
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		
		Set<String> alOpenedWindow = driver.getWindowHandles();
		
		for (String eachwindow : alOpenedWindow) {
			driver.switchTo().window(eachwindow);
		}		
		
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub		
		
		driver.switchTo().alert().accept();
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
			//Below 2 lines perform the dismissing the Alert
			//Alert alertWindow = driver.switchTo().alert();
			//alertWindow.dismiss();
		
		//Below 1 line perform the dismissing the Alert
		driver.switchTo().alert().dismiss();;
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		
				return driver.switchTo().alert().getText();
	}

	public void takeSnap() throws IOException  {
		//
		// TODO Auto-generated method stub		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File srcf = ts.getScreenshotAs(OutputType.FILE);

		File PastTheSnapTo = new File("./Output/img_"+i+".jpg");
		
		i++;

		FileUtils.copyFile(srcf, PastTheSnapTo);
		
		
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();
	}
	
	
	public boolean isElementDisplayedById1(String idValue) {
		boolean bReturn = false;
		
		if (driver.findElement(By.id(idValue)).isDisplayed()) {
			bReturn = true;	
			System.out.println("Element is Displayed:"+bReturn);
		} 
		System.out.println("Element is not Displayed:"+bReturn);
		
		return bReturn;		
		
	}
	
	public boolean isElementDisplayedById(String idValue) {
		
		boolean bReturn = 	driver.findElement(By.id(idValue)).isDisplayed();
		if (bReturn == true) {
			System.out.println(bReturn+" Element is Displayed");
		} else {
			System.out.println(bReturn+" Element is not Displayed");
		}
		return bReturn;
	}
	
public boolean isElementEnabledById(String idValue) {
		
		boolean bReturn = 	driver.findElement(By.id(idValue)).isEnabled();
		if (bReturn == true) {
			System.out.println(bReturn+"Element is Enabled");
		} else {
			System.out.println(bReturn+"Element is not Enabled");
		}
		return bReturn;
	}

public boolean isElementEnabledByXpath(String idValue) {
	
	boolean bReturn = false	;
	if (driver.findElement(By.xpath(idValue)).isEnabled()) {
		System.out.println(bReturn+"Element is Enabled");
	} else {
		System.out.println(bReturn+"Element is not Enabled");
	}
	return bReturn;
}



}
