package com.demoQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class From {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//chromedriver");
		
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.daraz.com.bd/");
		
		driver.findElement(By.xpath("//input[@id=\"q\"]")).sendKeys("Bangladesh Cricket Jersy");
		driver.findElement(By.xpath("//button[text() =\"SEARCH\"]")).sendKeys(Keys.ENTER);
		
		Thread.sleep(10000);
		driver.quit();
	}

}
