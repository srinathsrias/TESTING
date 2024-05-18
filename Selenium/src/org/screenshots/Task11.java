package org.screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task11 {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement co = driver.findElement(By.xpath("//span[@role='button']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", co);
		WebElement se = driver.findElement(By.name("q"));
		se.sendKeys("i phone 14");
		WebElement sr = driver.findElement(By.xpath("//button[@type='submit']"));
		sr.click();
		Thread.sleep(5000);
		Actions a= new Actions(driver);
		WebElement wo = driver.findElement(By.xpath("//span[text()='Women']"));
		a.moveToElement(wo).perform();
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\SRI\\eclipse-workspace\\Selenium\\Screenshots\\sample6.png");
		FileUtils.copyFile(src, des);
		
	}

}
