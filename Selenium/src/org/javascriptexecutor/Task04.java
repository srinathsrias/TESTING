package org.javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task04 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement use = driver.findElement(By.id("email"));
		WebElement pa = driver.findElement(By.id("pass"));
		WebElement ck = driver.findElement(By.name("login"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','shvdsdgh')", use);
		js.executeScript("arguments[0].setAttribute('value','udvgdf')", pa);
		js.executeScript("arguments[0].click()", ck);
	}

}
