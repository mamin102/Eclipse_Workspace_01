package com.DemoForm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxRadioButton {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		driver.findElement(By.xpath("//input[@type=\"checkbox\"][6]")).click();
		
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"][4])")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//input[@type=\"radio\"][3])")).click();
		
		Thread.sleep(10000);
		
		driver.quit();
		
	}

}
