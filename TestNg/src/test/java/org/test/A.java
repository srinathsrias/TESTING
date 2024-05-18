package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A {
	@Test
	private void testA() {
		System.out.println( "testA ");
	}
	@Test
	private void testA1() {
		System.out.println( "testA1 ");
	}
	@Test
	private void testA2() {
		Assert .assertTrue(false ,"Verify testA2");
		System.out.println( "testA2 ");
	}

}
