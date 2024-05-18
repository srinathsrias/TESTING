package org.alterr;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task04 {

	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		driver.get(
				" https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement c = driver.findElement(By.xpath("(//div[@class='inputfield ibvt loginData'])[2]"));
		c.click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
	}
}
