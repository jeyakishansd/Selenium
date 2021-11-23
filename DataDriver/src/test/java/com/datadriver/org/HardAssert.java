package com.datadriver.org;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HardAssert {


	@Test (retryAnalyzer =MyRetry.class)
	private void userNameValidation() {
	Assert.assertEquals("ABC", "ABC");
	}
}
