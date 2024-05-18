package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.parent.BaseClass;

public class BookingConfirm extends BaseClass {
	public BookingConfirm() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement ordernum;
	public WebElement getOrdernum() {
		return ordernum;
	}

}
