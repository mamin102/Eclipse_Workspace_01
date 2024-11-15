package com.allHomeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheapoAirdessTo {
public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//ChromeDriver");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://www.cheapoair.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//a[@class=\"suggestion-box__clear icon\"]")).click();
		
		WebElement from=  driver.findElement(By.xpath("//input[@id=\"from0\"]"));
		
				from.sendKeys("DAC - Dhaka, Bangladesh");
				from.sendKeys(Keys.ENTER);
				
	//	driver.findElement(By.xpath("//input[@value=\"DAC - Dhaka, Bangladesh\"]")).click(); (direct dont work)
		
		
				
				
	
}}
