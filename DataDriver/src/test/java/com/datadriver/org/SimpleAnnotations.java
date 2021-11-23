package com.datadriver.org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations {

	@BeforeSuite
	private void setUp() {
		System.out.println("setup");
	}
	@BeforeTest
	private void browserLaunch() {
		System.out.println("BrowserLaunch");
	}
	@BeforeClass
	private void url() {
	System.out.println("URL");	
	}
	@BeforeMethod
	private void login() {
		System.out.println("login");
	}
	@Test
	private void searchAirdopes() {
		System.out.println("airdopes");
	}
	@Test
	private void searchBtSpeaker() {
		System.out.println("searchBtSpeaker");
	}
	@AfterMethod
	private void verifyHomePage() {
		System.out.println("verifyHomePage");
	}
	@AfterClass
	private void logout() {
		System.out.println("logout");
	}
	@AfterTest
	private void browserClose() {
		System.out.println("browserClose");
	}
	@AfterSuite
	private void deleteCookies() {
		System.out.println("deleteCookies");
	}
}
