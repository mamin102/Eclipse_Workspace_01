package com.demoQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxInDemoQA {
	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//ChromeDriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		driver.get("https://demoqa.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=\"card mt-4 top-card\"])[2]")).click();
		driver.findElement(By.xpath("//span[text()=\"Practice Form\"]")).click();
		Thread.sleep(5000);
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement checkBox= driver.findElement(By.xpath("//label[@for=\"hobbies-checkbox-1\"]"));
		checkBox.click();
		//wait.until(ExpectedConditions.elementToBeClickable(checkBox));
		//checkBox.click();
		//driver.findElement(By.xpath("//label[@for=\"hobbies-checkbox-3\"]")).click();
	}

}
