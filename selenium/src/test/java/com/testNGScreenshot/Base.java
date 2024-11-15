package com.testNGScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Base {
 public static WebDriver driver;
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver","/Users/moamin/Downloads//chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
	}
	
	public void failed(String testMethodName) {
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		FileHandler.copy(srcFile, new File("/Users/moamin/eclipse-workspace/selenium/TakeFailedScreenShots//scrnshot1"+ testMethodName+ "_"+ ".png"));
		}
	catch(IOException e) {
		e.printStackTrace();
	}
	
	}
	
	
	
	
	
	
	
	

}

