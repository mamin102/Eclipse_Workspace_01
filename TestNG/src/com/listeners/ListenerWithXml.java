package com.listeners;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ListenerWithXml extends ListernersPractice {
		
		@BeforeMethod
		public void before() {
			System.out.println("Lets go");
			
		}
		
		@AfterMethod
		public void exit () {
			System.out.println("finish!");
			
		}
		@Test
		public void signIN () {
			
			System.out.println("Please Signin here");	
			
			Assert.assertEquals(true, false);
		}
		
		@Test(dependsOnMethods = {"signIN"})
		public void updateStatus () {
		
		}
		
	}
