package com.demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrograssBar {
public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads/ChromeDriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/progress-bar");
		
		driver.findElement(By.xpath("//button[@id=\"startStopButton\"]")).click();

	}
}
