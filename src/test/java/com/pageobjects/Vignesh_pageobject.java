package com.pageobjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Vignesh_pageobject {
	 AndroidDriver<MobileElement> driver;
		
//		public MobileElement okButton = (MobileElement) driver.findElementById("android:id/button1");
//	
//		public MobileElement userName = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/usernameTextField");
//		
//		public MobileElement password = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/passwordTextField");
//		
//		public MobileElement loginButton = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/loginButton");
	public MobileElement nine = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_9_s");
	 
	public  MobileElement four = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_4_s");
	 
	public  MobileElement plusbtn = (MobileElement) driver.findElementByAccessibilityId("plus");
	    
	public  MobileElement one = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_1_s");
	   
	public    MobileElement six = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_6_s");
	   
	public    MobileElement minusbtn = (MobileElement) driver.findElementByAccessibilityId("minus");
	  
	public   MobileElement five = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_5_s");
	   
	public   MobileElement multiplybtn = (MobileElement) driver.findElementByAccessibilityId("multiply");
	   
//	public    MobileElement one = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_1_s");
	    
	public    MobileElement two = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_2_s");
	  
	public   MobileElement equalsbtn = (MobileElement) driver.findElementByAccessibilityId("equals");
	   
	public MobileElement dividebtn = (MobileElement) driver.findElementByAccessibilityId("divide");
	   
	public    MobileElement fivebtn = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_5_s");
	   
	//public    MobileElement equalsbtn = (MobileElement) driver.findElementByAccessibilityId("equals");
	  
	public	    MobileElement mortage = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView");
	   
	public	    MobileElement amount = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/miui.view.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");
	  
	public	    MobileElement repayment = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/miui.view.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView");
	  
	public	    MobileElement okbtn = (MobileElement) driver.findElementById("android:id/button1");
	  
	public	    MobileElement mortprd = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/miui.view.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView");
	  
	public	    MobileElement oneclk = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/miui.widget.NumberPicker/android.widget.Button[2]");
	    
	//public    MobileElement okbtn = (MobileElement) driver.findElementById("android:id/button1");
	    
	public    MobileElement intrst = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/miui.view.ViewPager/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[4]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");
	    
	    
	public	    MobileElement calculate = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_calculate");
	    
	public	    MobileElement el24 = (MobileElement) driver.findElementByAccessibilityId("Back");

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		public Vignesh_pageobject(AndroidDriver<MobileElement> driver) {
			
			this.driver = driver;
		}
}
