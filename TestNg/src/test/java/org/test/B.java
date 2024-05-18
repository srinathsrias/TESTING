package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class B {
	@Test
	private void testB() {
		Assert .assertTrue(false ,"Verify testB");
		System.out.println( "testB ");
	}
	@Test
	private void testB1() {
		System.out.println( "testB1 ");
	}
	@Test
	private void testB2() {
		System.out.println( "testB2 ");
	}

}
