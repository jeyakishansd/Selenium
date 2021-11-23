package com.purchase.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PurchaseProject {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\MY PC\\eclipse-workspace\\Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement sign_in = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		sign_in.click();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("jeykee1@gmail.com");
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("jk123");
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		login.click();
		WebElement tshirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
		tshirt.click();
		WebElement name = driver.findElement(By.id("color_1"));
		name.click();
		WebElement cart = driver.findElement(By.name("Submit"));
		cart.click();
		WebElement check = driver.findElement(By.className("cross"));
		check.click();
		WebElement kart = driver.findElement(By.xpath("//b[text()='Cart']"));
		kart.click();
		WebElement checkout = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		checkout.click();
		WebElement address = driver.findElement(By.name("processAddress"));
		address.click();
		WebElement term = driver.findElement(By.id("cgv"));
		term.click();
		WebElement carrier = driver.findElement(By.name("processCarrier"));
		carrier.click();
		WebElement che = driver.findElement(By.xpath("//a[@title='Pay by check.']"));
		che.click();
		WebElement finale = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		finale.click();
		}
}
