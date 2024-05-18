package org.dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task10 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get(" http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement us = driver.findElement(By.id("username"));
		us.sendKeys("SrianthSriAs");
		WebElement pa = driver.findElement(By.id("password"));
		pa.sendKeys("K45EVD");
		WebElement lg = driver.findElement(By.id("login"));
		lg.click();
		WebElement lo = driver.findElement(By.id("location"));
		Select s= new Select(lo);
		List<WebElement> op = s.getOptions();
		for(WebElement x:op) {
			System.out.println(x.getText());
			
		}
	}

}
