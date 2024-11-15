package com.testNGParameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	
	 WebDriver driver;
	 
	@BeforeMethod
	public  void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	}
	@AfterMethod
	public void tearDown() {
		
		
		driver.quit();
	}
	
	@Test
	@Parameters({"email","pass"})	
	public void logIn(String email, String pass) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(email);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys(pass);
		
		
	}

}
