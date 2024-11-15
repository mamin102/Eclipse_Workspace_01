package DataDrivenTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.readerUtility.Xls_Reader;

public class FacebookRegistration {
	public static void main(String[] args) {
		Xls_Reader reader= new Xls_Reader("/Users/moamin/eclipse-workspace/DataDriven/src/test/java/com/testData/DataDriven.xlsx");
		
		String firstName= reader.getCellData("CustomerData", "FirstName", 2);
		System.out.println(firstName);
		
		String lastName= reader.getCellData("CustomerData", "LastName", 2);
		System.out.println(lastName);
		
		String email = reader.getCellData("CustomerData", "Email", 2);
		System.out.println(email);
		
		String password = reader.getCellData("CustomerData", "Password", 2);
		System.out.println(password);
		
		System.setProperty("webdriver.chrome.driver","//Users//moamin//Downloads//chromedriver-mac-x64//chromedriver"); // windows = chromedriver.xml
		
		WebDriver driver = new ChromeDriver();// instantiate= object 
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize(); //maximize the browser
		
		driver.manage().deleteAllCookies();	//delete history 
		 
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); 	//10 second wait then if not found then it will give exception
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_2")).click();
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name=\"reg_email_confirmation__\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys(password);		
	}

}
