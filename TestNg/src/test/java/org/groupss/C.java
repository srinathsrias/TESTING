package org.groupss;


import org.testng.annotations.Test;

public class C {
	@Test(groups= {"regression","sanity"})
	public void testC() {
		System.out.println( "testC ");
	}
	@Test(groups= {"retest","regression"})
	public void testC1() {
		System.out.println( "testC1 ");
	}
	@Test(groups= {"smoke","regression"})
	public void testC2() {
		System.out.println( "testC2 ");
	}

}
