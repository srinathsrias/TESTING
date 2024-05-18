package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.parent.BaseClass;

public class SearchHotel extends BaseClass {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomtype;
	@FindBy(id="room_nos")
	private WebElement numofrooms;
	@FindBy(id="datepick_in")
	private WebElement indate;
	@FindBy(id="datepick_out")
	private WebElement outdate;
	@FindBy(id="adult_room")
	private WebElement adultroom;
	@FindBy(id="child_room")
	private WebElement childroom;
	@FindBy(id="Submit")
	private WebElement submit;
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getNumofrooms() {
		return numofrooms;
	}
	public WebElement getIndate() {
		return indate;
	}
	public WebElement getOutdate() {
		return outdate;
	}
	public WebElement getAdultroom() {
		return adultroom;
	}
	public WebElement getChildroom() {
		return childroom;
	}
}
