package org.robott;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task03 {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		Actions a= new Actions(driver);
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		WebElement iq = driver.findElement(By.xpath("//div[contains(@class,'card-header1 d')]"));
		a.click(iq).perform();
		
		WebElement cts = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
		a.contextClick(cts).perform();
		
		Robot r= new Robot();
		
		for(int i=0;i<2;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
