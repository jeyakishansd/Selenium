package com.adactin.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/adactin/feature/Adactin.feature",
					glue="com\\adactin\\stepdefiniton",

					plugin = {"pretty","html:Report/CucumberReport",
							"json.Report/Cucumber.json")
} 

public class TestRunner {
	public static WebDriver driver;
	
	
	  @BeforeClass
	  public static void setUp() throws IOException { 
		  String browser = FileReaderManager.getInstance().getcrInstance().getBrowser();
		  driver = BaseClass.getBrowser(browser); 
		  }
	 

}
