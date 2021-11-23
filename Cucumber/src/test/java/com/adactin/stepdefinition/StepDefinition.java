package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.pomanager.PageObjectManager;
import com.adactin.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	public static WebDriver driver = TestRunner.driver ;
	PageObjectManager pom = new PageObjectManager(driver);
	
	@Given("launch  application")
	public void launch_application() {
		getUrl("https://adactinhotelapp.com/index.php");	}

	@When("enter   username {string}")
	public void enter_username(String username) {
		sendkeys(pom.getSp().getUsername(), username);
	}

	@When("enter  password")
	public void enter_password() {
	}

	@When("click login button")
	public void click_login_button() {
	}

	@Then("navigation to search hotel page")
	public void navigation_to_search_hotel_page() {
	}

	@Given("select location")
	public void select_location() {
	}

	@Given("select hotel")
	public void select_hotel() {
	}

	@Given("select type of room")
	public void select_type_of_room() {
	}

	@Given("select no of rooms")
	public void select_no_of_rooms() {
	}

	@Given("select check in date")
	public void select_check_in_date() {
	}

	@Given("select check out date")
	public void select_check_out_date() {
	}

	@Given("select no of adult per room")
	public void select_no_of_adult_per_room() {
	}

	@Given("select no of child per room")
	public void select_no_of_child_per_room() {
	}

	@Then("navigation to select hotel page")
	public void navigation_to_select_hotel_page() {
	}

	@Then("select the hotel")
	public void select_the_hotel() {
	}

	@Then("click continue")
	public void click_continue() {
	}

	@Then("navigation to book hotel page")
	public void navigation_to_book_hotel_page() {
	}

	@Then("enter firstname")
	public void enter_firstname() {
	}

	@Then("enter lastname")
	public void enter_lastname() {
	}

	@Then("enter address")
	public void enter_address() {
	}

	@Then("enter credit card no")
	public void enter_credit_card_no() {
	}

	@Then("enter credit card expiry month")
	public void enter_credit_card_expiry_month() {
	}

	@Then("enter credit card expiry year")
	public void enter_credit_card_expiry_year() {
	}

	@Then("enter ccv no")
	public void enter_ccv_no() {
	}

	@Then("click logout")
	public void click_logout() {
	}
	

}
