package com.qa.Calculator;





import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

public class Page {
AppiumDriver<MobileElement>driver1;
	public MobileDriver driver;
	public WebDriverWait wait;
	
	//page class constructor
	
	public Page(MobileDriver driver, WebDriverWait wait) {
		super();
		this.driver = driver;
		this.wait =  wait;
	}
	
//create a method with java generics and return a  new page
	
	public <TPage extends BasePage>TPage getInstance(Class<TPage>pageClass) {
		try {
		return pageClass.getDeclaredConstructor(MobileDriver.class,WebDriverWait.class).newInstance(this.driver,this.wait);
	}
	catch(Exception e) {
		e.printStackTrace();
		return null;
	}
	
}
	
}
