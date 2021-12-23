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

	// Sign In model

	@FindBy(xpath = "//body[1]/app-root[1]/div[1]/div[2]/section[1]/div[1]/div[1]/input[1]")
	private WebElement usernameInput;

	@FindBy(xpath = "//body/app-root[1]/div[1]/div[2]/section[1]/div[2]/div[1]/input[1]")
	private WebElement passwordInput;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	private WebElement loginButton;

	@FindBy(xpath = "//p[contains(text(),'Invalid username or password')]")
	private WebElement invalidLoginMessage;

	public MovieTweeterPage(WebDriver driver) {
		this.driver = driver;
		this.wdw = new WebDriverWait(driver, Duration.ofSeconds(15));

		PageFactory.initElements(driver, this);
	}

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

}
