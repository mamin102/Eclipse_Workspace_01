package com.DemoForm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckoDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/moamin/Downloads/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		

	}

}
