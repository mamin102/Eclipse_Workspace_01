package com.testNGScreenshot;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class CustomListner extends Base implements ITestListener{

		
		public void onTestFailure(ITestResult result) {
			
			System.out.println("Test Failed");
			failed(result.getMethod().getMethodName());
			
		}

		
		
	}

