package org.taskpom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.parent.BaseClass;

public class DemoQa extends BaseClass {
	public DemoQa() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="firstName")
	private WebElement fNmame;
	@FindBy(id="lastName")
	private WebElement lNmae;
	@FindBy(id="userEmail")
	private WebElement email;
	@FindBy(xpath="//label[text()='Male']")
	private WebElement gender;
	@FindBy(id="userNumber")
	private WebElement mbNo;
	@FindAll({@FindBy(id="subjectsContainer") , @FindBy(xpath= "//div[contains(@class,'subjects-auto-complete__value-contain')]")})
	private WebElement sub;
	@FindBy(xpath="//label[text()='Sports']")
	private WebElement hb1;
	@FindBy(xpath="//label[text()='Reading']")
	private WebElement hb2;
	@FindBy(xpath="//label[text()='Music']")
	private WebElement hb3;
	@FindBy(id="currentAddress")
	private WebElement address;
	public WebElement getfNmame() {
		return fNmame;
	}
	public WebElement getlNmae() {
		return lNmae;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getGender() {
		return gender;
	}
	public WebElement getMbNo() {
		return mbNo;
	}

	public WebElement getSub() {
		return sub;
	}
	public WebElement getHb1() {
		return hb1;
	}
	public WebElement getHb2() {
		return hb2;
	}
	public WebElement getHb3() {
		return hb3;
	}
	public WebElement getAddress() {
		return address;
	}
	
	

}
