package org.dataproviderr;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A {
	@Test(dataProvider="login")
	private void testA(String user,String pass) {
		System.out.println(user);
		System.out.println(pass);
		System.out.println( "testA ");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void testA1() {
		System.out.println( "testA1 ");
	}
	@Test
	private void testA2() {
		System.out.println( "testA2 ");
	}
	
	@DataProvider(name="login",indices={1,3},parallel=true)
	private Object [][] datas() {
		
		Object obj [][]= {
				{"srinath@gmsl.com","63814856988"},
				{"pathma3402@gmail.com","9360772960"},
				{"pdharanibvn@gmail.com","9566858082"},
				{"shandhini2001@gmail.com","8300366445"}
		};
		return obj;
	}

}
