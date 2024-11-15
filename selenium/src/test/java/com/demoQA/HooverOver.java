package com.demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HooverOver {
public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads/ChromeDriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/tool-tips");
		WebElement ho= driver.findElement(By.xpath("//button[text()=\"Hover me to see\"]"));
		WebElement textBox = driver.findElement(By.xpath("//input[@id=\"toolTipTextField\"]"));
		WebElement contrary = driver.findElement(By.xpath("//a[text()=\"Contrary\"]"));
		WebElement num= driver.findElement(By.xpath("//a[text()=\"1.10.32\"]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ho).perform();
		Thread.sleep(5000);
		//act.moveToElement(textBox).click().sendKeys("Whatup!").build().perform();
		act.moveToElement(textBox).click().keyDown(Keys.SHIFT).sendKeys("my name is rifat amin").keyUp(Keys.SHIFT).build().perform();
		//driver.findElement(By.xpath("//input[@id=\"toolTipTextField\"]")).sendKeys("I am the Boss");
		Thread.sleep(5000);
		act.moveToElement(contrary).perform();
		Thread.sleep(5000);
		act.moveToElement(num).click().perform();
		
		}
}
