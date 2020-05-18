package com.qa.Tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.Calculator.CalculatorPage;
import com.qa.Calculator.Page;

public class CalculatorTest {

	private AndroidDriver driver;
	public Page page;
	public WebDriverWait wait;

	@BeforeTest
	public void setUp() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("platformVersion", "7");
		desiredCapabilities.setCapability("deviceName", "Redmi");
		desiredCapabilities.setCapability("udid", "8b3f97190804");
		desiredCapabilities.setCapability("appPackage", "com.miui.calculator");
		desiredCapabilities.setCapability("appActivity", ".cal.CalculatorActivity");

		URL remoteUrl = new URL("http://localhost:4723/wd/hub");

		driver = new AndroidDriver(remoteUrl, desiredCapabilities);

		wait = new WebDriverWait(driver, 15);
		page = new Page(driver, wait);
	}

	@Test(priority = 1)
	@Parameters({ "number1", "number2", "multiply" })
	public void MultiplicationTest(int number1, int number2, int multiply) {

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		int Result = page.getInstance(CalculatorPage.class).doMuliply(number1, number2);
		Assert.assertEquals(multiply, Result);

	}

}
