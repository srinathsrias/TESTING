package org.alterr;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task010203 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// simple alter task 01
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement al = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		al.click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();

		// confirm alter task 02
		WebElement al1 = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		al1.click();
		WebElement al2 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		al2.click();
		System.out.println(a.getText());
		a.accept();

		// prompt task03
		WebElement al3 = driver.findElement(By.xpath("//a[@href='#Textbox']"));
		al3.click();
		WebElement al4 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		al4.click();
		System.out.println(a.getText());
		a.sendKeys("Srinath");
		a.accept();

	}
}
