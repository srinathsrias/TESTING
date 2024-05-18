package org.actionsss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task04 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions a= new Actions(driver);
		WebElement mb = driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
		a.moveToElement(mb).perform();
		WebElement mm = driver.findElement(By.xpath("//a[text()='Mi']"));
		a.click(mm).perform();
		
	}
}
