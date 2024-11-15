package com.firstSelenium;

import java.io.File;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class OpenLoginPage {
	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver","/Users/moamin/Downloads//chromedriver"); // windows = chromedriver.xml
		
		WebDriver driver = new ChromeDriver();// instantiate= object 
		
		driver.manage().window().maximize(); //maximize the browser
		
		driver.manage().deleteAllCookies();	//delete history 
		
		 
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); 	//10 second wait then if not found then it will give exception
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.id("email")).sendKeys("amkab@gmail.com");
		//driver.findElement(By.name("email")).sendKeys("abul@gmail.com");
		
		Actions action= new Actions(driver);
		WebElement userName=  driver.findElement(By.xpath("//input[@type=\"text\"]"));
		action.keyDown(userName, Keys.SHIFT).sendKeys("abcd").keyUp(Keys.SHIFT).build().perform();
		
		
		
		
		
		
//		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		FileHandler.copy(srcFile, new File("/Users/moamin/eclipse-workspace/selenium/TakeFailedScreenShots//takeshot.png"));

		
	}

}
