package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHotel {
	public static WebDriver driver;

	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy (id="room_type")
	private WebElement roomtype;
	
	@FindBy (id="room_nos")
	private WebElement roomnos;
	
	@FindBy (id="datepick_in")
	private WebElement datein;
	
	@FindBy (id="datepick_out")
	private WebElement dateout;
	
	@FindBy (id="adult_room")
	private WebElement noofadult;
	
	@FindBy (id="child_room")
	private WebElement noofchild;
	
	@FindBy (id="Submit")
	private WebElement search;

	public SearchHotel(WebDriver shdriver) {
		this.driver = shdriver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getNoofadult() {
		return noofadult;
	}

	public WebElement getNoofchild() {
		return noofchild;
	}

	public WebElement getSearch() {
		return search;
	}
	
	
	
	

}
