package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class Demo extends BaseClass {
	public Demo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	private WebElement username;
	@FindBy(name="password")
	private WebElement password;
	@FindBy(xpath="//button[text()='Login']")
	private WebElement Login;
	@FindBy(xpath="//span[text()='Order']")
	private WebElement Order;
	@FindBy(linkText="Orders")
	private WebElement Orders;
	@FindBy(xpath="//button[contains(text(),'Add')]")
	private WebElement BulkOrder;
	@FindBy(xpath="//a[contains(text(),'Do')]//following::div//child::input")
	private WebElement upload;
	@FindBy(xpath="//button[text()='Import']")
	private WebElement Import;
	@FindBy(xpath="//button[contains(text(),'Validate')]")
	private WebElement Validate;
	@FindBy(xpath="//button[text()='Previous']")
	private WebElement scroll;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return Login;
	}
	public WebElement getOrder() {
		return Order;
	}
	public WebElement getOrders() {
		return Orders;
	}
	public WebElement getBulkOrder() {
		return BulkOrder;
	}
	public WebElement getUpload() {
		return upload;
	}
	public WebElement getImport() {
		return Import;
	}
	public WebElement getValidate() {
		return Validate;
	}
	public WebElement getScroll() {
		return scroll;
	}

}
