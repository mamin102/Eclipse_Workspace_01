package com.testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewPracticeTestNG {
	
	
	@BeforeMethod
	public void method () {
		System.out.println("before method");
	}
	
	@Test(invocationCount = 20, invocationTimeOut = 30)
	public void kaka () {
		System.out.println("Test -2");}
	
	@AfterMethod
	public void AfterMethod ( ) {
		
		System.out.println("After method");
		
	}

}
