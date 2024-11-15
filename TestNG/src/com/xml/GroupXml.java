package com.xml;

import org.testng.annotations.Test;

public class GroupXml {
	
	
	@Test(groups = {"uno"})
	public void mac() {
		System.out.println("MAC");
	}
	
	
	@Test(groups = {"dos"})
	public void windows () {
		System.out.println("windows");
		
	
	}
	
	@Test(groups = {"uno"})
	public void iphone () {
		
		System.out.println("iphone");
	}
	
	@Test (groups = {"dos"})
	public void samsung() {
		System.out.println("samsung");
	}
	
	@Test(groups = {"uno"})
	public void pad() {
		System.out.println("samsung");
	}

}
