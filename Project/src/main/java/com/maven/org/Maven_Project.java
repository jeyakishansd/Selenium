package com.maven.org;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maven_Project   {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\MY PC\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		WebElement sign_in = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		sign_in.click();
		Thread.sleep(4000);
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email.sendKeys("jeykee3@gmail.com");
		Thread.sleep(4000);
		WebElement submit = driver.findElement(By.id("SubmitCreate"));
		submit.click();
		//Thread.sleep(4000);
		//WebElement mr = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		//mr.click();
		Thread.sleep(4000);
		WebElement firstname = driver.findElement(By.name("customer_firstname"));
		firstname.sendKeys("jey");
		WebElement lastname = driver.findElement(By.name("customer_lastname"));
		lastname.sendKeys("kee");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("jk123");
		Thread.sleep(4000);
		WebElement address = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		address.sendKeys("Vandiyur");
		Thread.sleep(4000);
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Madurai");
		Thread.sleep(4000);
		WebElement state = driver.findElement(By.name("id_state"));
		state.sendKeys("Alabama");
		Thread.sleep(4000);
		WebElement zip = driver.findElement(By.id("postcode"));
		zip.sendKeys("62502");
		WebElement phno = driver.findElement(By.name("phone"));
		phno.sendKeys("7639575709");
		Thread.sleep(4000);
		WebElement register = driver.findElement(By.xpath("//button[@class='btn btn-default button button-medium']"));
		register.click();
		Thread.sleep(4000);
		WebElement email1= driver.findElement(By.id("email"));
		email1.sendKeys("jeykee1@gmail.com");
		Thread.sleep(4000);
		WebElement ps = driver.findElement(By.id("passwd"));
		ps.sendKeys("jk123");
		Thread.sleep(4000);
		WebElement si = driver.findElement(By.id("SubmitLogin"));
		si.click();
	}
}
