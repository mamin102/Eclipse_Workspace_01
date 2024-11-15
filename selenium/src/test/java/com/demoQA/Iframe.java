package com.demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads/ChromeDriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[2]")).click();
		WebElement mainFrame= driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		driver.switchTo().frame(mainFrame);
		WebElement nestedFrame= driver.findElement(By.xpath("//iframe[@style=\"float: left;height: 250px;width: 400px\"]"));
		Thread.sleep(3000);
		driver.switchTo().frame(nestedFrame);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("MohammadRifatAmin");
}
}
