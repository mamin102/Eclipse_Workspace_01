package com.DemoForm;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeysUpDown {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//ChromeDriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com");
		WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		Actions act = new Actions(driver);
		act.keyDown(email, Keys.SHIFT).sendKeys("mohammadamin2019@aol.com").keyUp(Keys.SHIFT).build().perform();
		//act.pause(10000).build().perform();
		email.clear();
		email.sendKeys("mohammadamin2019@aol.com");
		WebElement pass = driver.findElement(By.xpath("//input[@name=\"pass\"]"));

		pass.sendKeys("Saathi0162");
		WebElement button= 	driver.findElement(By.xpath("//button[text()= \"Log In\"]"));

		//button.sendKeys(Keys.ENTER);
		//button.submit();
		act.click(button).perform();
		
		
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.alertIsPresent());
	
		//wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.dismiss();
	}

}
