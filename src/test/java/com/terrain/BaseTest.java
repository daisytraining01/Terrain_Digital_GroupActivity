package com.terrain;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.appium.java_client.android.AndroidDriver;

public class BaseTest {
	
	static AndroidDriver driver;
	
	@Parameters({ "platformName", "platformVersion", "deviceName", "udId", "appPackage", "appActivity" })
	@BeforeMethod
	public void beforeMethod(String platformName, String platformVersion, String deviceName, String udId,
			String appPackage, String appActivity) throws MalformedURLException {
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", platformName);
		desiredCapabilities.setCapability("platformVersion", platformVersion);
		desiredCapabilities.setCapability("deviceName", deviceName);
		desiredCapabilities.setCapability("udId", udId);
		desiredCapabilities.setCapability("appPackage", appPackage);
		desiredCapabilities.setCapability("appActivity", appActivity);

		URL remoteUrl = new URL("http://localhost:4723/wd/hub");

		driver = new AndroidDriver(remoteUrl, desiredCapabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
