package com.secondSelenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonCheckBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.ironspider.ca/forms/checkradio.htm");
		
		driver.findElement(By.xpath("//input[@value=\"red\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@value=\"yellow\"]")).click();
		
		driver.findElement(By.xpath("//input[@name=\"color\"][6]")).click();
		
		driver.findElement(By.xpath("//input[@name=\"browser\"][2]")).click();
		
		
		
	}
}
