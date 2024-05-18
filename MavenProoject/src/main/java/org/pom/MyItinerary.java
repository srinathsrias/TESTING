package org.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.parent.BaseClass;

public class MyItinerary extends BaseClass {
	public MyItinerary() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Booked Itinerary")
	private WebElement Booked_Itinerary;
	@FindBy(xpath = "//form//following-sibling::tr//td//following-sibling::tr//td[2]//input[contains(@id,'order_id')]")
	private List<WebElement> orid;
	@FindBy(xpath = "//input[@name='ids[]']")
	private List<WebElement> btn;

	public List<WebElement> getBtn() {
		return btn;
	}

	@FindBy(name = "cancelall")
	private WebElement cancel_btn;

	public WebElement getCancel_btn() {
		return cancel_btn;
	}

	public WebElement getBooked_Itinerary() {
		return Booked_Itinerary;
	}

	public List<WebElement> getOrid() {
		return orid;
	}
	
}
