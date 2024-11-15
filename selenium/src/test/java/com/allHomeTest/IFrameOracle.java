package com.allHomeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameOracle {
	
public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads/ChromeDriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("//li/a[text()=\"java.util\"]")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//span[text()=\"Collection\"]")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		WebElement f3= driver.findElement(By.xpath("//frame[@name=\"classFrame\"]"));
		driver.switchTo().frame(f3);
		driver.findElement(By.xpath("//dd/a[text()=\"Iterable\"]")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		
		System.out.println(driver.findElement(By.tagName("frame")));
		
}
}
