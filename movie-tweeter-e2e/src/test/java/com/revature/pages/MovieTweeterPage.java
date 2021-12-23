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

	@FindBy(xpath = "//strong[contains(text(),'Sign In')]")

	private WebElement signInButton;

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

	@FindBy(xpath = "")//not working
	private WebElement invalidSignupMessage;
	
	// Movie review
	
	@FindBy(xpath = "")//not working
	private WebElement movieReviewImdbIDInput;
	
	@FindBy(xpath = "")//not working
	private WebElement movieReviewRatingInput;
	
	@FindBy(xpath = "")//not working
	private WebElement reviewSubmit;
	
	@FindBy(xpath = "")//not working
	private WebElement newMovieReview;
	
	//Movie Search
	
	@FindBy(xpath = "")//not working
	private WebElement movieTitleSearchInput;
	
	@FindBy(xpath = "")//not working
	private WebElement movieTitleSearchButton;
	
	@FindBy(xpath = "")//not working
	private WebElement movieReviewTitleSearchResult;

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
		return passwordInput;
	}

	public WebElement getLoginButton() {
		return loginButton;
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
		return movieReviewImdbIDInput;
	}

	public WebElement getMovieReviewRatingInput() {
		return movieReviewRatingInput;
	}

	public WebElement getReviewSubmit() {
		return reviewSubmit;
	}

	public WebElement getNewMovieReview() {
		return newMovieReview;
	}

	public WebElement getMovieTitleSearchInput() {
		return movieTitleSearchInput;
	}

	public WebElement getMovieTitleSearchButton() {
		return movieTitleSearchButton;
	}

	public WebElement getMovieReviewTitleSearchResult() {
		return movieReviewTitleSearchResult;
	}
	
	

}
