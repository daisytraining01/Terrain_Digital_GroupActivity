package com.terrain;

import org.testng.annotations.Test;



import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class suresh{
	private AndroidDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}

	@Parameters({ "platformName", "platformVersion", "deviceName", "udId", "appPackage", "appActivity" })
	@BeforeClass
	public void setUp(String s1, String s2, String s3, String s4, String s5, String s6) throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", s1);
		desiredCapabilities.setCapability("platformVersion", s2);
		desiredCapabilities.setCapability("deviceName", s3);
		desiredCapabilities.setCapability("udId", s4);
		desiredCapabilities.setCapability("appPackage", s5);
		desiredCapabilities.setCapability("appActivity", s6);
		URL remoteUrl = new URL("http://localhost:4723/wd/hub");

		driver = new AndroidDriver(remoteUrl, desiredCapabilities);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}

	@Parameters({ "amount" })

	@Test
	public void sampleTest() {
		MobileElement el1 = (MobileElement) driver.findElementById("android:id/button2");
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Switch");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("square root");
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_3_s");
		el4.click();
		el4.clear();
		MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("delete");
		el5.click();
		MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("clear");
		el6.click();
		MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("logarithm");
		el7.click();
		MobileElement el8 = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_1_s");
		el8.click();
		MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("right parenthesis");
		el9.click();
		MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("clear");
		el10.click();
		MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("power");
		el11.click();
		MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("clear");
		el12.click();
		MobileElement el13 = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_2_s");
		el13.click();
		MobileElement el14 = (MobileElement) driver.findElementByAccessibilityId("power");
		el14.click();
		MobileElement el15 = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_3_s");
		el15.click();
		MobileElement el16 = (MobileElement) driver.findElementByAccessibilityId("clear");
		el16.click();
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
