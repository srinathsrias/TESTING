package org.windowhandlings;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task05 {

	public static void main(String[] args) throws AWTException, InterruptedException   {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement cr = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a= new Actions(driver);
		a.moveToElement(cr).perform();
		
		WebElement py = driver.findElement(By.xpath("//span[text()='Python']"));
		py.click();
		
		WebElement ccr = driver.findElement(By.xpath("//button[text()='Explore Curriculum']"));
		
		WebElement ccr1 = driver.findElement(By.xpath("//h3[contains(text(),'Get')]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ccr1);
		
		a.contextClick(ccr).perform();
		Thread.sleep(3000);
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
