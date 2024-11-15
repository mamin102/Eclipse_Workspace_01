package com.DemoForm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllTheLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//ChromeDriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("http://swip.codylindley.com/popupWindowDemo.html");
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The number of links are = "+ links.size());
		
		Thread.sleep(5000);
		driver.quit();
		

	}

}
