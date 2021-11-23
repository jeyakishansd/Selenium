package com.datadriver.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin_Project {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MY PC\\eclipse-workspace\\DataDriver\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("jeyakishansd");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("jeyakishansd");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		WebElement location = driver.findElement(By.id("location"));
		location.click();
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_DOWN);
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		hotels.click();
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_DOWN);
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		roomtype.click();
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_DOWN);

		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();

		WebElement select = driver.findElement(By.id("radiobutton_0"));
		select.click();
		
		WebElement conti= driver.findElement(By.id("continue"));
		conti.click();
		
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("jeyakishan");
		
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("sd");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("12,dubai kurukku theru,dubai 234823");
		
		WebElement ccno = driver.findElement(By.id("cc_num"));
		ccno.sendKeys("1234567891011121");
		
		WebElement cctype = driver.findElement(By.id("cc_type"));
		cctype.click();
		ro.keyPress(KeyEvent.VK_DOWN);
		
		WebElement ccmonth = driver.findElement(By.id("cc_exp_month"));
		ccmonth.click();
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_DOWN);
		
		WebElement ccyear = driver.findElement(By.id("cc_exp_year"));
		ccyear.click();
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyPress(KeyEvent.VK_DOWN);
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("123");
		
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		
		WebElement logout = driver.findElement(By.id("logout"));
		logout.click();
	}
}
