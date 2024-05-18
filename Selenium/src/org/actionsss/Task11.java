package org.actionsss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task11 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Actions a= new Actions(driver);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement cx = driver.findElement(By.xpath("//span[text()='Mobile & Accessories']"));
		a.moveToElement(cx).perform();
		WebElement po = driver.findElement(By.xpath("//span[text()='Flip Covers']"));
		a.click(po).perform();
		
	}

}
