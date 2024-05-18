package org.dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task08 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get(" http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement us = driver.findElement(By.id("username"));
		us.sendKeys("SrianthSriAs");
		WebElement pa = driver.findElement(By.id("password"));
		pa.sendKeys("K45EVD");
		WebElement lg = driver.findElement(By.id("login"));
		lg.click();
		
		WebElement lo = driver.findElement(By.id("location"));
		Select s= new Select(lo);
		s.selectByIndex(2);
		WebElement ho = driver.findElement(By.id("hotels"));
		Select s1= new Select(ho);
		s1.selectByIndex(2);
		
		WebElement ro = driver.findElement(By.id("room_type"));
		Select s2=new Select(ro);
		s2.selectByIndex(2);
		WebElement su = driver.findElement(By.id("Submit"));
		su.click();
		
		WebElement b = driver.findElement(By.id("radiobutton_0"));
		b.click();
		WebElement cc = driver.findElement(By.id("continue"));
		cc.click();
		WebElement fn = driver.findElement(By.id("first_name"));
		fn.sendKeys("Srinath");
		WebElement ln = driver.findElement(By.id("last_name"));
		ln.sendKeys("Alagesan");
		WebElement ad = driver.findElement(By.id("address"));
		ad.sendKeys("DPI");
		WebElement cr= driver.findElement(By.id("cc_num"));
		cr.sendKeys("6789876434567489");
		WebElement ty = driver.findElement(By.id("cc_type"));
		Select s3=new Select(ty);
		s3.selectByIndex(3);
		WebElement mo = driver.findElement(By.id("cc_exp_month"));
		Select s4=new Select(mo);
		s4.selectByIndex(5);
		WebElement yr = driver.findElement(By.id("cc_exp_year"));
		Select s5=new Select(yr);
		s5.selectByIndex(7);
		driver.findElement(By.id("cc_cvv")).sendKeys("143");
		driver.findElement(By.id("book_now")).click();
		WebElement dd= driver.findElement(By.id("order_no"));
		String at = dd.getAttribute("value");
		System.out.println(at);
		
		
	}

}
