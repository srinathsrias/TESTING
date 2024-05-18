package org.webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		List<WebElement> tb = driver.findElements(By.tagName("table"));
		System.out.println(tb.size());
		WebElement datas = driver.findElement(By.xpath("//table[@border='l']"));
		List<WebElement> tr = datas.findElements(By.tagName("tr"));
		System.out.println(tr.get(0).getText());
		System.out.println(tr.size());
		for (int i=0;i<tr.size();i++) {
			WebElement txt = tr.get(i);
			System.out.println(txt.getText());
		
		}
	}
}
