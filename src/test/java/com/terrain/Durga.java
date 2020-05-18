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

public class Durga {

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
		MobileElement el1 = (MobileElement) driver.findElementById("android:id/button1");
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.ImageView");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/com.miui.support.view.ViewPager/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.ImageView");
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]");
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.FrameLayout[1]/android.widget.LinearLayout");
		el5.click();
		MobileElement el6 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout");
		el6.click();
		MobileElement el7 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]");
		el7.click();
		MobileElement el8 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.FrameLayout[5]/android.widget.LinearLayout");
		el8.click();
		MobileElement el9 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout");
		el9.click();
		MobileElement el10 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]");
		el10.click();
		MobileElement el11 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.FrameLayout[8]/android.widget.LinearLayout/android.widget.TextView");
		el11.click();
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