package com.actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads/ChromeDriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/draggable/");
		
		driver.switchTo().frame(0);
		WebElement target = driver.findElement(By.xpath("//p[text()=\"Drag me around\"]"));
		
		Actions act = new Actions (driver);
		Thread.sleep(2000);
		//act.dragAndDropBy(target, 2,2).build().perform();
		act.clickAndHold(target).moveByOffset(50,10).release().build().perform();
}
}
