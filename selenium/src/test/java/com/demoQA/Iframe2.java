package com.demoQA;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads/ChromeDriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/frames");
		
		//driver.switchTo().frame(0);
		driver.switchTo().frame(1);
	
		System.out.println(driver.getTitle());
		
}
}
