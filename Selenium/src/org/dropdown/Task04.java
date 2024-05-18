package org.dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task04 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement cr = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		cr.click();
		
		WebElement year = driver.findElement(By.id("year"));	
		Select s=new Select(year);
		List<WebElement> op = s.getOptions();
		for(WebElement x:op) {
			System.out.println(x.getText());
		}
	}
}
