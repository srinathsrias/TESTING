package org.actionsss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task07 {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		Actions a= new Actions(driver);
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement cc = driver.findElement(By.xpath("//div[text()='Courses ']"));
		a.moveToElement(cc).perform();
		
		WebElement cl = driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
		a.moveToElement(cl).perform();
		
		WebElement click = driver.findElement(By.xpath("//span[text()='SQL Certification Training']"));
		a.click(click).perform();
		
	}

}
