package com.test.selenium;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.junit.Assert;

public class GoogleSearch {

	private static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		
		driver = new FirefoxDriver();
		driver.get("http://google.se");
	}
	
	@Test
	public void testSearch() {
		
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium webdriver");
		driver.findElement(By.name("btnG")).click();
	}
	
	@Test
	public void simpleTest() {
		
		System.out.println("Hello word!");
		Assert.fail("Extreme bug found!");
	}
	
	@AfterClass
	public static void afterClass() {
		
		driver.close();
	}
}
