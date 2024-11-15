package com.DemoForm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//ChromeDriver");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				
		driver.get("https://demoqa.com/select-menu");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement OldSelect = driver.findElement(By.id("oldSelectMenu"));
		
		Select slt = new Select(OldSelect);
		
		if (slt.isMultiple()) {
			slt.selectByVisibleText("Red");
			slt.selectByIndex(4);
			slt.selectByValue("8");
			
		}
		else {
			
			slt.selectByIndex(4);
		}
		
		
		
		
		
		
		
	}

}
