package org.parameter;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A {
	
	@Parameters({"username","password"})
	@Test
	private void testA(@Optional("pathma@gmail.com")String user,@Optional("4686764")String pass) {
		System.out.println(user);
		System.out.println(pass);
		System.out.println( "testA ");
	}
	@Test
	private void testA1() {
		System.out.println( "testA1 ");
	}
	@Parameters("username")
	@Test
	private void testA2(@Optional("dharani@gmail.com")String user) {
		System.out.println( "testA2 ");
		System.out.println(user);
	}

}
