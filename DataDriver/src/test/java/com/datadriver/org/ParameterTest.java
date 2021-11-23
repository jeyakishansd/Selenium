package com.datadriver.org;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
@Parameters({"username","password"})
@Test
private void logIn(@Optional("Jeykee")String username, @Optional("12345")String password) {
	System.out.println("Enter the login details");
	System.out.println("username:"+username);
	System.out.println("password:"+password);
}
}
