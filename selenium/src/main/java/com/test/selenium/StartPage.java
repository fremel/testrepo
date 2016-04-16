package com.test.selenium;

import org.openqa.selenium.By;

public class StartPage extends IPage {

	public StartPage() {
		
		driver.get("http://nackademin.se");
	}
	
	public ITCoursesPage gotoITCourses() {
		
		driver.findElement(By.linkText("IT")).click();
		return new ITCoursesPage();
	}
}
