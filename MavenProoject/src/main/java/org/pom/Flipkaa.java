package org.pom;

import java.util.List;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.test.parent.BaseClass;

public class Flipkaa extends BaseClass{
	
	public Flipkaa() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="q")
	private WebElement search;
	@FindBy(className="_2iLD__")
	private WebElement submit;
	@FindBy(className="_4rR01T")
	private List<WebElement> product;

	@FindBy(xpath="//div[contains(@class,'_30jeq3 _1')]")
	private List<WebElement> price;
	public List<WebElement> getProduct() {
		return product;
	}
	public List<WebElement> getPrice() {
		return price;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getSearch() {
		return search;
	}
	
	
}
