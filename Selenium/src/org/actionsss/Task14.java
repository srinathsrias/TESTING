package org.actionsss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task14 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Actions a= new Actions(driver);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement lg = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		a.moveToElement(lg).perform();
		WebElement nw = driver.findElement(By.xpath("(//a[text()='Start here.'])[1]"));
		a.click(nw).perform();
		
		WebElement fs = driver.findElement(By.id("ap_customer_name"));
		a.sendKeys(fs,"Srinath").perform();
		WebElement ph = driver.findElement(By.id("ap_phone_number"));
		a.sendKeys(ph,"6381486988").perform();
		WebElement mail = driver.findElement(By.id("ap_email"));
		a.sendKeys(mail,"srinathsrias@gmail.com").perform();
		WebElement pass = driver.findElement(By.id("ap_password"));
		a.sendKeys(pass,"Srinath@123").perform();
		
	}

}
