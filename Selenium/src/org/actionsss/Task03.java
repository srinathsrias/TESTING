package org.actionsss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task03 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Actions a= new Actions(driver);
		
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement close = driver.findElement(By.xpath("//span[@role='button']"));
		close.click();
		
		WebElement hm = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		a.moveToElement(hm).perform();
		WebElement bath = driver.findElement(By.xpath("//a[text()='Cleaning & Bath']"));
		a.moveToElement(bath).perform();
		WebElement clen = driver.findElement(By.xpath("//a[text()='Cleaning Supplies']"));
		a.click(clen).perform();
		
		
		
	}

}
