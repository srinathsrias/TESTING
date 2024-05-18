package org.parameter;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class B {
	
	@Parameters({"fName","lName"})
	@Test
	private void testB(@Optional("jhhfdg")String s,@Optional("6544")String a) {
		System.out.println( "testB ");
		System.out.println("fname :"+s);
		System.out.println("lname :"+a);
	}
	@Test
	private void testB1() {
		System.out.println( "testB1 ");
	}
	@Parameters({"fName","lName"})
	@Test
	private void testB2(String s,String a) {
		System.out.println( "fname :"+s);
		System.out.println(("lname :"+a));
	}

}
