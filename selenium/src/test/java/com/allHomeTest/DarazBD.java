package com.allHomeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DarazBD {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads/ChromeDriver");
		driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://www.daraz.com.bd/#");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Actions ac= new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[text()=\"Electronic Devices\"]"))).build().perform();
		Thread.sleep(3000);
		ac.moveToElement(driver.findElement(By.xpath("//span[text()=\"Smartphones\"]"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=\"Xiaomi Phones\"]")).click();
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[6]")).click();
		driver.findElement(By.linkText("Redmi Note 9S - 6GB RAM/128GB ROM - 48MP AI Quad Camera - 6.67\" FHD+DotDisplay - 5,020 mAh Battery")).click();
		WebElement search= driver.findElement(By.xpath("//input[@type=\"search\"]"));
		search.sendKeys("bang");
		search.findElement(By.xpath("//span[text()=\"ladesh cricket team jersey\"]")).click();
		//driver.findElement(By.xpath("//span[text()=\"ladesh army t shirt\"]")).click();
	}
}
