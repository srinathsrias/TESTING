package org.groupss;

import org.testng.annotations.Test;

public class B {
	@Test(groups= {"regression","retest"})
	public void testB() {
		
		System.out.println( "testB ");
	}
	@Test(groups= {"regression","smoke"})
	public void testB1() {
		System.out.println( "testB1 ");
	}
	@Test(groups= {"smoke","regression"})
	public void testB2() {
		System.out.println( "testB2 ");
	}
	@Test(groups= {"sanity","regression"})
	public void testB4() {
		
		System.out.println( "testB4 ");
	}
	@Test(groups= {"retest","regression"})
	public void testB5() {
		System.out.println( "testB5 ");
	}
	@Test(groups= {"retest","regression"})
	public void testB6() {
		System.out.println( "testB6 ");
	}

}
