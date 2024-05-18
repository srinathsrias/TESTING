package org.runner;

import org.test.parent.JVMReport;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Features/BuildWith",
					 glue="org.buildwith",
					 dryRun=false,
					 tags= "@E2E",monochrome=true,
					 plugin= {"pretty",
					 "html:src\\test\\resources\\Reports\\Html_Reports\\build.html",
					 "json:src\\test\\resources\\Reports\\Json_Reports\\build.json",
					 "junit:src\\test\\resources\\Reports\\Junit_Reports\\build.junit",
					 "rerun:src\\test\\resources\\Reports\\Failed_Scenarios\\build.txt"}
					 )
public class TestRunner extends AbstractTestNGCucumberTests {
	@AfterSuite
	public static void report() {
		JVMReport.jvmReportGenerator("src\\test\\resources\\Reports\\Json_Reports\\build.json");
		System.out.println("=========Report Generated===========");

	}

//	@DataProvider(parallel=false)
//	@Override
//	public Object[][] scenarios() {
//		
//		return super.scenarios();
//	}
}
