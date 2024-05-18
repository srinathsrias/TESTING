package org.junitt;
import org.junit.*;
public class C {
	@Test
	public void testC() {
		System.out.println( "testC ");
	}
	@Ignore
	@Test()
	public void testC1() {
		System.out.println( "testC ");
	}
	@Test
	public void testC2() {
		System.out.println( "testC2 ");
	}

}
