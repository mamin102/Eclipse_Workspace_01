package com.secondSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAndRadioButtonPractice {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//chromedriver");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		driver.findElement(By.xpath("//div[@class=\"checkbox\"][4]")).click();
		
		//not working @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		
		
		
		
}
}