package org.alterr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task06 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement l = driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]"));
		l.click();
		WebElement log = driver.findElement(By.id("Button2"));
		log.click();
		
		
	}

}
