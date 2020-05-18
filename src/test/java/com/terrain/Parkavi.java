package com.terrain;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import java.net.MalformedURLException;
import java.net.URL;
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

public class Parkavi extends BaseTest {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@Test
	public void Activity() throws InterruptedException {

		MobileElement Next = (MobileElement) driver.findElementById("org.gnucash.android:id/btn_save");
		Next.click();
		Next.click();
		Next.click();

		MobileElement checkbox = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[1]");

		checkbox.click();
		Next.click();
		Next.click();
		MobileElement button = (MobileElement) driver.findElementById("android:id/button1");
		button.click();

		TouchAction action = new TouchAction(driver);
		action.tap(PointOption.point(522, 1280)).perform();

		MobileElement salary = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[5]/android.widget.RelativeLayout/android.widget.ImageView[1]");
		salary.click();

		MobileElement salaryDescription = (MobileElement) driver
				.findElementById("org.gnucash.android:id/input_transaction_name");
		salaryDescription.sendKeys("MySalary");

		MobileElement salaryAmount = (MobileElement) driver
				.findElementById("org.gnucash.android:id/input_transaction_amount");
		salaryAmount.sendKeys("50000");
        
		MobileElement salaryType = (MobileElement) driver
				.findElementById("org.gnucash.android:id/input_transaction_type");
		salaryType.click();

		MobileElement salaryDropdown = (MobileElement) driver.findElementById("android:id/text1");
		salaryDropdown.click();

		MobileElement salaryDropdownValue = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
		salaryDropdownValue.click();

		MobileElement salarySave = (MobileElement) driver.findElementById("org.gnucash.android:id/menu_save");
		salarySave.click();
	    System.out.println("Salary income 50000 added");	       

		MobileElement bonus = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.ImageView[1]");
		bonus.click();

		MobileElement bonusDescription = (MobileElement) driver
				.findElementById("org.gnucash.android:id/input_transaction_name");
		bonusDescription.sendKeys("MyBonus");

		MobileElement bonusAmount = (MobileElement) driver
				.findElementById("org.gnucash.android:id/input_transaction_amount");
		bonusAmount.sendKeys("10000");

		MobileElement bonusType = (MobileElement) driver
				.findElementById("org.gnucash.android:id/input_transaction_type");
		bonusType.click();

		MobileElement bonusSave = (MobileElement) driver.findElementById("org.gnucash.android:id/menu_save");
		bonusSave.click();
		System.out.println("Bonus 10000 added");

		driver.navigate().back();

		MobileElement Expenses = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.RelativeLayout");

		Expenses.click();

		MobileElement addExpenses = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[7]/android.widget.RelativeLayout/android.widget.ImageView[3]");
		addExpenses.click();

		MobileElement accountName = (MobileElement) driver.findElementById("org.gnucash.android:id/input_account_name");
		accountName.sendKeys("MyTotalExpense");

		MobileElement accountDescription = (MobileElement) driver
				.findElementById("org.gnucash.android:id/input_account_description");
		accountDescription.sendKeys("HDFC");

		MobileElement placeholderAccount = (MobileElement) driver
				.findElementById("org.gnucash.android:id/checkbox_placeholder_account");
		placeholderAccount.click();

		MobileElement Expensesave = (MobileElement) driver.findElementById("org.gnucash.android:id/menu_save");
		Expensesave.click();
		
		System.out.println("Expenses added");
		driver.navigate().back();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
}
