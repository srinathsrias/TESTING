package org.sample;
import java.io.IOException;

import org.pom.FbLogIn;
import org.test.parent.BaseClass;

public class Sample extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		browserLaunch("chrome");
		urlLaunch("https://www.facebook.com/");
		time(10);
		FbLogIn f=new FbLogIn();
		sendKeys(f.getTextUser(), getExcelData("xxx", "Sheet1", 1, 0));
		sendKeys(f.getTextPass(), getExcelData("xxx", "Sheet1", 2, 3));
		click(f.getLogin());
		
	}

}
