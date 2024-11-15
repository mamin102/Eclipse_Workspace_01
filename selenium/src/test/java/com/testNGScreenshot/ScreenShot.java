package com.testNGScreenshot;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.testNGScreenshot.CustomListner.class)

public class ScreenShot extends Base {
	
	
		@BeforeMethod
		public void setup() {
			initialization();
		}
		@AfterMethod
		public void teardown() {
			driver.quit();
		}
		@Test
		public void takeScreenShoot() {
			Assert.assertEquals(false, true);
		}
		@Test
		public void takeScreenShoot1() {
			Assert.assertEquals(false, true);
		}
		@Test
		public void takeScreenShoot2() {
			Assert.assertEquals(false, true);
		}

	}


