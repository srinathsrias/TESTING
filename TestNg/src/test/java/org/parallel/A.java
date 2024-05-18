package org.parallel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A {
	@Test
	public void testA() {
		System.out.println( "testA ");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void testA1() {
		System.out.println( "testA1 ");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	public void testA2() {
		
		System.out.println( "testA2 ");
		System.out.println(Thread.currentThread().getId());
	}

}
