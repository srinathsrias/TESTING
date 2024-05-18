package org.dataproviderr;

import java.util.Date;

import org.pom.FbLogIn;
import org.pom.FbRegestration;
import org.test.parent.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


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
	
	@Test(dataProvider="login",dataProviderClass=Dataa.class)
	private void test(String user,String pass) {
		System.out.println("test1");
		
		urlLaunch("https://www.facebook.com/");
		
		FbLogIn l=new FbLogIn();
		
		sendKeys(l.getTextUser(),user);
		
		sendKeys(l.getTextPass(), pass);
		
		click(l.getLogin());
		
	}
	@Test(dataProvider="register",dataProviderClass=Dataa.class)
	private void test1(String fName,String lName,String mbNo,String pass,int day,int mon,int year) {
		System.out.println("test2");
		
		urlLaunch("https://www.facebook.com/");
		
		FbRegestration r=new FbRegestration();
		
		click(r.getCreateAccount());
		
		sendKeys(r.getFirstname(),fName);

		sendKeys(r.getLastname(), lName);
		
		sendKeys(r.getMobileNum(),mbNo);

		sendKeys(r.getPass(), pass);

		selectByIndex(r.getDay(), day);
		
		selectByIndex(r.getMonth(), mon);
		
		selectByIndex(r.getYear(), year);
		
		click(r.getGender());
		

	}

}
