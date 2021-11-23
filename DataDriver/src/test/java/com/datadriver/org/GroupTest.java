package com.datadriver.org;

import org.testng.annotations.Test;

public class GroupTest {
@Test(groups = "sele")
private void selenium1() {
System.out.println("login test");
}
@Test(groups = "ap")
private void api1() {
System.out.println("Post test");
}
@Test(groups = "it")
private void git() {
System.out.println("Push Code");
}
@Test(groups = "sele")
private void selenium11() {
System.out.println("logout test");
}
@Test(groups = "ap")
private void api11() {
System.out.println("preTest");
}
@Test(groups = "it")
private void git1() {
System.out.println("pull code");
}
}
