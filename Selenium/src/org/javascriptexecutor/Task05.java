package org.javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task05 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement use = driver.findElement(By.id("username"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','SrianthSriAs')", use);
		
		WebElement pa = driver.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','gedjh')", pa);
		
		WebElement lg = driver.findElement(By.id("login"));
		js.executeScript("arguments[0].click()", lg);
	}

}
