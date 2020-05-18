package com.appium;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Appiumtest {

  private AndroidDriver driver;

  @Before

public void setUp() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("platformVersion", "8.1.0");
	    desiredCapabilities.setCapability("deviceName", "Redmi Note 5 Pro");
	    desiredCapabilities.setCapability("udid", "42d41177");
	    desiredCapabilities.setCapability("appPackage", "org.gnucash.android");
	    desiredCapabilities.setCapability("appActivity", "org.gnucash.android.ui.account.AccountsActivity");

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
   
      }

  @Test
  public void sampleTest() {
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

  @After
  public void tearDown() {
    driver.quit();
  }
}