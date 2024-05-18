package org.groupss;


import org.testng.annotations.Test;

public class A {
	@Test(groups= {"regression","smoke"})
	public void testA() {
		System.out.println( "testA ");
	}
	@Test(groups= {"sanity","regression"})
	public void testA1() {
		System.out.println( "testA1 ");
	}
	@Test(groups="regression")
	public void testA2() {
		System.out.println( "testA2 ");
	}
	@Test(groups= {"regression","retest"})
	public void testA3() {
		System.out.println( "testA3 ");
	}
	@Test(groups= {"smoke","regression"})
	public void testA4() {
		System.out.println( "testA4 ");
	}
	@Test(groups= {"sanity","regression"})
	public void testA5() {
		System.out.println( "testA5 ");
	}
	@Test()
	public void testA6() {
		System.out.println( "testA6");
	}
	@Test(groups= {"sanity","regression"})
	public void testA7() {
		System.out.println( "testA7 ");
	}
	@Test(groups= {"regression","sanity"})
	public void testA8() {
		System.out.println( "testA8 ");
	}

}
