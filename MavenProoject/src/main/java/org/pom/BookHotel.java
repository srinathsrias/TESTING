package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.parent.BaseClass;

public class BookHotel extends BaseClass{
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement firstName;
	@FindBy(id="last_name")
	private WebElement lastname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement ccnumber;
	@FindBy(id="cc_type")
	private WebElement cctype;
	@FindBy(id="cc_exp_month")
	private WebElement ccmonth;
	@FindBy(id="cc_exp_year")
	private WebElement ccyear;
	@FindBy(id="cc_cvv")
	private WebElement cvvnum;
	@FindBy(id="book_now")
	private WebElement booknow;
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcnumber() {
		return ccnumber;
	}
	public WebElement getCctype() {
		return cctype;
	}
	public WebElement getCcmonth() {
		return ccmonth;
	}
	public WebElement getCcyear() {
		return ccyear;
	}
	public WebElement getCvvnum() {
		return cvvnum;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	
	
}
