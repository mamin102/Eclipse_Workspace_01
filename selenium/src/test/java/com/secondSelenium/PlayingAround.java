package com.secondSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayingAround {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//ChromeDriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://www.target.com/");
		
		System.out.println(driver.getTitle());
		
		//driver.findElement(By.xpath("//span[3][@class=\"ArrowSprite-w7d9ld-0 dgdKWU h-padding-l-tiny\"]")).click();
		
		driver.findElement(By.xpath("//span[text()= \"Categories\"]")).click();
	
		Thread.sleep(5000);

		driver.findElement(By.xpath("//li[@id=\"5xt30\"]")).click();
	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@id=\"4rr05\"]")).click();
	
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id=\"checkboxOrderPickupFacet\"]")).click();
		//CheckBox xpath is good but not working
		
		//driver.findElement(By.id("checkboxOrderPickupFacet")).click();
		
	//	driver.findElement(By.xpath("//input[@id=\"facetSearch-Type\"]")).sendKeys("Christmas wallpaper");
		
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[2][text()=\"artificial flowers, plants and trees\"]")).click();
		//CheckBox xpath is good but not working
		
		//driver.findElement(By.linkText("Include out of stock")).click();

		
		
		
		
		
	}

}
