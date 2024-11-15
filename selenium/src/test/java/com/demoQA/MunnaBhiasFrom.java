package com.demoQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MunnaBhiasFrom {

	
		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//ChromeDriver");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.get("https://demoqa.com/automation-practice-form\r\n" + 
					"");
			String title=driver.getTitle();
			System.out.println(title);
			driver.findElement(By.xpath("//input[contains(@id,'firstName')]")).sendKeys("Md");
			driver.findElement(By.xpath("//input[contains(@id,'lastName')]")).sendKeys("RAHMAN");
			driver.findElement(By.xpath("//input[contains(@id,'userEmail')]")).sendKeys("munna123@yahoo.com");
			WebDriverWait wait=new WebDriverWait(driver,10);
			WebElement radiobutton=driver.findElement(By.xpath("//label[@for=\"gender-radio-1\"]"));//.click();
			wait.until(ExpectedConditions.elementToBeClickable(radiobutton));
			radiobutton.click();
			driver.findElement(By.xpath("//input[@id=\"userNumber\"]")).sendKeys("0123456789");
			WebElement select=driver.findElement(By.xpath("//input[@id='subjectsInput']"));
			select.sendKeys("math");
			select.sendKeys(Keys.ENTER);
	
			driver.findElement(By.xpath("//label[@for=\"hobbies-checkbox-1\"]")).click();
		
	}
	
	
}
