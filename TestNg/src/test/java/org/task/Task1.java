package org.task;

import org.taskpom.DemoQa;
import org.test.parent.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task1 extends BaseClass {
	@BeforeClass
	private void beforeClass() {
		browserLaunch("chrome");
		time(10);
	}
	@AfterClass
	private void afterClass() {
//		quit();

	}
	@Test
	private void test() throws InterruptedException {
		urlLaunch("https://demoqa.com/automation-practice-form");
		DemoQa d= new DemoQa();
		sendKeys(d.getfNmame(), "Srinath");
		sendKeys(d.getlNmae(), "Alagesan");
		sendKeys(d.getEmail(), "srinathsrias@gmail.com");
		Thread.sleep(2000);
		click(d.getGender());
		sendKeys(d.getMbNo(), "6381486988");
		Thread.sleep(3000);
//		sendKeys(d.getSub(), "Selenium");
		Thread.sleep(3000);
//		click(d.getHb1());
//		click(d.getHb2());
//		click(d.getHb3());
		sendKeys(d.getAddress(), "DPI");
		
	}

}
