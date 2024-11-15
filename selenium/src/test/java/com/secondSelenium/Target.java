package com.secondSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Target {
	
	public static void main(String[] args) {
			
			
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//chromedriver");
		
		WebDriver driver = new ChromeDriver ();
		
				
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.target.com/");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[contains(text(),'Hanukkah')]")).click();
		//its good 
//		
//		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.linkText("//a[text()\"Whimsical Hanukkah Collection\"]")).click();
//		
//		
//		
//		
//		//driver.findElement(By.xpath("//div[contains(text(),'Young Adult')]")).click();  
//		//**** its on drop down,, didn't work
//		
//		
		//driver.findElement(By.xpath("//div[contains(text(),\"In store\")]")).click(); 
		//here i tried to select a checkbox on hanukkah in store checkbox didn't work.
		
		//WebElement op = driver.findElement(By.xpath("//div[@for=\"checkboxOrderPickupFacet\"]"));
		
		//op.click();  ************here i tried to select a checkbox didn't work.
		
		
		
		
				
	//	driver.findElement(By.id("search")).sendKeys("rayban - men sunglasses");
		
		
		
		//driver.findElement(By.name("searchTerm")).sendKeys("Iphone12 pro max");
		
	//	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		//*****its ok 
		

		
		
		
	}

}
