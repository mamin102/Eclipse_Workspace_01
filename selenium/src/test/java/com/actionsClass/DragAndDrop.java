package com.actionsClass;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void DragNDrop() {
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads/ChromeDriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/droppable");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement dragMe= driver.findElement(By.id("draggable"));
		WebElement dropMe= driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		//action.clickAndHold(dragMe).moveToElement(dropMe).release().build().perform();
		action.dragAndDrop(dragMe, dropMe).build().perform();
		
		
	}
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads/ChromeDriver");
//		WebDriver driver=new ChromeDriver();
//		
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		
//		driver.get("https://jqueryui.com/droppable/");
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		
//		driver.switchTo().frame(0);
//		WebElement dragMe= driver.findElement(By.id("draggable"));
//		WebElement dropMe= driver.findElement(By.xpath("//p[text()=\"Drop here\"]"));
//		
//		Actions action = new Actions(driver);
//		action.clickAndHold(dragMe).moveToElement(dropMe).release().build().perform();
		DragAndDrop.DragNDrop();
	}

}
