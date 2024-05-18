package org.actionsss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task16 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Actions a= new Actions(driver);
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		WebElement hm = driver.findElement(By.xpath("//span[text()='Electronics']"));
//		a.moveToElement(hm).perform();
//		WebElement clen = driver.findElement(By.xpath("//a[text()='Remote Control Toys']"));
//		a.click(clen).perform();
		
		
		
	}

}
