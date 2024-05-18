package org.parameter;

import java.util.Date;

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
	@BeforeClass
	private void beforeClass() {
		System.out.println("BeforeClass");
		browserLaunch("chrome");
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
	
	
	@Parameters({"username","password"})
	@Test
	private void test(String user,String pass) throws InterruptedException {
		System.out.println("test1");
		System.out.println("===========using hardassert==========");
		urlLaunch("https://www.facebook.com/");
		Thread.sleep(2000);
		Assert.assertTrue(getCurrentUrl().contains("facebook"));
		FbLogIn l=new FbLogIn();
		sendKeys(l.getTextUser(), user);
		Assert.assertEquals(getAttribute(l.getTextUser(), "value"),user ,"Verify textuser");
		sendKeys(l.getTextPass(), pass);
		Assert.assertEquals(getAttribute(l.getTextPass(), "value"), pass,"Verify textpass");
		click(l.getLogin());
		Assert.assertTrue(getCurrentUrl().contains("privacy_mutation_token"));
	}
	@Test
	private void test1() {
		System.out.println("test2");
		System.out.println("=====using soft assert======");
		SoftAssert s= new SoftAssert();
		urlLaunch("https://www.facebook.com/");
		s.assertTrue(getCurrentUrl().contains("facebook"),"verify url");
		FbRegestration r=new FbRegestration();
		click(r.getCreateAccount());
		sendKeys(r.getFirstname(),"Srinath");
		s.assertEquals(getAttribute(r.getFirstname(), "value"),"Srinath" ,"Verify firstname");
		sendKeys(r.getLastname(), "A");
		s.assertEquals(getAttribute(r.getLastname(), "value"),"A" ,"Verify lastname");
		sendKeys(r.getMobileNum(),"6381486988");
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
