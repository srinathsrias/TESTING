package org.dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task13 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement fr = driver.findElement(By.id("fruits"));
		Select s= new Select(fr);
		List<WebElement> op = s.getOptions();
		for(WebElement x:op) {
			String text = x.getText();
			s.selectByVisibleText(text);
		}
		WebElement fs = s.getFirstSelectedOption();
		String text = fs.getText();
		System.out.println(text);
		
	}

}
