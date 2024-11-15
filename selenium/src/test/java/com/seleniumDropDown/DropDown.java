package com.seleniumDropDown;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","/Users/moamin/Downloads//chromedriver"); // windows = chromedriver.xml
		
		WebDriver driver = new ChromeDriver();// instantiate= object 
		
		driver.manage().window().maximize(); //maximize the browser
		
		driver.manage().deleteAllCookies();	//delete history 
		 
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/select-menu");
		
		Select slt = new Select (driver.findElement(By.xpath("//select[@id=\"oldSelectMenu\"]")));
		
		
		
		//if (slt.isMultiple()) {
			
					slt.selectByIndex(3);
					slt.selectByVisibleText("Blue");
			
					slt.selectByValue("7");
			
		}
		
	}

