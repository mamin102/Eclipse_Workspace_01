package com.allHomeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTableHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads/ChromeDriver");
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html"); // enter URL
		
		Select slt = new Select(driver.findElement(By.xpath("//select[@name=\"example_length\"]")));
		
		slt.selectByValue("100");
		
		List <WebElement> rows = driver.findElements(By.xpath("//*[@id=\"example\"]/tbody/tr"));
			int rowCount = rows.size();
			System.out.println("Total number of row is = "+ rowCount);
			
			//*[@id="example"]/tbody/tr[57]/td[2]
			//*[@id="example"]/tbody/tr[29]/td[1]===== for the check box of 29th row
			
			
			String beforeXpath = "//*[@id=\"example\"]/tbody/tr[";
			String afterXpath ="]/td[2]";
			
			for(int i=1; i<=rowCount; i++) {
				String actualXpath = beforeXpath+i+afterXpath;
				WebElement ele= driver.findElement(By.xpath(actualXpath));
				System.out.println(ele.getText());
				//if(ele.getText().contains("Tiger Nixon")) {
				if(ele.getText().equals("Tatyana Fitzpatrick")) {
					driver.findElement(By.xpath("(//td[@class=\" select-checkbox\"])["+i+"]")).click();
					System.out.println("Name is : "+ ele.getText()+ "is found at the position of :" + i);
					break;
				}
			}
			
			Thread.sleep(5000);
			driver.close();
	}

}
