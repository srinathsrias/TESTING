package org.junitt;
import java.util.List;

import org.junit.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class TestResult {
	@Test
	public void test() {
		Result r = JUnitCore.runClasses(A.class,B.class,C.class);
		System.out.println("Run count: "+r.getRunCount());
		System.out.println("Failed count: "+r.getFailureCount());
		System.out.println("Run Time: "+r.getRunTime());
		System.out.println("Ignore count: "+r.getIgnoreCount());
		System.out.println("Suite level exeution: "+r.wasSuccessful());
		
		//getFailures
		List<Failure> s = r.getFailures();
		for(Failure x:s) {
			System.out.println(x);
		}
	}

}
