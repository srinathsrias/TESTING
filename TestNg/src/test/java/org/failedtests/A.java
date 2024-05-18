package org.failedtests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;

public class A {
	@Test
	private void testA() {
		System.out.println(1/0);
		System.out.println( "testA ");
	}
	@Test
	private void testA1() {
		System.out.println( "testA1 ");
	}
	@Test(retryAnalyzer=WithKnown.class)
	private void testA2() {
		Assert .assertTrue(false ,"Verify testA2");
		System.out.println( "testA2 ");
	}

}
