package com.test.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IPage {

	protected static WebDriver driver;

	public IPage() {

		if(driver == null) {
			driver = new FirefoxDriver();
		}
	}

	public static void killDriver() {

		if(driver != null) {
			driver.close();
		}
	}
	
	public void searchFor(String search) {
		
		driver.findElement(By.id("search")).sendKeys(search);
		try {
			TimeUnit.SECONDS.sleep(1L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebElement searchField = driver.findElement(By.xpath("//input[@value='Sök']"));
		
		driver.findElement(By.xpath("//input[@value='Sök']")).click();
	}
}

































