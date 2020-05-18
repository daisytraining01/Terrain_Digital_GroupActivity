package com.appium;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	private AndroidDriver driver;
  @Test
  public void f() {
	  MobileElement el1 = (MobileElement) driver.findElementById("org.gnucash.android:id/btn_save");
	    el1.click();
	    MobileElement el2 = (MobileElement) driver.findElementById("org.gnucash.android:id/btn_save");
	    el2.click();
	    MobileElement el3 = (MobileElement) driver.findElementById("org.gnucash.android:id/btn_save");
	    el3.click();
	    MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[1]");
	    el4.click();
	    MobileElement el5 = (MobileElement) driver.findElementById("org.gnucash.android:id/btn_save");
	    el5.click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    MobileElement el6 = (MobileElement) driver.findElementById("org.gnucash.android:id/btn_save");
	    el6.click();
	    MobileElement el7 = (MobileElement) driver.findElementById("android:id/button1");
	    el7.click();
	    MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[4]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[1]");
	    el8.click();
	    MobileElement el9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[5]/android.widget.RelativeLayout/android.widget.ImageView[1]");
	    el9.click();
	    MobileElement el10 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_name");
	    el10.sendKeys("Salary");
	    MobileElement el11 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_amount");
	    el11.sendKeys("10000");
	    MobileElement el12 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_type");
	    el12.click();
	    MobileElement el13 = (MobileElement) driver.findElementById("org.gnucash.android:id/menu_save");
	    el13.click();
	    MobileElement el14 = (MobileElement) driver.findElementByAccessibilityId("Navigation drawer opened");
	    el14.click();
	    MobileElement el15 = (MobileElement) driver.findElementById("org.gnucash.android:id/drawer_title");
	    el15.click();
	    MobileElement el16 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[5]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[1]");
	    el16.click();
	    MobileElement el17 = (MobileElement) driver.findElementById("org.gnucash.android:id/create_transaction");
	    el17.click();
	    MobileElement el18 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_name");
	    el18.sendKeys("Credit Card Payment");
	    MobileElement el19 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_amount");
	    el19.sendKeys("2000");
	    MobileElement el20 = (MobileElement) driver.findElementById("org.gnucash.android:id/menu_save");
	    el20.click();
	    MobileElement el21 = (MobileElement) driver.findElementByAccessibilityId("Navigation drawer opened");
	    el21.click();
	    MobileElement el22 = (MobileElement) driver.findElementById("org.gnucash.android:id/drawer_title");
	    el22.click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
  }
  @Parameters({"platformName","platformVersion","deviceName","udid","appPackage","appActivity"})
  @BeforeClass
  	  public void setUp(String platName,String platformVersion, String deviceName, String udid, String appPackage, String appActivity) throws MalformedURLException {
		    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		    desiredCapabilities.setCapability("platformName",platName );
		    desiredCapabilities.setCapability("platformVersion",platformVersion );
		    desiredCapabilities.setCapability("deviceName", deviceName);
		    desiredCapabilities.setCapability("udid", udid);
		    desiredCapabilities.setCapability("appPackage", appPackage);
		    desiredCapabilities.setCapability("appActivity", appActivity);

		    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
  }

  @AfterClass
  public void tearDown() {
	    driver.quit();
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeMethod");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("BeforeMethod");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeMethod");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("BeforeMethod");
  }

}
