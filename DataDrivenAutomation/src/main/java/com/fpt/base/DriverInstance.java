package com.fpt.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fpt.ultility.Utility;

public class DriverInstance {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void initiateDriverInstance() throws Exception {
		if (Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "F://driver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver", "./driver/geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.get(Utility.fetchPropertyValue("applicationURL").toString());
	}
	
	@AfterMethod
	public void closeDriverInstance() {
		driver.quit();
	}
}
