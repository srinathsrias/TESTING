package org.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
						features="@src/test/resources/Reports/Failed_Scenarios/build.txt",
						glue="org.buildwith")
public class TestRerunner extends AbstractTestNGCucumberTests {

}
