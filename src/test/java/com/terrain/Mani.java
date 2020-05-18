package com.terrain;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pageobjects.Mani_pageobject;

public class Mani extends BaseTest  {
	 private AndroidDriver driver;
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Before method");
	  }
	  
	  

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("Before Test");
	  }
	  
	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("Before suite");
	  }
	  @Test
	  public void sampleTest() {
		  
		  Mani_pageobject mobile = new Mani_pageobject(driver);
		  
		     mobile.agree_Button.click();
	         mobile.firstOperation.click();
	         mobile.addition.click();
		     mobile.additionTyping.click();
		     mobile.minus_Operation.click();
		     mobile.equals_Operation.click();
		     mobile.scientific_Calpage.click();
		     mobile.btn_Nine.click();
		     mobile.btn_Sin0.click();
		     mobile.btn_right.click();
		     mobile.btn_Divide.click();
		     mobile.btn_Divide.click();
		     mobile.btn_Six.click();
		     mobile.btn_Zero.click();
		     mobile.btn_Zero.click();
		     mobile.delete_Btn.click();
		     mobile.delete_Btn.click();
		     mobile.btn_Zer.click();
             mobile.btn_right.click();
             mobile.equals_Operation.click();
	  
	  }
	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("After method");
	  }
	  
	  @AfterTest
	  public void afterTest() {
		  System.out.println("After test");
	  }
	  
	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("After suite");
	  }

	  @AfterClass
	  public void tearDown() {
	    driver.quit();
	  }
	}
	
	






















































