package com.Parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	
	@Test
	@Parameters({"myName"})
	public void method (String myName) {
		
		System.out.println("myName is " + myName);
		
	}

}

