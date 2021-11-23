package com.datadriver.org;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
	@Ignore
	@Test
	private void searchTrimmer() {
		System.out.println("searchTrimmer");
	}
	@Test
	private void searchPowerBank() {
System.out.println("SearchPowerBank");	
	}
	@Test
	private void searchCarChargingAdaptor() {
	System.out.println("SearchCarChargingAdaptor");	// TODO Auto-generated method stub

	}
}
