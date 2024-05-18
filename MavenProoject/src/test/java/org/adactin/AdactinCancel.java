package org.adactin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.List;

import javax.swing.text.html.HTML.Tag;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.LoginPageAdactin;
import org.pom.MyItinerary;
import org.test.parent.BaseClass;

public class AdactinCancel extends BaseClass {
	@BeforeClass
	public static void beforeClass() {
		browserLaunch("chrome");
		time(10);
	}

	@Test
	public void Test1() throws IOException {
		urlLaunch("https://adactinhotelapp.com/");
		assertTrue("Verify url", getCurrentUrl().contains("adactinhotelapp"));
		LoginPageAdactin l = new LoginPageAdactin();
		sendKeys(l.getUsername(), getExcelData("Adactin", "Datas", 0, 1));
		assertEquals(getAttribute(l.getUsername(), "value"), getExcelData("Adactin", "Datas", 0, 1));
		sendKeys(l.getPassword(), getExcelData("Adactin", "Datas", 1, 1));
		assertEquals(getAttribute(l.getPassword(), "value"), getExcelData("Adactin", "Datas", 1, 1));
		click(l.getLogin());
	}
	 @Test
	 public void Test3() {
	 quit();
	
	 }

	@Test
	public void Test2() throws InterruptedException, IOException {
		MyItinerary m = new MyItinerary();
		click(m.getBooked_Itinerary());
		List<WebElement> row = m.getOrid();
		System.out.println(row.size());
		for (int i = 0; i < row.size(); i++) {
			WebElement cells = row.get(i);
			String ordid = cells.getAttribute("value");
			System.out.println(ordid);
			List<WebElement> btn = m.getBtn();
			WebElement cl = btn.get(i);
			if(ordid.contains(getExcelData("Adactin", "Datas", 20, 1))) {
				cl.click();
				click(m.getCancel_btn());
				accept();
			}

		}
	}
}


