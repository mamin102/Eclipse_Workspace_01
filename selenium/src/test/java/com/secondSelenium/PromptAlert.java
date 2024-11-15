package com.secondSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		driver.findElement(By.xpath("//button[text()=\"Click for Prompt Box\"]")).click();
		
		Alert alert = driver.switchTo().alert();
		
		
		
		Thread.sleep(5000);
		
		alert.sendKeys("ShamimCHustia");
		
		alert.accept();
		
	

}
}
