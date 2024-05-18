package org.junitt;

import org.junit.Assert;
import org.junit.Test;

public class A {
	@Test
	public void testA() {
		System.out.println( "testA ");
	}
	@Test
	public void testA1() {
		System.out.println( "testA1 ");
	}
	@Test
	public void testA2() {
		Assert .assertTrue("Verify A2",false);
		System.out.println( "testA2 ");
	}

}
