package org.flip;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pom.Flipkaa;
import org.test.parent.BaseClass;

public class Flipkart extends BaseClass {
	@BeforeClass
	public static void Before() {
		browserLaunch("chrome");
		time(20);

	}

	@Test
	public void test1() {
		urlLaunch("https://www.flipkart.com/");
		Flipkaa f = new Flipkaa();
		sendKeys(f.getSearch(), "iphone 14");
		click(f.getSubmit());

		System.out.println("============product=========");

		List<WebElement> pr = f.getProduct();
		for (WebElement x : pr) {
			System.out.println(x.getText());
		}

		System.out.println("===============prizes===========");
		List<WebElement> prize = f.getPrice();

	

		for (WebElement x : prize) {
			System.out.println(x.getText());
		}

		System.out.println("==========Product with prices===========");
		for (int i = 0; i < pr.size(); i++) {
			System.out.println(pr.get(i).getText() + "---->" + prize.get(i).getText());
		}
		
		StringBuilder s = new StringBuilder();
		for (WebElement x : prize) {
			s.append(x.getText()).append("\n");
		}
		
		String txt = s.toString();
		
		if (txt.contains("₹")) {
			txt = txt.replace("₹", "");
		}
		if (txt.contains(",")) {
			txt = txt.replace(",", "");
		}
		List<Integer> prices = new LinkedList<>();
		for (String s1 : txt.split("\n")) {
			prices.add(Integer.parseInt(s1));
		}
		Integer max = prices.get(0);
		Integer min = prices.get(0);
		for(int i=0;i<prices.size();i++) {
			Integer cn = prices.get(i);
			if(cn<min) {
				min=cn;
			}
			if(cn>max) {
				max=cn;
			}
		}
		System.out.println("List of numbers :"+prices);
		System.out.println("Maximum number :"+max);
		System.out.println("Minimum number :"+min);
//		Integer max = Collections.max(prices);
//		Integer min = Collections.min(prices);
//		System.out.println("Maximum price " + max);
//		System.out.println("Minimum price " + min);
	}

}
