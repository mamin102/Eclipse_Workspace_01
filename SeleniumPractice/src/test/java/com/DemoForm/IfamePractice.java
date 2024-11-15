package com.DemoForm;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IfamePractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads/ChromeDriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.w3schools.com/html/html_iframe.asp");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("w3loginbtn")).click();
		
		Iterator <String> it = driver.getWindowHandles().iterator();
		
		String parentWindowID= it.next();
		
		System.out.println("p id is = " + parentWindowID);
		
		String childWindowID = it.next();
		
		System.out.println("c id is = "+ childWindowID);
		
		driver.switchTo().window(childWindowID);
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		driver.findElement(By.xpath("(//a[text() =\"Next ❯\"])[1]")).click();
		
	//	driver.findElement(By.id("w3loginbtn")).click();
		
	}

}
