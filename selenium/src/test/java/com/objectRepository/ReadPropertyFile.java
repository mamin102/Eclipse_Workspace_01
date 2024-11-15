package com.objectRepository;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertyFile {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		Properties prop= new Properties();
		FileInputStream ip= new FileInputStream("/Users/moamin/eclipse-workspace/selenium/src/test/java/com/objectRepository/Config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("email"));
		System.out.println(prop.getProperty("phone"));
		System.out.println(prop.getProperty("firstName"));
		System.out.println(prop.getProperty("lastName"));
		System.out.println(prop.getProperty("password"));
		String browserName= prop.getProperty("browser");
		String url = prop.getProperty("url");
		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","/Users/moamin/Downloads/ChromeDriver");
			driver= new ChromeDriver();	
			
		}
		else {
			System.out.println("Different Browser!!!");
		}
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get(url);
		driver.findElement(By.id(prop.getProperty("id"))).click();
		driver.findElement(By.xpath(prop.getProperty("firstnamex"))).sendKeys(prop.getProperty("firstName"));
		
		
	
	}
}
