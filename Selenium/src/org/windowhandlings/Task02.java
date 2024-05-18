package org.windowhandlings;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/ ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement src = driver.findElement(By.name("keyword"));
		src.sendKeys("iphones 7",Keys.ENTER);
		
		WebElement po = driver.findElement(By.xpath("//p[contains(text(),'Spectacular Ace - Black Silicon Soft cases ')]"));
		po.click();
		
		Thread.sleep(3000);
		Set<String> allid = driver.getWindowHandles();
		List<String> l = new LinkedList<String>();
		l.addAll(allid);
		driver.switchTo().window(l.get(1));
		WebElement pr = driver.findElement(By.className("pdp-final-price"));
		String text = pr.getText();
		System.out.println(text);
	}

}
