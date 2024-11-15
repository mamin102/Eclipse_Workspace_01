package com.actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {
	
	public static void main(String[] args) {
		

	System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads/ChromeDriver");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	
	WebElement oslo = driver.findElement(By.xpath("//div[@id=\"box1\"]"));
	WebElement c1=driver.findElement(By.xpath("//div[@id=\"box101\"]"));
	
	WebElement stock= driver.findElement(By.xpath("//div[@id=\"box2\"]"));
	WebElement c2=driver.findElement(By.xpath("//div[@id=\"box102\"]"));
	
	WebElement wash = driver.findElement(By.xpath("//div[@id=\"box3\"]"));
	WebElement c3=driver.findElement(By.xpath("//div[@id=\"box103\"]"));
	
	WebElement cope = driver.findElement(By.xpath("//div[@id=\"box4\"]"));
	WebElement c4=driver.findElement(By.xpath("//div[@id=\"box104\"]"));
	
	WebElement seo = driver.findElement(By.xpath("//div[@id=\"box5\"]"));
	WebElement c5=driver.findElement(By.xpath("//div[@id=\"box105\"]"));
	
	WebElement rome = driver.findElement(By.xpath("//div[@id=\"box6\"]"));
	WebElement c6=driver.findElement(By.xpath("//div[@id=\"box106\"]"));
	
	WebElement madrid = driver.findElement(By.xpath("//div[@id=\"box7\"]"));
	WebElement c7=driver.findElement(By.xpath("//div[@id=\"box107\"]"));

	Actions act= new Actions(driver);
	act.dragAndDrop(oslo, c1).build().perform();
	act.dragAndDrop(stock, c2).build().perform();
	act.dragAndDrop(wash, c3).build().perform();
	act.dragAndDrop(cope, c4).build().perform();
	act.dragAndDrop(seo, c5).build().perform();
	act.dragAndDrop(rome, c6).build().perform();
	act.dragAndDrop(madrid, c7).build().perform();
}
}