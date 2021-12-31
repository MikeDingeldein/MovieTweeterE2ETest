package com.revature.tests;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.revature.pages.MovieTweeterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MovieSearchTest {

	private WebDriver driver;
	private MovieTweeterPage movieTweeterPage;

	@Given("I am at the search module")
	public void i_am_at_the_search_module() {

		System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");

		this.driver = new ChromeDriver();

		this.driver.get("http://localhost:4200");
		this.movieTweeterPage = new MovieTweeterPage(driver);
		// open login modal
		this.movieTweeterPage.getSignInButton().click();
		// on login modal
		this.movieTweeterPage.getUsernameInput().sendKeys("JohnDoeFake");
		this.movieTweeterPage.getPasswordInput().sendKeys("password");
		this.movieTweeterPage.getLoginButton().click();

	}

	@When("I type in an movie title of {string}")
	public void i_type_in_an_movie_title_of(String string) {
		this.movieTweeterPage.getMovieTitleSearchInput().sendKeys(string);
	}

	@When("I type in an movie title of null")
	public void i_type_in_an_movie_title_of_null() {
		this.movieTweeterPage.getMovieTitleSearchInput();
	}

	@When("I click the Search button")
	public void i_click_the_search_button() throws InterruptedException {
		this.movieTweeterPage.getMovieTitleSearchButton().click();
	}

	@Then("I should see the movie title search results {string}")
	public void i_should_see_the_movie_title_search_results(String string) {
		String expectedErrorHeadingText = string;
		
		Assertions.assertEquals(expectedErrorHeadingText, this.movieTweeterPage.getSearchMoviesFirstResult().getText());
		
		this.driver.quit();
	}

	@Then("I should not see an error message")
	public void i_should_not_see_an_error_message() {
		String expectedErrorHeadingText = "No results found";
		
		Assertions.assertEquals(expectedErrorHeadingText, this.movieTweeterPage.getMovieTitleSearchError().getText());
		
		this.driver.quit();
	}
	
//	@Then("I should see the movie title search results <movieResults>")
//	public void i_should_see_the_movie_title_search_results_movie_results() {
//		String expectedErrorHeadingText = "Invalid username or password";
//		
//		Assertions.assertEquals(expectedErrorHeadingText, this.movieTweeterPage.getSearchTitles().getText());
//		
//		this.driver.quit();
//	}
//
//	@Then("I should not see a result")
//	public void i_should_not_see_a_result() {
//		String expectedErrorHeadingText = "No results found";
//		
//		Assertions.assertEquals(expectedErrorHeadingText, this.movieTweeterPage.getMovieTitleSearchError().getText());
//		
//		this.driver.quit();
//	}

}
