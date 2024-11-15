package com.testNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeTest {
	

	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("beforeSuite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");

	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("beforeGroups");
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");

	}
	
	@Test(priority= 212, groups= {"1"}, enabled = true)
	public void test1() {
		System.out.println("Hi");

	}
	
	@Test (priority = 524, groups = {"2"})
	public void test2() {
		System.out.println("hello");
		
		Assert.assertTrue(false, "Don't worry");
	}
	
	@Test (priority = 324 ,dependsOnGroups= {"2"}, alwaysRun = true)
	public void test3() {
		System.out.println("hola");

	}
	
	@Test(enabled = true, expectedExceptions= {ArithmeticException.class})
	public void newText4() {
		int x= 9/0;
		System.out.println(x);
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");

	}
	
	
	@AfterGroups
	public void afterGroups() {
		System.out.println("afterGroups");

	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}
	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");

	}
	

}
