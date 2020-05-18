
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


public class SampleTest {

  private AndroidDriver driver;
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method");
  }
  
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

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before suite");
  }
  @Parameters({"amount"})
  @Test
  public void sampleTest(String amt) {
    MobileElement el1 = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_9_s");
    el1.click();
    MobileElement el2 = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_4_s");
    el2.click();
    MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("plus");
    el3.click();
    MobileElement el4 = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_1_s");
    el4.click();
    MobileElement el5 = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_6_s");
    el5.click();
    MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("minus");
    el6.click();
    MobileElement el7 = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_5_s");
    el7.click();
    MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("multiply");
    el8.click();
    MobileElement el9 = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_1_s");
    el9.click();
    MobileElement el10 = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_2_s");
    el10.click();
    MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("equals");
    el11.click();
    MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("divide");
    el12.click();
    MobileElement el13 = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_5_s");
    el13.click();
    MobileElement el14 = (MobileElement) driver.findElementByAccessibilityId("equals");
    el14.click();
    MobileElement el15 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView");
    el15.click();
    MobileElement el16 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/miui.view.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");
    el16.click();
    el16.sendKeys(amt);
    el16.click();
    MobileElement el17 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/miui.view.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView");
    el17.click();
    MobileElement el18 = (MobileElement) driver.findElementById("android:id/button1");
    el18.click();
    MobileElement el19 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/miui.view.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView");
    el19.click();
    MobileElement el20 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/miui.widget.NumberPicker/android.widget.Button[2]");
    el20.click();
    MobileElement el21 = (MobileElement) driver.findElementById("android:id/button1");
    el21.click();
    MobileElement el22 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/miui.view.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");
    el22.click();
    el22.sendKeys("5");
    MobileElement el23 = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_calculate");
    el23.click();
    MobileElement el24 = (MobileElement) driver.findElementByAccessibilityId("Back");
    el24.click();
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