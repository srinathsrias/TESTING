package org.dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement st = driver.findElement(By.id("state"));
		st.click();
//		List<WebElement> op =st.findElements(By.tagName("div"));
//		for(int i=0;i<op.size();i+=2) {
//			System.out.println(op.get(i).getAttribute("innerText"));
//			 
//		}
	}

}
