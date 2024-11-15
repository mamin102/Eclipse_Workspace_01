package com.secondSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert2 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		
		Thread.sleep(3000);
		
		Alert ar = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		ar.sendKeys("MunnaBhaiTheBoss");
		
		
		
		
		
		
		
	}

}
