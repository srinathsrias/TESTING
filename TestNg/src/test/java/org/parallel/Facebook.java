package org.parallel;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.pom.FbLogIn;
import org.pom.FbRegestration;
import org.test.parent.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Facebook extends BaseClass{
	static WebDriver driver;
	@Parameters("browserlaunch")
	@BeforeClass
	private void beforeClass(String url) {
		System.out.println("BeforeClass");
		browserLaunch(url);
		time(10);
	}
	@AfterClass
	private void afterClass() {
		System.out.println("AfterClass");
		quit();
	}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("BeforeMethod"+new Date());
	}
	@AfterMethod
	private void afterMethod() {
		System.out.println("AfterMethod"+new Date());
	}

	@Test
	private void test() {
		System.out.println("test1");
		System.out.println("===========using hardassert==========");
		urlLaunch("https://www.facebook.com/");
		Assert.assertTrue(getCurrentUrl().contains("facebook"),"verify url");
		FbLogIn l=new FbLogIn();
		sendKeys(l.getTextUser(), "6381486988");
		Assert.assertEquals(getAttribute(l.getTextUser(), "value"),"6381486988" ,"Verify textuser");
		sendKeys(l.getTextPass(), "gdfgdf");
		Assert.assertEquals(getAttribute(l.getTextPass(), "value"), "gdfgdf","Verify textpass");
		click(l.getLogin());
		Assert.assertTrue(getCurrentUrl().contains("privacy_mutation_token"));
	}
	@Test
	private void test1() {
		System.out.println("test2");
		System.out.println("=====using soft assert======");
		SoftAssert s= new SoftAssert();
		urlLaunch("https://www.facebook.com/");
		s.assertTrue(getCurrentUrl().contains("Facebook"),"verify url");
		FbRegestration r=new FbRegestration();
		click(r.getCreateAccount());
		sendKeys(r.getFirstname(),"Srinath");
		s.assertEquals(getAttribute(r.getFirstname(), "value"),"Srinath" ,"Verify firstname");
		sendKeys(r.getLastname(), "A");
		s.assertEquals(getAttribute(r.getLastname(), "value"),"a" ,"Verify lastname");
		sendKeys(r.getMobileNum(),"6981486988");
		s.assertEquals(getAttribute(r.getMobileNum(), "value"),"6381486988" ,"Verify mobno");
		sendKeys(r.getPass(), "635241");
		s.assertEquals(getAttribute(r.getPass(), "value"),"635241" ,"Verify password");
		selectByIndex(r.getDay(), 29);
		selectByIndex(r.getMonth(), 9);
		selectByIndex(r.getYear(), 15);
		click(r.getGender());
		s.assertAll();
	}

}
