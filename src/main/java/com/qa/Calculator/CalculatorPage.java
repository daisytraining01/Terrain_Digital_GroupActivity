package com.qa.Calculator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.Calculator.BasePage;

import io.appium.java_client.MobileDriver;

public class CalculatorPage extends BasePage {
	// public MobileDriver driver;
	// public WebDriverWait wait;

	public CalculatorPage(MobileDriver driver, WebDriverWait wait) {
		super(driver, wait);
		this.driver = driver;
		this.wait = wait;

	}
	// page locators



	By multiply = By.xpath("//android.widget.ImageView[@content-desc='multiply']");

	

	By equal = By.xpath("//android.widget.ImageView[@content-desc='equals']");
	
	By Result = By.id("com.miui.calculator:id/result");

	/*
	 * public int multiply(int num1, int num2){ return num1 * num2; }
	 */

	public int doMuliply(int i, int j) {
		
		String firstInput = Integer.toString(i);
		char[] a = firstInput.toCharArray();
		Integer input2 = new Integer(j);
		String secondInput = input2.toString();
		char[] b = secondInput.toCharArray();

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		for (int k = 0; k < a.length; k++) {
			String buttonPath = "com.miui.calculator:id/btn_" + a[k] + "_s";
			By number = By.id(buttonPath);
			doclick(number);
		}

		/*
		 * int c=num1 * num2;
		 * 
		 * System.out.println("Multiplied value is:"+c);
		 * 
		 */

		doclick(multiply);

		for (int l = 0; l < b.length; l++) {
			String buttonPath = "com.miui.calculator:id/btn_" + b[l] + "_s";
			By number = By.id(buttonPath);
			doclick(number);
		}

		doclick(equal);
String Output=driver.findElement(Result).getText();
//removes space from o/p and retreive the 1st value
String FinalOutput=Output.split(" ")[1];
return Integer.parseInt(FinalOutput);

	}

}