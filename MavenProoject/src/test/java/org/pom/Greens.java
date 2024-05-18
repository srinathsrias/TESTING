package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.parent.BaseClass;

public class Greens extends BaseClass {
	
	public Greens() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()=' Meta © 2023']")
	private WebElement down;

	public WebElement getDown() {
		return down;
	}
}
