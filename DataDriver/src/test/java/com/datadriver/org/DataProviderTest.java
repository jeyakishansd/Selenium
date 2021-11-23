
package com.datadriver.org;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
@Test(dataProvider = "logInData")
private void logIn(String username,String password) {
	System.out.println("enter the login details");
	System.out.println("username;"+username);
	System.out.println("password:"+password);
	
}
@DataProvider
private Object[][] logInData(){
	return new Object[][]{
	
		
		{"aaa","123"},
		{"abc","321"},
		{"cab","231"}
	};
}
}
