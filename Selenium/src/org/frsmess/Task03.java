package org.frsmess;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task03 {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame("frame1");
		WebElement use = driver.findElement(By.xpath("//b[@id='topic']//following::input"));
		use.sendKeys("sri");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		WebElement cb = driver.findElement(By.id("animals"));
		Select s=new Select(cb);
		s.selectByIndex(3);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame3");
		WebElement cbb = driver.findElement(By.id("a"));
		cbb.click();
		
		driver.switchTo().parentFrame();
		use.clear();
		use.sendKeys("path");
	}

}
