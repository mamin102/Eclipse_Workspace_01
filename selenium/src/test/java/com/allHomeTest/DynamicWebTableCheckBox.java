package com.allHomeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableCheckBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads/ChromeDriver");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://editor.datatables.net/examples/api/checkbox.html");
		
		//driver.findElement(By.xpath("//th[text()=\"First name\"]")).click();
		driver.findElement(By.xpath("//th[text()=\"City\"]")).click();
		driver.findElement(By.xpath("//a[@id=\"example_next\"]")).click();

		WebElement alexa= driver.findElement(By.xpath("//td[contains(text(), \"Alexa\")]//parent::tr//input[@type=\"checkbox\"] "));
		alexa.click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class=\"dt-button buttons-create\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"DTE_Field_first_name\"]")).sendKeys("Kuddus");
		driver.findElement(By.xpath("//input[@id=\"DTE_Field_last_name\"]")).sendKeys("ali");
		driver.findElement(By.xpath("//input[@id=\"DTE_Field_phone\"]")).sendKeys("3475774444");
		driver.findElement(By.xpath("//input[@id=\"DTE_Field_zip\"]")).sendKeys("10462");
		driver.findElement(By.xpath("//button[@class=\"btn\"]")).click();
		

		Thread.sleep(5000);
		driver.close();
		
			
}
}
