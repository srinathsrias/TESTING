package org.actionsss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoGuru {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get(" http://demo.guru99.com/test/drag_drop.html ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement bk = driver.findElement(By.id("credit2"));
		WebElement bk1 = driver.findElement(By.id("bank"));
		Actions a=new Actions(driver);
		a.dragAndDrop(bk,bk1).perform();
		
		WebElement am = driver.findElement(By.id("fourth"));
		WebElement am1 = driver.findElement(By.id("amt7"));
		a.clickAndHold(am).moveToElement(am1).release().perform();
		
		WebElement sl = driver.findElement(By.id("credit1"));
		WebElement sl1 = driver.findElement(By.id("loan"));
		a.dragAndDrop(sl, sl1).perform();
		
		WebElement sl2 = driver.findElement(By.id("amt8"));
		a.dragAndDrop(am, sl2).perform();
		
		
	}

}
