package org.buildwith;



import java.io.IOException;

import org.test.parent.BaseClass;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass{
	@Before
	public void beforeScrenarios() {
		System.out.println("=========before========");
		browserLaunch("chrome");
		urlLaunch("https://builtwith.com/");
		time(20);
	}
	@After
	public void afterScenarios(Scenario sc) throws InterruptedException, IOException {
		System.out.println("==========After==========");
		String name = sc.getName();
		if(sc.isFailed()) {
			takeScreenShot("Build", name);
		}
		else {
			System.out.println("=============Successfully Executed============");
		}
		Thread.sleep(3000);
		quit();

	}

}
