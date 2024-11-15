package com.allHomeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheapoAirCalender {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//ChromeDriver");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://www.cheapoair.com/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("cal0")).click();
		
		
		
		
//		String expMonth = "18 March 2021";
//		String expDate = "15";
//		
//		
//		WebElement date= driver.findElement(By.xpath("//a[@aria-label=\"18 March 2021\"]"));
//		
//		while(!date.equals(expMonth)) {
//			
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[@aria-label=\"Select next month\"]")).click();
//			
//		}
//			date.click();
		
			
			
			
		
//		WebElement cal= driver.findElement(By.xpath("//div[text()=\"June 2021\"]"));
//		
//		System.out.println(cal.getText());
//		String month = cal.getText();
//		
//		while(true) {
//			
//		
//		if(month.equals(expMonth)) {
//			break;
//		}
//		else {
//			
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//a[@aria-label=\"Select next month\"]")).click();
//			
//		}
//		
//		}
	}

}
