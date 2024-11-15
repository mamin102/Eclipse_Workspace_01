package com.actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads/ChromeDriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Slider.html");
		WebElement slider= driver.findElement(By.cssSelector(".ui-slider-handle"));
		//WebElement slider= driver.findElement(By.xpath("//a[@class=\"ui-slider-handle ui-state-default ui-corner-all\"]"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(slider, 500, 0).build().perform();
	}
}
