package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotel {
public static WebDriver driver;
	
	@FindBy (id="radiobutton_0")
	private WebElement button;
	
	@FindBy (id="continue")
	private WebElement conti;

	public SelectHotel(WebDriver sldriver) {
		this.driver = sldriver;
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getConti() {
		return conti;
	}
	
	

}
