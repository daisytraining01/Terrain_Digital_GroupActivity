package com.pageobjects;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Jyoti_pageobject {
	
       AndroidDriver<MobileElement> driver;
		
		public MobileElement okButton = (MobileElement) driver.findElementById("android:id/button1");
	
		public MobileElement userName = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/usernameTextField");
		
		public MobileElement password = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/passwordTextField");
		
		public MobileElement loginButton = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/loginButton");

		public Jyoti_pageobject(AndroidDriver<MobileElement> driver) {
			
			this.driver = driver;
		}
		
		
	

}
