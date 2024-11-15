package com.demoQA;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CurrentAddress {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//ChromeDriver");

		WebDriver driver = new ChromeDriver();
	//	Actions action = new Actions(driver);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://demoqa.com/forms");
			
		driver.findElement(By.xpath("//span[text()=\"Practice Form\"]")).click();
		
		WebElement address = driver.findElement(By.id("currentAddress"));
		
		address.sendKeys("7814 Woodside Ave, Apt 2");
			Thread.sleep(2000);
//		WebElement st = driver.findElement(By.className("css-tlfecz-indicatorContainer"));
//		st.click();
//		st.sendKeys(Keys.ARROW_DOWN);
//		st.sendKeys(Keys.ENTER);
		
		//action.sendKeys(Keys.TAB);
		WebElement state= driver.findElement(By.xpath("//div[text()=\"Select State\"]"));
		state.click();
		state.sendKeys(Keys.ENTER);
//		state.sendKeys("Haryana");
//		state.sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//div[text()=\"Haryana\"]")).click();
//		Thread.sleep(3000);
//			//Select City:
//		driver.findElement(By.xpath("//div[text()=\"Select City\"]")).click();
//		driver.findElement(By.xpath("//div[text()=\"Panipat\"]")).click();

	}
}
