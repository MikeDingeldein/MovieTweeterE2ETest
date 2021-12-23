package com.revature.tests;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.revature.pages.MovieTweeterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddUserTest {

	private WebDriver driver;
	private MovieTweeterPage movieTweeterPage;

	@Given("I am at the signup module")
	public void i_am_at_the_signup_module() {

		System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");

		this.driver = new ChromeDriver();

		this.driver.get("http://localhost:5500");
		this.movieTweeterPage = new MovieTweeterPage(driver);
		//open sign up modal
		this.movieTweeterPage.getSignUpButton().click();
	}
	
	@When("I type in a username of null")
	public void i_type_in_a_username_of_null() {
		this.movieTweeterPage.getUsernameSignupInput();
	}

	@When("I type in the password  null")
	public void i_type_in_the_password_null() {
		this.movieTweeterPage.getPasswordSignupInput();
	}

	@Then("I should not see an error message of {string}")
	public void i_should_not_see_an_error_message_of(String string) {
		String actual = this.movieTweeterPage.getInvalidSignupMessage().getText();
		
	    Assertions.assertEquals(string, actual);
	    
	    this.driver.quit();
	}



}
