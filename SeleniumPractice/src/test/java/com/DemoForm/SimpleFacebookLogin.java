package com.DemoForm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleFacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//ChromeDriver");
		
			WebDriver driver = new ChromeDriver();
			
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		
		
		driver.navigate().to("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("xxx@gmail.com");
		
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("XXXX");
		
		driver.findElement(By.xpath("//button[text()= \"Log In\"]")).click();
		
		Thread.sleep(10000);
		
		driver.navigate().refresh();
		
		driver.close();
		
	}

}
