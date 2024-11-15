package com.seleniumDropDown;

import java.util.List; 
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectForDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/moamin/Downloads//chromedriver"); // windows = chromedriver.xml
		
		WebDriver driver = new ChromeDriver();// instantiate= object 
		
		driver.manage().window().maximize(); //maximize the browser
		
		driver.manage().deleteAllCookies();	//delete history 
		 
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/select-menu");
		
		
		driver.findElement(By.xpath("(//div[@class=\" css-tlfecz-indicatorContainer\"])[1]")).click();
		driver.findElement(By.xpath("//div[text()=\"A root option\"]")).click();
		
		driver.findElement(By.xpath("//div[text()=\"Select Title\"]")).click();
		driver.findElement(By.xpath("//div[text()=\"Mr.\"]")).click();
		Select st = new Select(driver.findElement(By.xpath("//select[@id=\"oldSelectMenu\"]")));
		st.selectByValue("4");
		
		driver.findElement(By.xpath("//div[text()=\"Select...\"]")).click();
		driver.findElement(By.xpath("//div[text()=\"Green\"]")).click();
		driver.findElement(By.xpath("//div[text()=\"Red\"]")).click();
		
		
		
	Select slt = new Select (driver.findElement(By.xpath("//select[@name=\"cars\"]")));
	
		List<WebElement> ele= slt.getOptions();
				
		for(WebElement selectAll: ele) {
			
			slt.selectByVisibleText(selectAll.getText());
		}
	
//		
//		if (slt.isMultiple()) {
//			
//			slt.selectByIndex(0);
//			
//			slt.selectByValue("saab");
//			
//			slt.selectByVisibleText("Audi");
//			
//		}
		//slt.deselectByIndex(0);
		
		Thread.sleep(2000);
		
		//slt.deselectAll();
		
	}

}
