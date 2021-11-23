package com.datadriver.org;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
	String actual ="jeyKee";
	String expected = "jeyKee";
	
	@Test
	private void test1() {
		System.out.println("Test 1 started");
		Assert.assertEquals(actual, expected);
		System.out.println("Test 2 started");
	}
}
