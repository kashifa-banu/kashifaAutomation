package com.demaout.testcases;

import org.openqa.selenium.WebDriver;

import com.demaout.driverCreation.CreateDriver;
import com.demaout.pages.RegisterationPage;

import cucumber.annotation.en.*;
import cucumber.runtime.PendingException;

public class Steps {
	WebDriver driver;
	RegisterationPage registerationPage;
	
	@Given("^User launch the URL and in the submission page$")
	public void User_launch_the_URL_and_in_the_submission_page() throws Throwable {
	   CreateDriver createDriver = new CreateDriver();
	   driver=createDriver.createDriver();
	}

	@When("^user launches the URL and enter contact information$")
	public void user_launches_the_URL_and_enter_contact_information() throws Throwable {
		registerationPage = new RegisterationPage(driver);
		registerationPage.enterFirstName();
		registerationPage.enterLastName();
		
	}

	@When("^mailing information$")
	public void mailing_information() throws Throwable {
		registerationPage.enterAddress();
		registerationPage.enterCity();
		registerationPage.selectCountry();
	}

	@When("^User information$")
	public void User_information() throws Throwable {
	    registerationPage.enterUserName();
	    registerationPage.enterPassword();
	}

	@When("^selects the Gender$")
	public void selects_the_Gender() throws Throwable {
	    registerationPage.selectGender();
	}

	@When("^selects the training$")
	public void selects_the_training() throws Throwable {
	   registerationPage.selectTraining();
	}

	@When("^clicks on submit$")
	public void clicks_on_submit() throws Throwable {
	   registerationPage.clickSubmit();
	}

	@Then("^an alert should display$")
	public void an_alert_should_display() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}


}
