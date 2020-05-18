package com.qa.Calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileDriver;

public class BasePage extends Page {
	//public MobileDriver driver;
	
	//public WebDriverWait wait;

	public BasePage(MobileDriver driver, WebDriverWait wait) {
		super(driver, wait);
		this.driver=driver;
		this.wait=wait;
		// TODO Auto-generated constructor stub
	}

	// generic util wraper or generic methods

	public void doclick(By locator) {

		driver.findElement(locator).click();
	}

	public void dosendKeys(By locator, String text) {

		driver.findElement((By) locator).sendKeys(text);
	}

}
