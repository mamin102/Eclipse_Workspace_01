package com.DemoForm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDownMulti {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/moamin/Downloads/chromedriver"); // windows = chromedriver.xml
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();	
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("(//div[@class=\" css-tlfecz-indicatorContainer\"])[1]")).click();
		driver.findElement(By.xpath("//div[text()=\"Another root option\"]")).click();
		
		driver.findElement(By.xpath("//div[text()=\"Select Title\"]")).click();
		driver.findElement(By.xpath("//div[text() =\"Dr.\"]")).click();
		
		Select st = new Select(driver.findElement(By.xpath("//select[@id=\"oldSelectMenu\"]")));
		st.selectByValue("7");
		
		
		
		Select slt = new Select(driver.findElement(By.xpath("//select[@id=\"cars\"]")));
		
		if (slt.isMultiple()) {
			
			slt.selectByIndex(1);
			slt.selectByValue("opel");
			slt.selectByVisibleText("Audi");
			
			Thread.sleep(5000);
			
			slt.deselectAll();

			
		}
		
		  driver.quit();
		
	}

}
