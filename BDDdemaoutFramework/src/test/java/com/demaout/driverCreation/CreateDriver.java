package com.demaout.driverCreation;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.demaout.Utility.Utility;

import cucumber.annotation.After;

public class CreateDriver {

	WebDriver driver;

	@Test
	public WebDriver createDriver() {

		if (Utility.fetchApplicationProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		} else
			driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get(Utility.fetchApplicationProperty("applicationURL"));
		return driver;
	}

	@After
	public void tearDown() {
		driver.close();
	}

}
