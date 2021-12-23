package com.revature.tests;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.revature.pages.MovieTweeterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddReviewTest {

	private WebDriver driver;
	private MovieTweeterPage movieTweeterPage;

	@Given("I am at the review module")
	public void i_am_at_the_review_module() {

		System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");

		this.driver = new ChromeDriver();

		this.driver.get("http://localhost:5500");
		this.movieTweeterPage = new MovieTweeterPage(driver);
		// open login modal
		this.movieTweeterPage.getSignInButton().click();
		// on login modal
		this.movieTweeterPage.getUsernameInput().sendKeys("JohnDoe");
		this.movieTweeterPage.getPasswordInput().sendKeys("password");
		this.movieTweeterPage.getLoginButton().click();
	}

	@When("I type in an movie imdbID of {string}")
	public void i_type_in_an_movie_imdb_id_of(String string) {
		this.movieTweeterPage.getMovieReviewImdbIDInput().sendKeys(string);
	}

	@When("I type in an movie rating of {string}")
	public void i_type_in_an_movie_rating_of(String string) {
		this.movieTweeterPage.getMovieReviewRatingInput().sendKeys(string);
	}

	@When("I click the Submit button")
	public void i_click_the_submit_button() {
		this.movieTweeterPage.getReviewSubmit().click();
	}

	@Then("I should see the result")
	public void i_should_see_the_result() {
//	    this.movieTweeterPage = new MovieTweeterPage(this.driver);
	    
	    
//	    Not sure what to assert
//		String expectedAddedReceiptDescriptionText = "E2E test";
//		
//		Assertions.assertEquals(expectedAddedReceiptDescriptionText, this.movieTweeterPage.getFirstReimbursementDescrition().getText());
//		
//		this.driver.quit();
	}

	@When("I type in an movie rating of null")
	public void i_type_in_an_movie_rating_of_null() {
		this.movieTweeterPage.getMovieReviewRatingInput();
	}

	@When("I type in an movie imdbID of null")
	public void i_type_in_an_movie_imdb_id_of_null() {
		this.movieTweeterPage.getMovieReviewImdbIDInput();
	}

}
