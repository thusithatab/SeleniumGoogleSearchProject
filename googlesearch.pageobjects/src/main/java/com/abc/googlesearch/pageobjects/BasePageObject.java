package com.abc.googlesearch.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Thusitha Bandara
 * @date 20/08/2019
 * 
 *
 */
public class BasePageObject {
	public WebDriver driver;
	public WebDriverWait wait;

	public BasePageObject(WebDriver driver) {

		this.driver = driver;
		wait = new WebDriverWait(driver, 50);

	}

	/**
	 * 
	 * @param elementBy Wait till the element is visible
	 * 
	 */

	public void waitTillVisible(By elementBy) {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
	}

	/**
	 * 
	 * @param elementBy Click on the element
	 * 
	 */
	public void click(By elementBy) {
		waitTillVisible(elementBy);
		driver.findElement(elementBy).click();
	}

	/**
	 * 
	 * @param elementBy
	 * @param text      Write a text to the element which has passed thru parameter
	 * 
	 */
	public void writeText(By elementBy, String text) {
		waitTillVisible(elementBy);
		driver.findElement(elementBy).sendKeys(text);
	}

	/**
	 * 
	 * @param elementBy
	 * @return read text in an element
	 * 
	 */
	public String readText(By elementBy) {
		waitTillVisible(elementBy);
		return driver.findElement(elementBy).getText();
	}

}
