package com.test.selenium;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class NackademinTest {

	@BeforeClass
	public static void setUpBeforeClass() {
		
	}

	@AfterClass
	public static void afterClass() {
		
		IPage.killDriver();
	}
	
	@Test
	public void test() {
		
		StartPage start = new StartPage();
		start.gotoITCourses();
		start.searchFor("Testautomatiserare");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
