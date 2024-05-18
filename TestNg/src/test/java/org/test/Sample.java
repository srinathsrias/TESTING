package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	@BeforeClass
	private void bc() {
		System.out.println("bc");
	}
	@AfterClass
	private void ac() {
		System.out.println("ac");
	}
	@BeforeMethod
	private void bm() {
		System.out.println("bm");
	}
	@AfterMethod
	private void am() {
		System.out.println("am");
	}
	@Test(priority=3)
	private void test() {
		System.out.println("test");
	}
	@Test(enabled=false)
	private void test1() {
		System.out.println("test1");
	}
	@Test(priority=-1)
	private void test2() {
		System.out.println("test2");
	}
	@Test()
	private void test3() {
		System.out.println("test3");
	}
	@Test(invocationCount=5)
	private void test4() {
		System.out.println("test4");
	}
	@Test
	private void test5() {
		System.out.println("test5");
	}

}
