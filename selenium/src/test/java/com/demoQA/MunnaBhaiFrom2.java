package com.demoQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MunnaBhaiFrom2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//ChromeDriver");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/");
		driver.findElement(By.xpath("//div[2][@class=\"card mt-4 top-card\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Practice Form\"]")).click();
		//or //span[@class="text" and text()="Practice Form"]
		driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("MD");
		driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Rahman");
		driver.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("rahman@gamail.com");
		driver.findElement(By.xpath("//label[@ for=\"gender-radio-1\"]")).click();
		////label[@class="custom-control-label"and text()="Male"]
		driver.findElement(By.xpath("//input[@id=\"userNumber\"]")).sendKeys("0123456789");
		Actions action =new Actions(driver);
		//	action.sendKeys(Keys.TAB).build().
		//
		//	actions.sendKeys(Keys.TAB).build().perform();
	
		
		driver.findElement(By.xpath("//input[@id=\"dateOfBirthInput\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"9\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"1993\"]")).click();
		driver.findElement(By.xpath("//div[@aria-label=\"Choose Saturday, October 23rd, 1993\"]")).click();
		//driver.findElement(By.xpath("//div[@id=\"subjectsWrapper\"]")).sendKeys("none");
		action.sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//label[@for=\"hobbies-checkbox-1\"]")).click();
		//driver.findElement(By.xpath("//input[@id=\"uploadPicture\"]")).sendKeys("C:\\Users\\srabo\\Downloads\\sampleFile.jpeg");
		driver.findElement(By.xpath("//textarea[@id=\"currentAddress\"]")).sendKeys("8635 queens blvd");
		action.sendKeys(Keys.TAB).build().perform();
		driver.findElement(By.xpath("//div[text()=\"Select State\"]")).click();
		driver.findElement(By.xpath("//div[text()=\"Uttar Pradesh\"]")).click();
		action.sendKeys(Keys.TAB).build().perform();
		driver.findElement(By.xpath("//div[text()=\"Select City\"]")).click();
		driver.findElement(By.xpath("//div[text()=\"Lucknow\"]")).click();
		
		driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id=\"closeLargeModal\"]")).click();
		
}
}
