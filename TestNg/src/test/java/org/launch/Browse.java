package org.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browse {
	static WebDriver driver;
	@Test
	private void launch() {
		WebDriverManager.firefoxdriver().setup();
//		driver =new FirefoxDriver();
//		driver.get("https://mvnrepository.com/");
		WebDriverManager.operadriver().setup();
		driver=new OperaDriver();
		driver.get("https://mvnrepository.com/");
		
	}
	

}
