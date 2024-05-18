package org.javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement down = driver.findElement(By.xpath("//div[contains(text(),'olsQA.com | All rights reserved')]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		Thread.sleep(3000);
		
		WebElement up = driver.findElement(By.xpath("//a[text()='Latest Articles']"));
		js.executeScript("arguments[0].scrollIntoView(false)", up);
	}

}
