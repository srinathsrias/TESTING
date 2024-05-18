package org.actionsss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task10 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Actions a= new Actions(driver);
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement cc = driver.findElement(By.xpath("//a[text()='All Departments']"));
		a.moveToElement(cc).perform();
		WebElement clk = driver.findElement(By.xpath("//a[text()='Paint']"));
		a.moveToElement(clk).perform();
		WebElement ccc = driver.findElement(By.xpath("//a[text()='Interior Paint']"));
		a.moveToElement(ccc).perform();
		WebElement ck = driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		a.click(ck).perform();
		
		
		
	}

}
