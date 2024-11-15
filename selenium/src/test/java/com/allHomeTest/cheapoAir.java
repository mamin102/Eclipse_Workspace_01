package com.allHomeTest;

import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class cheapoAir {
	
	WebDriver driver;
	//Actions action = new Actions(driver);
	@BeforeTest
	public void openBrowser () {
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//ChromeDriver");

		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.cheapoair.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Test(priority = 0)
	public void destinationFrom () throws InterruptedException {
		
		
		//driver.findElement(By.xpath("//label[text()=\"One Way\"]")).click();
		
		driver.findElement(By.xpath("//a[@class=\"suggestion-box__clear icon\"]")).click();
		
		Thread.sleep(2000);
		
		WebElement from = driver.findElement(By.id("from0"));
		
		from.sendKeys("Bang");
		from.sendKeys(Keys.DOWN);
		
		String script = "return document.getElementById(\"from0\").value";
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		String text = (String) js.executeScript(script);
		
		System.out.println(text);
		
		while(!(text.equalsIgnoreCase("DAC - Dhaka, Bangladesh"))) {
			from.sendKeys(Keys.DOWN);
			
			Thread.sleep(1000);
			
			text = (String) js.executeScript(script);
		}
		
		from.sendKeys(Keys.ENTER);
		
	}
	
	@Test(priority= 1)
	public void destinationTo () throws InterruptedException {
		
//		driver.findElement(By.xpath("//label[text()=\"One Way\"]")).click();
		
//		driver.findElement(By.xpath("//a[@class=\"suggestion-box__clear icon\"]")).click();
		
		WebElement from = driver.findElement(By.id("to0"));
		
		from.sendKeys("NYC");
		from.sendKeys(Keys.DOWN);
	
		String script = "return document.getElementById(\"to0\").value";
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		String text = (String) js.executeScript(script);
		
		System.out.println(text);
		
		while(!(text.equalsIgnoreCase("JFK - New York Kennedy, New York, United States"))) {
			from.sendKeys(Keys.DOWN);
			
			Thread.sleep(1000);
			
			text = (String) js.executeScript(script);
		}
		
		from.sendKeys(Keys.ENTER);
	}
	
	@Test(priority=2)
	public void datePicker ()  {
		driver.findElement(By.id("cal0")).click();
		
		driver.findElement(By.xpath("//a[@aria-label=\"21 January 2021\"]")).click();
		driver.findElement(By.xpath("//a[@aria-label=\"Select next month\"]")).click();
		driver.findElement(By.xpath("//a[@aria-label=\"Select next month\"]")).click();
		driver.findElement(By.xpath("//a[@aria-label=\"11 March 2021\"]")).click();
		
		
/*		String expMonth = "May 2021";
		String expDate = "15";	
		WebElement cal= driver.findElement(By.xpath("//div[@class=\"calendar__month\"]"));		
		System.out.println(cal.getText());
		while(true) {
		String month = cal.getText();
		if(month.equals(expMonth)) {
			break;
		}
		else {
			driver.findElement(By.xpath("//a[@aria-label=\"Select next month\"]")).click();	
		}		}
		if(month.equals(expMonth)) {			
			System.out.println("its okkkkk.");		
		}
		else {
		for(int i =1; i<12; i++) {
		driver.findElement(By.xpath("//a[@class=\"calendar-nav__next icon  rightNav\"]")).click();
		Thread.sleep(1000);
		cal= driver.findElement(By.xpath("//div[@class=\"calendar__month\"]"));
		if(month.equals(expMonth)) {
		System.out.println("Month selected");
		break;
			}
				}			*/

		}
	@Test(priority = 3)
	public void customizing() {
		driver.findElement(By.id("travellerButton")).click();
		driver.findElement(By.id("addadults")).click();
		Select select = new Select(driver.findElement(By.xpath("//select[@id=\"Class\"]")));
		select.selectByValue("3");
		driver.findElement(By.xpath("//button[@id=\"closeDealDialog\"]")).click();
	}
	@Test(priority = 4, dependsOnMethods="datePicker")
	public void search() {
		driver.findElement(By.id("searchNow")).click();
	}
	@AfterTest
	public void closeApplication() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
