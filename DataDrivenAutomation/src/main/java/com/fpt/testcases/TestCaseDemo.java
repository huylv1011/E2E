package com.fpt.testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.fpt.base.DriverInstance;

public class TestCaseDemo extends DriverInstance {
	@Test
	public void testcase_demo() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElementById("email").sendKeys("hello");
		driver.findElementById("pass").sendKeys("hello");
		driver.quit();
	}
}
