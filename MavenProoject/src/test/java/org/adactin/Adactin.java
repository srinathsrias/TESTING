package org.adactin;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.*;
import org.pom.BookHotel;
import org.pom.BookingConfirm;
import org.pom.LoginPageAdactin;
import org.pom.SearchHotel;
import org.pom.SelectHotel;
import org.test.parent.BaseClass;

public class Adactin extends BaseClass {
	
	@BeforeClass
	public static void beforeClass() {
		browserLaunch("chrome");
		time(10);
	}
	@Test
	public void Test1() throws IOException {
		urlLaunch("https://adactinhotelapp.com/");
		assertTrue("Verify url", getCurrentUrl().contains("adactinhotelapp"));
		LoginPageAdactin l=new LoginPageAdactin();
		sendKeys(l.getUsername(), getExcelData("Adactin", "Datas", 0, 1));
		assertEquals(getAttribute(l.getUsername(), "value"), getExcelData("Adactin", "Datas", 0, 1));
		sendKeys(l.getPassword(), getExcelData("Adactin", "Datas", 1, 1));
		assertEquals(getAttribute(l.getPassword(), "value"), getExcelData("Adactin", "Datas", 1, 1));
		click(l.getLogin());
	}
	@Test
	public void Test2() throws IOException {
		SearchHotel s=new SearchHotel();
		assertTrue("Verify Search Hotel",getCurrentUrl().contains("SearchHotel"));
		selectByValue(s.getLocation(), getExcelData("Adactin", "Datas", 2, 1));
		selectByValue(s.getHotels(), getExcelData("Adactin", "Datas", 3, 1));
		selectByValue(s.getRoomtype(), getExcelData("Adactin", "Datas", 4, 1));
		selectByValue(s.getNumofrooms(), getExcelData("Adactin", "Datas", 5, 1));
		clear(s.getIndate());
		sendKeys(s.getIndate(), getExcelData("Adactin", "Datas", 6, 1));
		clear(s.getOutdate());
		sendKeys(s.getOutdate(), getExcelData("Adactin", "Datas", 7, 1));
		selectByValue(s.getAdultroom(), getExcelData("Adactin", "Datas", 8, 1));
		selectByValue(s.getChildroom(), getExcelData("Adactin", "Datas", 9, 1));
		click(s.getSubmit());
	}
	@Test
	public void Test3() {
		assertTrue("Verify Select Hotel", getCurrentUrl().contains("SelectHotel"));
		SelectHotel s=new SelectHotel();
		click(s.getRadio());
		click(s.getContinuee());

	}
	@Test
	public void Test4() throws IOException {
		assertTrue("Verify Book Hotel", getCurrentUrl().contains("BookHotel"));
		BookHotel b= new BookHotel();
		sendKeys(b.getFirstName(), getExcelData("Adactin", "Datas", 10, 1));
		sendKeys(b.getLastname(), getExcelData("Adactin", "Datas", 11, 1));
		sendKeys(b.getAddress(), getExcelData("Adactin", "Datas", 12, 1));
		sendKeys(b.getCcnumber(), getExcelData("Adactin", "Datas", 13, 1));
		selectByValue(b.getCctype(), getExcelData("Adactin", "Datas", 14, 1));
		selectByValue(b.getCcmonth(), getExcelData("Adactin", "Datas", 15, 1));
		selectByValue(b.getCcyear(), getExcelData("Adactin", "Datas", 16, 1));
		sendKeys(b.getCvvnum(),getExcelData("Adactin", "Datas", 17, 1));
		click(b.getBooknow());

	}
	@Test
	public void Test5() throws InterruptedException, IOException {
		Thread.sleep(7000);
		assertTrue("Verify Booking Confirm", getCurrentUrl().contains("BookingConfirm"));
		BookingConfirm b=new BookingConfirm();
		excelSetRow("Adactin", "Datas", 20, 0, "OrderNumber");
		excelGetRow("Adactin", "Datas", 20, 1, getAttribute(b.getOrdernum(), "value"));

	}
	@Test
	public void Test6() {
		quit();
	}
	

}
