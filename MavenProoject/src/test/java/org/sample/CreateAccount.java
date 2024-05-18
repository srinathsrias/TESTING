package org.sample;

import java.io.IOException;

import org.pom.Facebook;
import org.test.parent.BaseClass;

public class CreateAccount extends BaseClass {
	public static void main(String[] args) throws IOException {
		browserLaunch("chrome");
		urlLaunch("https://www.facebook.com/");
		time(10);
		Facebook fb=new Facebook();
		click(fb.getCreateAccount());
		sendKeys(fb.getFirstname(), "Srinath");
		sendKeys(fb.getLastname(), "A");
		sendKeys(fb.getMobileNum(), "6381486988");
		sendKeys(fb.getPass(), "sjdgfs");
		selectByIndex(fb.getDay(), 28);
		selectByValue(fb.getMonth(), "10");
		selectByVisibleText(fb.getYear(), "2001");
		click(fb.getGender());
		takeScreenShot("FB", "sample");
	}
}