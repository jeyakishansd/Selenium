package com.datadriver.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	@Test
	private void realme() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MY PC\\eclipse-workspace\\DataDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.realme.com/in/");
	}
	@Test
	private void boat() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MY PC\\eclipse-workspace\\DataDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.boat-lifestyle.com/");
		
	}
	
}
