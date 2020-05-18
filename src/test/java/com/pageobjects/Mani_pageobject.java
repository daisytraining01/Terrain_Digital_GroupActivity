package com.pageobjects;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Mani_pageobject {
	
       AndroidDriver<MobileElement> driver;
       
       public  MobileElement agree_Button = (MobileElement) driver.findElementById("android:id/button1");
       public MobileElement firstOperation = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_40'_s");
       public  MobileElement addition = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_10_s");
       public MobileElement additionTyping = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_10_s");
       public MobileElement minus_Operation = (MobileElement) driver.findElementByAccessibilityId("minus");
       public MobileElement equals_Operation = (MobileElement) driver.findElementByAccessibilityId("equals");
       public MobileElement scientific_Calpage = (MobileElement) driver.findElementById("com.miui.calculator:id/text_view_sin");
       public MobileElement btn_Nine = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_9_s");
       public MobileElement btn_Sin0 = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_0_s");
       public MobileElement btn_right = (MobileElement) driver.findElementByAccessibilityId("right parenthesis");
       public MobileElement btn_Divide = (MobileElement) driver.findElementByAccessibilityId("divide");
       public  MobileElement btn_Cos0 = (MobileElement) driver.findElementById("com.miui.calculator:id/text_view_cos");
       public MobileElement btn_Six = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_6_s");
       public MobileElement btn_Zero = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_0_s");
       public MobileElement delete_Btn = (MobileElement) driver.findElementByAccessibilityId("delete");
       public MobileElement btn_Zer = (MobileElement) driver.findElementById("com.miui.calculator:id/btn_0_s");
	    

	    
	    
	    
       //public MobileElement okButton = (MobileElement) driver.findElementById("android:id/button1");
	    //public MobileElement userName = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/usernameTextField");
		//public MobileElement password = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/passwordTextField");
		//public MobileElement loginButton = (MobileElement) driver.findElementById("com.experitest.ExperiBank:id/loginButton");
        public Mani_pageobject(AndroidDriver<MobileElement> driver) {
			
			this.driver = driver;
		}
		
		
	

}
