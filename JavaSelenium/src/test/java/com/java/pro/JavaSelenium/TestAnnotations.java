package com.java.pro.JavaSelenium;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {
	
	@Test
	public void testcase1() {
		System.out.println("TC1");
		
	}
	@Test
	public void testcase2() {
		System.out.println("TC2");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I'm in before method");
	}
	
	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		System.out.println("I'm in After method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@org.testng.annotations.AfterClass
	public void AfterClass() {
		System.out.println("After Class");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@org.testng.annotations.AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}
	
	@BeforeSuite
	public void beforeSuite() {
	System.out.println("Before suite");	
	}
	
	@org.testng.annotations.AfterSuite
	public void AfterSuite() {
	System.out.println("After suite");	
	}
	

}
