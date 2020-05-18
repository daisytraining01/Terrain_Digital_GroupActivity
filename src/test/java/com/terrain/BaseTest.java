package com.terrain;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseTest {
	
	public static AndroidDriver<MobileElement> driver;
	
	  @Parameters({"platformname","platformversion","devicename","udid","appPackage","appActivity","automationName"})
	  @BeforeMethod
	  public void setUp(String platformname,String  platformversion,String devicename,String udid,String appPackage,String appActivity,String automationName) throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName",platformname );
	    desiredCapabilities.setCapability("platformVersion",platformversion );
	    desiredCapabilities.setCapability("deviceName", devicename);
	    desiredCapabilities.setCapability("udid",udid );
	    desiredCapabilities.setCapability("appPackage", appPackage);
	    desiredCapabilities.setCapability("appActivity", appActivity);
	    desiredCapabilities.setCapability("automationName",automationName );
	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");
	    driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
	  }

}
