package org.task01;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task_01 {
	static WebDriver driver;
	@Parameters("browserlaunch")
	@BeforeMethod
	private WebDriver browseLaunch(String browserName) {
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		}
		return driver;
	}
	@Parameters({"url","size","height"})
	@Test
	private void urlLaunch(String url,int size,int height) {
		driver.get(url);
		Dimension d= new Dimension(size,height);
		driver.manage().window().setSize(d);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@Parameters({"folder","File"})
	@AfterMethod
	private void screenShot(String foldername,String File) throws IOException {
		TakesScreenshot s=(TakesScreenshot)driver;
		File src = s.getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		String time = d.toString().replace(":", "_").replace(" ","_");
		File des=new File(System.getProperty("user.dir")+"//src//test//resources//ScreenShots//"+foldername+"//"+File+" "+time+".png");
		FileUtils.copyFile(src, des);
		driver.quit();
	}
}
  