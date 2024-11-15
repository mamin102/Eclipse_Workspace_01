package com.testNGParameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;

public class BaseClass implements ITestListener {
	
	
	public static WebDriver driver;
	 public static void initialization()
	 {
		 System.setProperty("webdriver.chrome.driver","/Users/moamin/Downloads//chromedriver");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 
	 }
	 public void failed()
	 {
		 
		 
	 }
	

}
