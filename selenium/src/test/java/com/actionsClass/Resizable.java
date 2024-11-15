package com.actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads/ChromeDriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://strml.github.io/react-resizable/examples/1.html");
		
		WebElement box1= driver.findElement(By.xpath("(//span[@class=\"react-resizable-handle\"])[1]"));
		WebElement box2= driver.findElement(By.xpath("(//span[@class=\"react-resizable-handle\"])[2]"));
		WebElement box3= driver.findElement(By.xpath("(//span[@class=\"react-resizable-handle\"])[3]"));
		WebElement box4= driver.findElement(By.xpath("(//span[@class=\"react-resizable-handle\"])[4]"));
		WebElement b5= driver.findElement(By.xpath("//div[@class=\"box box3 react-resizable\"]"));
		WebElement box5= driver.findElement(By.xpath("(//span[@class=\"react-resizable-handle\"])[5]"));
		WebElement box6= driver.findElement(By.xpath("(//span[@class=\"react-resizable-handle\"])[6]"));
		WebElement box7= driver.findElement(By.xpath("(//span[@class=\"react-resizable-handle\"])[7]"));
		WebElement box8= driver.findElement(By.xpath("(//span[@class=\"react-resizable-handle\"])[8]"));
		WebElement box9= driver.findElement(By.xpath("(//span[@class=\"react-resizable-handle\"])[9]"));
		WebElement box10= driver.findElement(By.xpath("(//span[@class=\"react-resizable-handle\"])[10]"));
		WebElement box11= driver.findElement(By.xpath("(//span[@class=\"react-resizable-handle\"])[11]"));



		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.clickAndHold(box1).moveByOffset(150, 20).release().build().perform();
		Thread.sleep(3000);
		act.clickAndHold(box2).moveByOffset(150, 20).release().build().perform();
		Thread.sleep(3000);
		act.clickAndHold(box3).moveByOffset(25, 25).release().build().perform();
		Thread.sleep(3000);
		act.clickAndHold(box4).moveByOffset(12, 20).release().build().perform();
		//Thread.sleep(3000);
		//act.moveToElement(b5).clickAndHold(box5).moveByOffset(50, 50).release().build().perform();
		Thread.sleep(3000);
		act.clickAndHold(box6).moveByOffset(75, 0).release().build().perform();
		Thread.sleep(3000);
		act.clickAndHold(box7).moveByOffset(45, 0).release().build().perform();
		Thread.sleep(3000);
		act.clickAndHold(box8).moveByOffset(95, 0).release().build().perform();
		Thread.sleep(3000);
		act.clickAndHold(box9).moveByOffset(0, -50).release().build().perform();
		Thread.sleep(3000);
		act.clickAndHold(box10).moveByOffset(100, -50).release().build().perform();
		Thread.sleep(5000);
		//act.clickAndHold(box11).moveByOffset(50, 50).release().build().perform();// not Re-sizable
		
		driver.close();
		
	}
}
