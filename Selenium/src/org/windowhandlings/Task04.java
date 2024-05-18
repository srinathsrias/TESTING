package org.windowhandlings;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task04 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get(" http://www.greenstechnologys.com/python-training.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement scroll = driver.findElement(By.xpath("//button[text()='CONTACT US']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
		
		
		WebElement se = driver.findElement(By.id("Python-Solutions-Architect-Training"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()",se);
		
		WebElement te = driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']"));
		js.executeScript("arguments[0].click()",te);
		
		WebElement wi = driver.findElement(By.xpath("//button[text()='Windows Handling']"));
		js.executeScript("arguments[0].click()",wi);
	}

}
