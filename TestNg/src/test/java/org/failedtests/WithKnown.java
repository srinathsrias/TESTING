package org.failedtests;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class WithKnown implements IRetryAnalyzer {

	
	int min=0,max=5;
	@Override
	public boolean retry(ITestResult result) {
		if(min<max) {
			min++;
			return true; //test fail/condt true-----return true
		}
		return false; // test pass/ condt fail----return false
	}
	

}
