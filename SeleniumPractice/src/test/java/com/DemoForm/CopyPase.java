package com.DemoForm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CopyPase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//ChromeDriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com");
		
		//copy and paste tech -> 1 
		
		WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		email.sendKeys("mohammadamin2019@aol.com");
		email.sendKeys(Keys.chord(Keys.COMMAND, "a"));
		email.sendKeys(Keys.chord(Keys.COMMAND, "c"));
		
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys(Keys.chord(Keys.COMMAND,"v"));
		
		// copy and paste tech -> 2 
		
		
//		WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
//		WebElement pass = driver.findElement(By.xpath("//input[@name=\"pass\"]"));
//		
//		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("mohammadamin2019@aol.com");
//	
//		Actions act = new Actions(driver);
//		act.pause(5000);
//
//		act.doubleClick(email).build().perform();
//		act.pause(5000);
//
//		act.sendKeys(email, Keys.chord(Keys.COMMAND, "c")).build().perform();
//		act.pause(5000);
//
//		act.sendKeys(pass, Keys.chord(Keys.COMMAND, "v")).build().perform();
//		act.pause(5000);
		

	}

}
