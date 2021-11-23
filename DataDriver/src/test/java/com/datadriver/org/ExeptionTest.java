package com.datadriver.org;

import org.testng.annotations.Test;

public class ExeptionTest {
@Test(expectedExceptions = Exception.class)
private void test() {
int i =10/0;	

}
}
