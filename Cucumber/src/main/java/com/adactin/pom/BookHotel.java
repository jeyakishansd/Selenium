package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookHotel {
public static WebDriver driver;
	
	@FindBy (id="first_name")
	private WebElement firstname;
	
	@FindBy (id="last_name")
	private WebElement lastname;
	
	@FindBy (id="address")
	private WebElement address;
	
	@FindBy (id="cc_num")
	private WebElement ccno;
	
	@FindBy (id="cc_type")
	private WebElement cctype;
	
	@FindBy (id="cc_exp_month")
	private WebElement ccmonth;
	
	@FindBy (id="cc_exp_year")
	private WebElement ccyear;
	
	@FindBy (id="cc_cvv")
	private WebElement ccv;
	
	@FindBy (id="book_now")
	private WebElement booknow;
	
	@FindBy (id="logout")
	private WebElement logout;

	public BookHotel(WebDriver bhdriver) {
		this.driver = bhdriver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcno() {
		return ccno;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcmonth() {
		return ccmonth;
	}

	public WebElement getCcyear() {
		return ccyear;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getLogout() {
		return logout;
	}

}
