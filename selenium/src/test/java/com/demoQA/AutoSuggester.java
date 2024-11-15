package com.demoQA;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggester {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://demoqa.com/auto-complete");
		
		WebElement from = driver.findElement(By.xpath("//input[@id=\"autoCompleteMultipleInput\"]"));
		
		from.clear();
		from.sendKeys("Black");
		from.sendKeys(Keys.ENTER);
		
		
		
		
//		driver.findElement(By.xpath("//span[text()=\"Practice Form\"]")).click();
//
//
//		WebElement from = driver.findElement(By.id("subjectsInput"));
//		
//		from.clear();
//		from.sendKeys("en");
//		
//		
////		Thread.sleep(20000);
////		Actions builder=new Actions(driver);
////		builder.moveToElement(from.findElement(By.className("subjects-auto-complete__indicator-separator css-1okebmr-indicatorSeparator"))).click().build().perform();
////		
	}
}
