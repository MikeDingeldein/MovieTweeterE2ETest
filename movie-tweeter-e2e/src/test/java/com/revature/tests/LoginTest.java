package com.revature.tests;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.revature.pages.MovieTweeterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

	private WebDriver driver;
	private MovieTweeterPage movieTweeterPage;

	@Given("I am at the login page")
	public void i_am_at_the_login_page() {

		System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");

		this.driver = new ChromeDriver();

		this.driver.get("http://localhost:5500");
		this.movieTweeterPage = new MovieTweeterPage(driver);
		//open login modal
		this.movieTweeterPage.getSignInButton().click();

	}

	@When("I type in a username of {string}")
	public void i_type_in_a_username_of(String string) {

		this.movieTweeterPage.getUsernameInput().sendKeys(string);

	}

	@When("I type in the password  {string}")
	public void i_type_in_the_password(String string) {
		
		this.movieTweeterPage.getPasswordInput().sendKeys(string);
	}

	@When("I click the Login button")
	public void i_click_the_login_button() {
		
		this.movieTweeterPage.getLoginButton().click();
	}

	@Then("I should be sent to the review page")
	public void i_should_be_sent_to_the_employee_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("I should be see a message of {string}")
	public void i_should_be_see_a_message_of(String string) {
	    	    
		String expectedErrorHeadingText = "Invalid username or password";
		
		Assertions.assertEquals(expectedErrorHeadingText, this.movieTweeterPage.getInvalidLoginMessage().getText());
		
		this.driver.quit();
	}
}
