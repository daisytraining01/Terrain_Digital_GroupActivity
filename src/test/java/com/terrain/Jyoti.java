package com.terrain;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Jyoti extends BaseTest {

	@Test(priority = 1)
	public void income() {

		MobileElement el3 = (MobileElement) driver.findElementById("org.gnucash.android:id/btn_save");
		el3.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el4 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
		el4.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el5 = (MobileElement) driver.findElementById("org.gnucash.android:id/btn_save");
		el5.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el6 = (MobileElement) driver.findElementById("org.gnucash.android:id/btn_save");
		el6.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el7 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[1]");
		el7.click();
		MobileElement el8 = (MobileElement) driver.findElementById("org.gnucash.android:id/btn_save");
		el8.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el9 = (MobileElement) driver.findElementById("org.gnucash.android:id/btn_save");
		el9.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el10 = (MobileElement) driver.findElementById("android:id/button1");
		el10.click();

		// income

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el11 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[4]/android.widget.RelativeLayout");
		el11.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el12 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[4]/android.widget.RelativeLayout/android.widget.ImageView[1]");
		el12.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el13 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_name");
		el13.sendKeys("pay");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el14 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_amount");
		el14.sendKeys("30000");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el15 = (MobileElement) driver.findElementById("org.gnucash.android:id/menu_save");
		el15.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// expense
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el19 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.RelativeLayout");
		el19.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el20 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.RelativeLayout/android.widget.ImageView[1]");
		el20.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el21 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_name");
		el21.sendKeys("food");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el22 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_amount");
		el22.sendKeys("5000");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el23 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_type");
		el23.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el24 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_recurrence");
		el24.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el25 = (MobileElement) driver.findElementById("org.gnucash.android:id/repeat_switch");
		el25.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el26 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.Spinner/android.widget.TextView");
		el26.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el27 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]");
		el27.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el28 = (MobileElement) driver.findElementById("org.gnucash.android:id/done_button");
		el28.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el29 = (MobileElement) driver.findElementById("org.gnucash.android:id/menu_save");
		el29.click();

		// equity
		MobileElement el30 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[6]/android.widget.RelativeLayout/android.widget.ImageView[1]");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		el30.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el31 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_amount");
		el31.sendKeys("2000");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el32 = (MobileElement) driver.findElementById("org.gnucash.android:id/menu_save");
		el32.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el33 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.RelativeLayout");
		el33.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el34 = (MobileElement) driver.findElementById("org.gnucash.android:id/create_transaction");
		el34.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el35 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_name");
		el35.sendKeys("equidity");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el36 = (MobileElement) driver.findElementById("org.gnucash.android:id/input_transaction_amount");
		el36.sendKeys("5000");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el37 = (MobileElement) driver.findElementById("org.gnucash.android:id/menu_save");
		el37.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().back();
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}

}
