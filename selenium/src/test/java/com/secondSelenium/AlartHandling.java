package com.secondSelenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlartHandling {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("RifatAmin");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		
		
		Alert alert= driver.switchTo().alert();
		
		
		System.out.println(alert.getText());
//		alert.accept();
//		
		Thread.sleep(5000);
//		
//		alert.accept();
		
		alert.dismiss();
		
		
		
		
		
		
		
		
}
}