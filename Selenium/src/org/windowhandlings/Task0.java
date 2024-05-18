package org.windowhandlings;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task0 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement btn = driver.findElement(By.className("_30XB9F"));
		btn.click();
		WebElement ser = driver.findElement(By.name("q"));
		ser.sendKeys("iphone 14",Keys.ENTER);
		WebElement ss = driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']"));
		ss.click();
		
		
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
		
		List<String> li=new ArrayList<>();
		li.addAll(allId);
		driver.switchTo().window(li.get(1));
		Thread.sleep(2000);
		WebElement ad = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		ad.click();
		WebElement hl = driver.findElement(By.xpath("//a[text()='Help Center']"));
		hl.click();
		
		
		
		Set<String> allId1 = driver.getWindowHandles();
		System.out.println(allId1);
		
		List<String> li1=new ArrayList<>();
		li1.addAll(allId1);
		
		driver.switchTo().window(li1.get(2));
		
		Thread.sleep(2000);
		WebElement pos = driver.findElement(By.xpath("//span[text()='Postal Address']"));
		pos.click();
		
		driver.switchTo().window(li1.get(0));
	
	
	}

}
