/**
 * 
 */
package com.common;

import java.io.IOException;

/**
 * @author subash
 * This interface has generic method declaration for this TestNG framework
 */
public interface Generic {

	/**
	 * This method will launch the given browser and maximise the browser and set the
	 * wait for 30 seconds and load the url
	 * @author Subash - Learning
	 * @param browser - The browser of the application to be launched
	 * @param url - The url with http or https
	 * @throws Exception 
	 * 
	 */
	public void invokeApp(String browser, String url) throws Exception;

	/**
	 * This method will enter the value to the text field using id attribute to locate
	 * 
	 * @param idValue - id of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Subash - Learning
	 * @return 
	 * @throws Exception 
	 */
	public void enterById(String idValue, String data) throws Exception;
	
	/**
	 * This method will enter the value to the text field using name attribute to locate
	 * 
	 * @param nameValue - name of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Subash - Learning
	 */
	public void enterByName(String nameValue, String data)  throws Exception;	
	
	/**
	 * This method will enter the value to the text field using xpath attribute to locate
	 * 
	 * @param xpathValue - name of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Subash - Learning
	 */
	public void enterByXpath(String xpathValue, String data) throws Exception;


	/**
	 * This method will verify the title of the browser 
	 * @param title - The expected title of the browser
	 * @author Subash - Learning
	 */
	public boolean verifyTitle(String title);
	
	/**
	 * This method will verify the given text
	 * @param id - The locator of the object in id
	 * @param text  - The text to be verified
	 * @author Subash - Learning
	 */
	public void verifyTextById(String id, String text);
	
	/**
	 * This method will verify the given text with exact match
	 * @param xpath - The locator of the object in id
	 * @param text  - The text to be verified
	 * @author Subash - Learning
	 */
	public void verifyTextByXpath(String xpath, String text);
	
	/**
	 * This method will verify the given text with partial match
	 * @param xpath - The locator of the object in xpath
	 * @param text  - The text to be verified
	 * @author Subash - Learning
	 */
	public void verifyTextContainsByXpath(String xpath, String text);


	/**
	 * This method will click the element using id as locator
	 * @param id  The id (locator) of the element to be clicked
	 * @author Subash - Learning
	 */
	public void clickById(String id)  throws Exception;

	/**
	 * This method will click the element using id as locator
	 * @param id  The id (locator) of the element to be clicked
	 * @author Subash - Learning
	 * @throws Exception 
	 */
	public void clickByClassName(String classVal) throws Exception;
	
	/**
	 * This method will click the element using name as locator
	 * @param name  The name (locator) of the element to be clicked
	 * @author Subash - Learning
	 */
	public void clickByName(String name)  throws Exception;
	

	/**
	 * This method will click the element using link name as locator and do take snap
	 * @param name  The link name (locator) of the element to be clicked
	 * @author Subash - Learning
	 */
	public void clickByLink(String name) throws Exception;
	
	/**
	 * This method will click the element using link name as locator and do not take snap
	 * @param name  The link name (locator) of the element to be clicked
	 * @author Subash - Learning
	 */
	public void clickByLinkNoSnap(String name) throws Exception;

	/**
	 * This method will click the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element to be clicked
	 * @author Subash - Learning
	 */
	public void clickByXpath(String xpathVal) throws Exception;
	
	/**
	 * This method will click the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element to be clicked
	 * @author Subash - Learning
	 */
	public void clickByXpathNoSnap(String xpathVal) throws Exception;
	
	/**
	 * This method will get the text of the element using id as locator
	 * @param xpathVal  The id (locator) of the element 
	 * @author Subash - Learning
	 */
	public String getTextById(String idVal);

	/**
	 * This method will get the text of the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element 
	 * @author Subash - Learning
	 */
	public String getTextByXpath(String xpathVal);

	/**
	 * This method will select the drop down visible text using id as locator
	 * @param id The id (locator) of the drop down element
	 * @param value The value to be selected (visibletext) from the dropdown 
	 * @author Subash - Learning
	 */
	public void selectVisibileTextById(String id, String value) throws Exception;
	
	/**
	 * This method will select the drop down using index as id locator
	 * @param id The id (locator) of the drop down element
	 * @param value The value to be selected (visibletext) from the dropdown 
	 * @author Subash - Learning
	 */
	public void selectIndexById(String id, int value) throws Exception;
	
	/**
	 * This method will switch to the parent Window
	 * @author Subash - Learning
	 */
	public void switchToParentWindow();
	
	/**
	 * This method will move the control to the last window
	 * @author Subash - Learning
	 */
	public void switchToLastWindow();
	
	/**
	 * This method will accept the alert opened
	 * @author Subash - Learning
	 */
	public void acceptAlert();
	
	/**
	 * This method will dismiss the alert opened
	 * @author Subash - Learning
	 */
	public void dismissAlert();
	
	/**
	 * This method will return the text of the alert
	 * @author Subash - Learning
	 */
	public String getAlertText();
	
	/**
	 * This method will take snapshot of the browser
	 * @author Subash - Learning
	 * @throws IOException 
	 */
	public long takeSnap() throws IOException;
		
	/**
	 * This method will close the active browser
	 * @author Subash - Learning
	 */
	public void closeBrowser();
	
	
	/**
	 * This method will close all the browsers
	 * @author Subash - Learning
	 */
	public void closeAllBrowsers();
	
}
