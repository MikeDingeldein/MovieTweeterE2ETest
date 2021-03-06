package com.revature.tests;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.revature.pages.MovieTweeterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutTest {
	
	private WebDriver driver;
	private MovieTweeterPage movieTweeterPage;

	@Given("I am logged in to Movie Tweeter with {string} and {string}")
	public void i_am_logged_in_to_movie_tweeter_with_and(String string, String string2) {

		System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");

		this.driver = new ChromeDriver();

		this.driver.get("http://localhost:4200");
		this.movieTweeterPage = new MovieTweeterPage(driver);
		//open login modal
		this.movieTweeterPage.getSignInButton().click();
		//on login modal
		this.movieTweeterPage.getUsernameInput().sendKeys(string);
		this.movieTweeterPage.getPasswordInput().sendKeys(string2);
		this.movieTweeterPage.getLoginButton().click();
	}

	@When("I click the logout button")
	public void i_click_the_logout_button() {
		this.movieTweeterPage.getSignOutButton().click();
	}

	@Then("I return to the login page")
	public void i_return_to_the_login_page() {
		String expectedSearchHeadingText = "Search Titles";
		
		Assertions.assertEquals(expectedSearchHeadingText, this.movieTweeterPage.getSearchTitles().getText());
//		
		this.driver.quit();
	}
}
