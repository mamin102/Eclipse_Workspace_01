package com.allHomeTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads/ChromeDriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://swip.codylindley.com/popupWindowDemo.html");
		
		driver.getWindowHandles();
		driver.findElement(By.xpath("(//span[text()=\"Demo\"])[1]")).click();
		driver.findElement(By.xpath("//a[@title=\"yahoo.com\"]")).click();
		
		Set<String> handler=  driver.getWindowHandles();
		
		Iterator<String>  it= handler.iterator();
		
		String parentWindow= it.next();
		System.out.println("parent Window Id = "+ parentWindow);
		
		String childWindow= it.next();
		System.out.println("Child Window ID = "+ childWindow);
		
		driver.switchTo().window(childWindow);
		Thread.sleep(4000);
		System.out.println("Child windows Title is =  "+driver.getTitle());
		driver.findElement(By.xpath("//input[@id=\"ybar-sbq\"]")).sendKeys("Stimulas Check");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(4000);
		driver.close();
		
		driver.switchTo().window(parentWindow);
		Thread.sleep(4000);
		System.out.println("Parent Window Title is = "+ driver.getTitle() );
		
		Thread.sleep(4000);
		driver.quit();
	}

}
