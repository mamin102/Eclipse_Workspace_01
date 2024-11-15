package com.testNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeTestNG {
	
	@BeforeMethod
	public void method () {
		System.out.println("before method");
	}
	
	@Test(dependsOnMethods = {"shamim"}, alwaysRun = true)
	public void method1 () {
		
		System.out.println("TEST 1");
		
	}
	
	@Test (priority = 2, groups = {"secondG"})
	public void guys () {
		System.out.println("Test 2");
		
	}
	//enabled=false
	@Test(priority = 5, groups = {"firstG"})
	public void women () {
		System.out.println("test 3");
		//Assert.assertTrue(false);
		
	}
	
	@Test (priority =0, groups = {"secondG"})
	public void rifat () {
		System.out.println("Test 0");}
		
	@Test(groups= {"firstG"} )
		public void shamim () {
			System.out.println("Test -1");
			//int i = 9/0;
		
			
			Assert.assertTrue(false);
	}
	
	
	@Test(groups= {"secondG"})
	public void munna () {
		System.out.println("Test -2");}

	
	
	@AfterMethod
	public void method4 ( ) {
		
		System.out.println("After method");
		
	}
}
