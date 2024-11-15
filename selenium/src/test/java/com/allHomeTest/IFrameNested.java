package com.allHomeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrameNested {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads/ChromeDriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/frames");
		//find the frame1 and store it in webelement
		WebElement frame1 = driver.findElement(By.id("frame1"));
		// switch to frame1
		driver.switchTo().frame(frame1);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input")).sendKeys("This is on Frame1");
		// find the frame 3
		Thread.sleep(2000);
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		// switch to frame 3
		driver.switchTo().frame(frame3);
		Thread.sleep(2000);

		// find the checkbox
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		// if checkbox is not selected then click the checkbox
		if(! checkbox.isSelected()){
			checkbox.click();
			Thread.sleep(2000);

		}
		driver.switchTo().defaultContent();
		Thread.sleep(2000);

		driver.switchTo().frame(1);
		Thread.sleep(2000);
		WebElement dropDown= driver.findElement(By.id("animals"));
		Select sel = new Select (dropDown);
		if(sel.isMultiple()) {
				sel.selectByIndex(0);
				Thread.sleep(2000);
				sel.selectByIndex(2);
		}
		else{ sel.selectByIndex(1);}
		Thread.sleep(2000);
	}

}
