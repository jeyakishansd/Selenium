package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {
	public static WebDriver driver;
	@FindBy (id="username")
		private WebElement username;

	@FindBy(id="password")
		private WebElement password;

	@FindBy(id="login")
		private WebElement login;

	public SignInPage(WebDriver spdriver) {
		this.driver =spdriver;
		 
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}


}
