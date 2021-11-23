package com.datadriver.org;

import org.testng.annotations.Test;

public class IncovationTest {
	@Test
	private void searchWaterBottle() {
	System.out.println("SearchWaterBottle");
	}

	@Test(invocationCount = 2)
	private void searchGuitar() {
		System.out.println("SearchGuitar");
	}
}
