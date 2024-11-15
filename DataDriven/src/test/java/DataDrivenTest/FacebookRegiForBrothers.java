package DataDrivenTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.readerUtility.Xls_Reader;

public class FacebookRegiForBrothers {

	public static void main(String[] args) throws InterruptedException {
		
		Xls_Reader reader= new Xls_Reader("/Users/moamin/eclipse-workspace/DataDriven/src/test/java/com/testData/Brothers.xlsx");
		String firstName= reader.getCellData("personal info", "firstName", 5);
		System.out.println(firstName);
		String lastName = reader.getCellData("personal info", "lastName", 5);
		System.out.println(lastName);
		String phone = reader.getCellData("personal info", "phone", 5);
		System.out.println(phone);
		String age = reader.getCellData("personal info", "age", 5);
		System.out.println(age);
		String email = reader.getCellData("personal info", "email", 5);
		System.out.println(email);
		String pass = reader.getCellData("personal info", "pass", 5);
		System.out.println(pass);
		
		System.setProperty("webdriver.chrome.driver","//Users//moamin//Downloads//chromedriver-mac-x64//chromedriver"); // windows = chromedriver.xml
		
		WebDriver driver = new ChromeDriver();// instantiate= object 
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize(); //maximize the browser
		
		driver.manage().deleteAllCookies();	//delete history 
		 
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); 
		driver.get("https://www.daraz.com.bd/");
		driver.findElement(By.xpath("//a[text()=\"Signup / Login\"]")).click();
		//for register
		driver.findElement(By.xpath("//a[text()=\"Register\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Enter your first and last name\"]")).sendKeys(firstName+" "+lastName);
		driver.findElement(By.xpath("//input[@placeholder=\"Please enter your phone number\"]")).sendKeys(phone);
		driver.findElement(By.xpath("//input[@placeholder=\"Minimum 6 characters with a number and a letter\"]")).sendKeys(pass);
		//for login
		//driver.findElement(By.xpath("//input[@placeholder=\"Please enter your Phone Number or Email\"]")).sendKeys(email);
		//driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(pass);
		
		Thread.sleep(60000);
		driver.quit();
	}

}
