package org.test;


import org.testng.annotations.Test;

public class C {
	@Test
	private void testC() {
		System.out.println( "testC ");
	}
	@Test(enabled=false)
	private void testC1() {
		System.out.println( "testC ");
	}
	@Test
	private void testC2() {
		System.out.println( "testC2 ");
	}

}
