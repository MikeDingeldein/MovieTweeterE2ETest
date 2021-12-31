package com.revature.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MovieTweeterPage {

	private WebDriver driver;
	private WebDriverWait wdw;

	@FindBy(xpath = "//strong[contains(text(),'Sign up')]")
	private WebElement signUpButton;

	@FindBy(xpath = "//body/app-root[1]/nav[1]/div[2]/div[2]/div[1]/div[1]/button[1]")
	private WebElement signInButton;

	@FindBy(xpath = "//strong[contains(text(),'Sign Out')]")
	private WebElement signOutButton;

	@FindBy(xpath = "//strong[contains(text(),'Search Titles')]")
	private WebElement searchTitles;

	@FindBy(xpath = "//body/app-root[1]/app-all-reviews[1]/div[1]/app-movie-search[1]/div[2]/div[1]/div[1]/div[1]/div[2]/p[1]")
	private WebElement searchMoviesFirstResult;

	// Sign In model

	@FindBy(xpath = "//body[1]/app-root[1]/div[1]/div[2]/section[1]/div[1]/div[1]/input[1]")
	private WebElement usernameInput;

	@FindBy(xpath = "//body/app-root[1]/div[1]/div[2]/section[1]/div[2]/div[1]/input[1]")
	private WebElement passwordInput;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	private WebElement loginButton;

	@FindBy(xpath = "//p[contains(text(),'Invalid username or password')]")
	private WebElement invalidLoginMessage;

	// Sign Up model

	@FindBy(xpath = "//body/app-root[1]/div[1]/div[2]/section[1]/div[1]/div[1]/input[1]")
	private WebElement usernameSignupInput;

	@FindBy(xpath = "//body/app-root[1]/div[1]/div[2]/section[1]/div[2]/div[1]/input[1]")
	private WebElement passwordSignupInput;

	@FindBy(xpath = "//button[contains(text(),'Signup')]")
	private WebElement signupButton;

	@FindBy(xpath = "") 
	private WebElement invalidSignupMessage;

	// Movie review

	@FindBy(xpath = "//strong[contains(text(),'Create Review')]") // not working
	private WebElement newMovieReview;

	// Movie Review Modal
	@FindBy(xpath = "//body/app-root[1]/div[1]/div[2]/section[1]/div[1]/div[1]/input[1]") // not working
	private WebElement movieReviewTitleInput;

	@FindBy(xpath = "//body/app-root[1]/div[1]/div[2]/section[1]/div[2]/div[1]/input[1]") // not working
	private WebElement movieReviewBodyInput;

	@FindBy(xpath = "//body/app-root[1]/div[1]/div[2]/section[1]/div[3]/div[1]/input[1]") // not working
	private WebElement movieReviewRatingInput;



	@FindBy(xpath = "//body/app-root[1]/div[1]/div[2]/section[1]/div[4]/div[1]/input[1]") // not working
	private WebElement movieReviewImdbIDInput;

	@FindBy(xpath = "//button[contains(text(),'Publish')]") // not working
	private WebElement reviewSubmit;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[2]/section[1]/p[1]") // not working
	private WebElement reviewErrorMessage;

	// Movie Search



	@FindBy(xpath = "//body/app-root[1]/app-all-reviews[1]/div[1]/app-movie-search[1]/div[1]/input[1]")
	private WebElement movieTitleSearchInput;

	@FindBy(xpath = "//button[contains(text(),'Search')]")
	private WebElement movieTitleSearchButton;

	@FindBy(xpath = "//body/app-root[1]/app-all-reviews[1]/div[1]/app-movie-search[1]/div[2]/div[1]/div[1]/div[1]/div[2]/p[1]") 
																																
	private WebElement movieReviewTitleSearchResult;

	@FindBy(xpath = "//p[contains(text(),'No results found')]") 
	private WebElement movieTitleSearchError;

	public MovieTweeterPage(WebDriver driver) {
		this.driver = driver;
		this.wdw = new WebDriverWait(driver, Duration.ofSeconds(15));

		PageFactory.initElements(driver, this);
	}

///////Getters////////////////////////////////////////////////////////////////////	
	public WebElement getSignUpButton() {
		return signUpButton;
	}

	public WebElement getSignInButton() {
		return signInButton;
	}

	public WebElement getUsernameInput() {
		return this.wdw.until(ExpectedConditions.visibilityOf(this.usernameInput));
//		return usernameInput;
	}

	public WebElement getPasswordInput() {
		return this.wdw.until(ExpectedConditions.visibilityOf(this.passwordInput));
//		return passwordInput;
	}

	public WebElement getLoginButton() {
		return this.wdw.until(ExpectedConditions.visibilityOf(this.loginButton));
//		return loginButton;
	}

	public WebElement getInvalidLoginMessage() {
		return this.wdw.until(ExpectedConditions.visibilityOf(this.invalidLoginMessage));
//		return invalidLoginMessage;
	}

	public WebElement getUsernameSignupInput() {
		return this.wdw.until(ExpectedConditions.visibilityOf(this.usernameSignupInput));
//		return usernameSignupInput;
	}

	public WebElement getPasswordSignupInput() {
		return passwordSignupInput;
	}

	public WebElement getSignupButton() {
		return signupButton;
	}

	public WebElement getInvalidSignupMessage() {
		return this.wdw.until(ExpectedConditions.visibilityOf(this.invalidSignupMessage));
//		return invalidSignupMessage;
	}

	public WebElement getMovieReviewImdbIDInput() {
		return this.wdw.until(ExpectedConditions.visibilityOf(this.movieReviewImdbIDInput));
//		return movieReviewImdbIDInput;
	}

	public WebElement getMovieReviewRatingInput() {
		return this.wdw.until(ExpectedConditions.visibilityOf(this.movieReviewRatingInput));
//		return movieReviewRatingInput;
	}

	public WebElement getReviewSubmit() {
		return this.wdw.until(ExpectedConditions.visibilityOf(this.reviewSubmit));
//		return reviewSubmit;
	}

	public WebElement getNewMovieReview() {
		return this.wdw.until(ExpectedConditions.visibilityOf(this.newMovieReview));
//		return newMovieReview;
	}

	public WebElement getMovieTitleSearchInput() {
		return movieTitleSearchInput;
	}

	public WebElement getMovieTitleSearchButton() throws InterruptedException {
		Thread.sleep(500); // wait for button?
		return movieTitleSearchButton;
	}

	public WebElement getMovieReviewTitleSearchResult() {
		return this.wdw.until(ExpectedConditions.visibilityOf(this.movieReviewTitleSearchResult));
//		return movieReviewTitleSearchResult;
	}

	public WebElement getSignOutButton() {
		return this.wdw.until(ExpectedConditions.visibilityOf(this.signOutButton));
//		return signOutButton;
	}

	public WebElement getSearchTitles() {
		return this.wdw.until(ExpectedConditions.visibilityOf(this.searchTitles));
//		return searchTitles;
	}

	public WebElement getMovieTitleSearchError() {
		return this.wdw.until(ExpectedConditions.visibilityOf(this.movieTitleSearchError));
//		return movieTitleSearchError;
	}

	public WebElement getSearchMoviesFirstResult() {
		return this.wdw.until(ExpectedConditions.visibilityOf(this.searchMoviesFirstResult));
//		return searchMoviesFirstResult;
	}
	
	public WebElement getMovieReviewTitleInput() throws InterruptedException {
		Thread.sleep(1000);
		return this.wdw.until(ExpectedConditions.visibilityOf(this.movieReviewTitleInput));
//		return movieReviewTitleInput;
	}

	public WebElement getMovieReviewBodyInput() throws InterruptedException {
		Thread.sleep(1000);
		return this.wdw.until(ExpectedConditions.visibilityOf(this.movieReviewBodyInput));
//		return movieReviewBodynput;
	}
	
		public WebElement getReviewErrorMessage() {
			return this.wdw.until(ExpectedConditions.visibilityOf(this.reviewErrorMessage));
//			return reviewErrorMessage;
		
	}
}
