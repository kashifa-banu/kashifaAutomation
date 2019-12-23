package com.demaout.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.demaout.Utility.Utility;

public class RegisterationPage {

	WebDriver driver;

	public RegisterationPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterFirstName() {
		driver.findElement(By.name(Utility.fetchApplicationElementProperty("fname")))
				.sendKeys(Utility.fetchApplicationDataProperty("firstName"));

	}

	public void enterLastName() {
		driver.findElement(By.name(Utility.fetchApplicationElementProperty("lname")))
				.sendKeys(Utility.fetchApplicationDataProperty("lname"));

	}

	public void enterAddress() {
		driver.findElement(By.name(Utility.fetchApplicationElementProperty("address1")))
				.sendKeys(Utility.fetchApplicationDataProperty("address"));

	}

	public void enterCity() {
		driver.findElement(By.name(Utility.fetchApplicationElementProperty("city")))
				.sendKeys(Utility.fetchApplicationDataProperty("city"));

	}

	public void selectCountry() {
		WebElement element = driver.findElement(By.name(Utility.fetchApplicationElementProperty("country")));
		Select countrySelection = new Select(element);
		countrySelection.selectByVisibleText(Utility.fetchApplicationDataProperty("country"));

	}

	public void enterUserName() {
		driver.findElement(By.id(Utility.fetchApplicationElementProperty("userid")))
				.sendKeys(Utility.fetchApplicationProperty("userName"));
	}

	public void enterPassword() {
		driver.findElement(By.name(Utility.fetchApplicationElementProperty("pwdName")))
				.sendKeys(Utility.fetchApplicationProperty("password"));
		driver.findElement(By.name(Utility.fetchApplicationElementProperty("cpwdName")))
				.sendKeys(Utility.fetchApplicationProperty("cpassword"));
	}

	public void selectGender() {
		driver.findElement(By.xpath(Utility.fetchApplicationElementProperty("gender"))).click();
	}

	public void selectTraining() {
		driver.findElement(By.xpath(Utility.fetchApplicationElementProperty("training"))).click();
	}

	public void clickSubmit() {
		//driver.findElement(By.xpath(Utility.fetchApplicationElementProperty("submit"))).click();
	}

}
