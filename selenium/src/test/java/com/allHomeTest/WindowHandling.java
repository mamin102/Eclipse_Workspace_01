package com.allHomeTest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads/ChromeDriver");
		WebDriver driver=new ChromeDriver();
			
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("http://swip.codylindley.com/popupWindowDemo.html");	
		driver.findElement(By.xpath("(//span[text()=\"Demo\"])[2]")).click();
		driver.findElement(By.xpath("//a[@href=\"http://www.google.com\"]")).click();
		
		Set <String> handle = driver.getWindowHandles();
		Iterator <String> it = handle.iterator();
		
		String parentWindow= it.next();
		System.out.println("parent window ID = "+parentWindow );
		
		String childWindow= it.next();
		System.out.println("child window ID = "+ childWindow);
		
		driver.switchTo().window(childWindow);
		Thread.sleep(3000);
		System.out.println("Child Window Title is = "+ driver.getTitle());
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("test Cases design technices");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(handle.iterator().next());
		//driver.switchTo().window(parentWindow);
		System.out.println("the parent Window Title is = "+ driver.getTitle());
		
		driver.close();
	}
}
