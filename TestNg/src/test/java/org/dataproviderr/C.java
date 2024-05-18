package org.dataproviderr;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C {
	
	@Test(dataProvider="sri")
	private void testC(String user,String pass) {
		System.out.println( "testC ");
		System.out.println(user);
		System.out.println(pass);
		System.out.println(Thread.currentThread().getId());
	}
	@Test()
	private void testC1() {
		System.out.println( "testC ");
	}
	@Test
	private void testC2() {
		System.out.println( "testC2 ");
	}
	@DataProvider(name="sri",indices= {1,2},parallel=true)
	private Object srii() {
		Object obj[][] ={
				{"sri","123"},
				{"eniya","456"},
				{"sandy","789"}	
		};
		return obj;
	}

}
