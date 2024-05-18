package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.parent.BaseClass;

public class FbLogIn extends  BaseClass {
	public FbLogIn() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement textUser;
	@FindBy(id="pass")
	private WebElement textPass;
	@FindBy(name="login")
	private WebElement login;
	public WebElement getTextUser() {
		return textUser;
	}
	public WebElement getTextPass() {
		return textPass;
	}
	public WebElement getLogin() {
		return login;
	}
}
