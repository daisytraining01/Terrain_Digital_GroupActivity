package com.terrain;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.appium.java_client.android.AndroidDriver;

public class BaseTest {
	
	static AndroidDriver driver;
	
	@Parameters({"platformName","platformVersion","deviceName","udId","appPackage","appActivity"})
 	@BeforeClass	 
 	public void setUp(String s1,String s2,String s3,String s4,String s5,String s6) throws MalformedURLException {
 	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
 	    desiredCapabilities.setCapability("platformName", s1);
 	    desiredCapabilities.setCapability("platformVersion", s2);
 	    desiredCapabilities.setCapability("deviceName", s3);
 	    desiredCapabilities.setCapability("udId", s4);
 	    desiredCapabilities.setCapability("appPackage",s5);
 	    desiredCapabilities.setCapability("appActivity",s6);
 	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");
 	 

 	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
 	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
 	  }
}
