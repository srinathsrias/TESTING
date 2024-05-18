package org.windowhandlings;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.*;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task01 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver= new  ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement sr = driver.findElement(By.id("twotabsearchtextbox"));
		sr.sendKeys("iphones X",Keys.ENTER);
		
		Thread.sleep(3000);
		WebElement pr = driver.findElement(By.xpath("//span[text()='iPhone X, Fully Unlocked 5.8\", 256 GB - Space Gray']"));
		
		Actions a= new Actions(driver);
		a.contextClick(pr).perform();
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(5000);
		String parentTd = driver.getWindowHandle();
		System.out.println(parentTd);
		Set<String> allid = driver.getWindowHandles();
		System.out.println(allid);
		
		List<String> l= new LinkedList<>();
		l.addAll(allid);
		
		driver.switchTo().window(l.get(1));
		
		Thread.sleep(5000);
		
		WebElement cost = driver.findElement(By.id("apex_offerDisplay_desktop"));
		String text = cost.getText();
		System.out.println(text);
		
	}
}
