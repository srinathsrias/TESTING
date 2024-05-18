package org.dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task06 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ct = driver.findElement(By.xpath("//select[@name='country']"));
		Select s= new Select(ct);
		List<WebElement> op = s.getOptions();
		for(WebElement x:op) {
			System.out.println(x.getText());
		}
	}
}
