package com.Step_Def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class FacebookLogin {
	WebDriver driver;
	
	
	@Given("^User is on the login page$")
	public void user_is_on_the_login_page()  {
		System.setProperty("webdriver.chrome.driver", "//Users//moamin//Downloads//chromedriver-mac-x64//chromedriver");
		
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("^title of login page is Facebook$")
	public void title_of_login_page_is_Facebook()  {
	   String expTilte=  driver.getTitle();
	   System.out.println(expTilte);
	   Assert.assertEquals("Facebook - log in or sign up", expTilte);  // Log In or Sign Up
	    
	}

	@Then("^User enters currect UserName and password$")
	public void user_enters_currect_UserName_and_password()  {
		driver.findElement(By.name("email")).sendKeys("abul@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("1234");
		
	}

	@Then("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() {
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
	}
	
}