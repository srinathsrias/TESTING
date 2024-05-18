package org.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



//parent class,utility class,functionality class,super class,base class
public class BaseClass {

	public static WebDriver driver;

	// public static WebDriver launchBrowser() {
	// WebDriverManager.chromedriver().setup();
	// driver=new ChromeDriver();
	// return driver;
	// }
	// public static WebDriver launchBrowser(String browserName) {
	// if (browserName.equalsIgnoreCase("chrome")) {
	// WebDriverManager.chromedriver().setup();
	// driver = new ChromeDriver();
	// } else if (browserName.equalsIgnoreCase("edge")) {
	// WebDriverManager.edgedriver().setup();
	// driver = new EdgeDriver();
	// } else if (browserName.equalsIgnoreCase("firefox")) {
	// WebDriverManager.firefoxdriver().setup();
	// driver = new FirefoxDriver();
	// }
	// return driver;
	//
	// }

	public static WebDriver browserLaunch(String browserName) {

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

//url launch
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	

//implicitlywait
	public static void time(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	
//getCurrentUrl
	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
//getTitle
	public static String getTitle() {
		return driver.getTitle();
	}
	
//sendkeys
	public static void sendKeys(WebElement e,String name) {
		e.sendKeys(name);
	}

//click
	public static void click(WebElement e) {
		e.click();
	}
//clear
	public static void clear(WebElement e) {
		e.clear();

	}
	
//getAttribute
	public static String getAttribute(WebElement e,String data) {
		String attribute = e.getAttribute(data);
		return attribute; 
	}
	
//getText
	public static String getText(WebElement e) {
		String text = e.getText();
		return text;
	}
	
//quit
	public static void quit() {
		driver.quit();

	}
	
//close
	public static void close() {
		driver.close();
	}
	
//Actions
// 1.moveToElement
	public static  void moveToElement(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
	}
	
//2. drag and drop
	public static void dragAndDrop(WebElement src,WebElement des) {
		Actions a= new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}
	
// 3.ContextClick
	public static void contextClick(WebElement e) {
		Actions a= new Actions(driver);
		a.contextClick(e).perform();
	}
// 4.doubleClick
	public static void doubleClick(WebElement e) {
		Actions a=new Actions(driver);
		a.doubleClick(e).perform();
	}

//Select
// 1.selectByIndex
	public static void selectByIndex(WebElement e,int string) {
		Select s= new Select(e);
		s.selectByIndex(string);
	}
	
// 2.selectByValue
	public static void selectByValue(WebElement e,String str) {
		Select s= new Select(e);
		s.selectByValue(str);
	}
	
// 3.selectByVisibleText
	public static void selectByVisibleText(WebElement e,String str) {
		Select s=new Select(e);
		s.selectByVisibleText(str);
	}
	
// 4.getOptions
	public static void getOptions(WebElement e) {
		Select s= new Select(e);
		List<WebElement> options = s.getOptions();
		for (WebElement x:options) {
			System.out.println(x.getText());
		}
	}
	
// 5.getallSelectedOptions
	public static void getAllSelectedOptions(WebElement e) {
		Select s= new Select(e);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement x:allSelectedOptions) {
			System.out.println(x.getText());
		}
	}

// 6.getFirestSelectedOption
	public static WebElement getFirstSelectedOption(WebElement e) {
		Select s= new Select(e);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		return firstSelectedOption;
	}
	
// 7.isMultiple
	public static boolean isMultiple(WebElement e) {
		Select s =new Select(e);
		boolean multiple = s.isMultiple();
		return multiple;
	}
	
// 8. deselectByIndex
	public static void deselectByIndex(WebElement e,int index) {
		Select s= new Select(e);
		s.deselectByIndex(index);
	}
	
// 9.deselectByValue
	public static void deselectByValue(WebElement e,String str) {
		Select s=new Select(e);
		s.deselectByValue(str);
	}
	
// 10.deselectByVisibleText
	public static void deselectByVisibleText(WebElement e,String str) {
		Select s= new Select(e);
		s.deselectByVisibleText(str);
	}
	
// 11.deselectall
	public static void deselectAll(WebElement e) {
		Select s=new Select(e);
		s.deselectAll();
	}
	
//Robot
	public static void Robott(int key,int key1) throws AWTException {
		Robot r=new Robot();
		r.keyPress(key);
		r.keyRelease(key1);
	}
//Alert
	
	public static Alert alert() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}

// 1.accept
	public static void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
// 2.dismiss
	public static void dismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

// 3.alertSendKeys
	public static void alertSendKeys(String name) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(name);
	}
	
// 4.alertGetText
	public static String alertGetText() {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}
	
//ScreenShots
//TakeScreenShot
	public static void takeScreenShot(String foldername,String filename) throws IOException {
		TakesScreenshot s=(TakesScreenshot)driver;
		File src = s.getScreenshotAs(OutputType.FILE);
		File des=new File(System.getProperty("user.dir")+"//src//test//resources//ScreenShots//"+foldername+"//"+filename+".png");
		FileUtils.copyFile(src, des);
	}
	
//javascriptexecutor
// 1.jsSendKeys
	public static void jsSendKeys(WebElement e,String value) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+value+"')", e);
	}
// 2.scrollUpAndDown
	public static void scrollUpAndDown(WebElement e,boolean str) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView("+str+")", e);
	}
//jsGetAttribute
	public static void jsGetAttribute(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("return arguments[0].getAttribute('value'", e);

	}

	
//Navigate
// 1.navigateTo
	public static void navigateTo(String url) {
		driver.navigate().to(url);
		
	}

// 2.navigateBack
	public static void navigateBack() {
		driver.navigate().back();
	}
	
// 3.navigateForword
	public static void navigateForword() {
		driver.navigate().forward();
	}
	
// 4.navigateRefresh
	public static void navigateReferesh() {
		driver.navigate().refresh();
	}
	
// 5.isDisplayed
	public static void isDisplayed(WebElement e) {
		boolean displayed = e.isDisplayed();
		System.out.println(displayed);
	}
	
// 6.isEnabled
	public static void isEnabled(WebElement e) {
		boolean enabled = e.isEnabled();
		System.out.println(enabled);
	}
	
// 7.isSelected
	public static void isSelected(WebElement e) {
		boolean selected = e.isSelected();
		System.out.println(selected);
	}

//Frame
	public static int frameInt(int arg) {
		driver.switchTo().frame(arg);
		return arg;
	}
	public static String frameStr(String str) {
		driver.switchTo().frame(str);
		return str;
	}
//defaultContent
	public static void defaultContent() {
		driver.switchTo().defaultContent();
	}
	
//windowshandling
	
	public static String windowsHandle(String str) {
		driver.switchTo().window(str);
		return str;
	}
	
//getWindowHandle
	public static void getWindowHandle() {
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
	}
	
//getWindowHandles
	public static void getWindowHandles(int index) {
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
		List<String> li=new ArrayList<>();
		li.addAll(allId);
		driver.switchTo().window(li.get(index));

	}
	
	
//excel datadriven
	public static String getExcelData(String excelname,String Sheet,int rowno,int cellno) throws IOException {
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\"+excelname+".xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet s = wb.getSheet(Sheet);
		Row row = s.getRow(rowno);
		Cell cell = row.getCell(cellno);
		int cellType = cell.getCellType();
		String value;
		if(cellType==1) {
			value= cell.getStringCellValue();
		}
		else if(DateUtil.isCellDateFormatted(cell)) {
			Date d = cell.getDateCellValue();
			SimpleDateFormat sd=new SimpleDateFormat("dd-MM-YYYY");
			value = sd.format(d);
		}
		//numericalcell value
		
		else {
			double nv = cell.getNumericCellValue();
			long l=(long)nv;
			value = String.valueOf(l);
		}
		return value;

	}
	public static void createExcel(String Fname,String Sname) throws IOException {
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\"+Fname+".xlsx");
		Workbook w= new XSSFWorkbook();
		Sheet s = w.createSheet(Sname);
		FileOutputStream fo=new FileOutputStream(f);
		w.write(fo);
	}
	
	public static void excelSetRow(String Fname,String Svalue,int Rvalue ,int Cvalue,String setValue) throws IOException {
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\"+Fname+".xlsx");
		FileInputStream fi =new FileInputStream(f);
		Workbook w1=new XSSFWorkbook(fi);
		Sheet sheet = w1.getSheet(Svalue);
		Row r = sheet.createRow(Rvalue);
		Cell c = r.createCell(Cvalue);
		c.setCellValue(setValue);
		FileOutputStream fo=new FileOutputStream(f);
		w1.write(fo);
	}
	public static void excelGetRow(String Fname,String Svalue,int Rvalue ,int Cvalue,String setValue) throws IOException {
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\"+Fname+".xlsx");
		FileInputStream fi =new FileInputStream(f);
		Workbook w1=new XSSFWorkbook(fi);
		Sheet sheet = w1.getSheet(Svalue);
		Row r = sheet.getRow(Rvalue);
		Cell c = r.createCell(Cvalue);
		c.setCellValue(setValue);
		FileOutputStream fo=new FileOutputStream(f);
		w1.write(fo);
	}
	
	public static void excelgetPhysicalRowsCells(String Fname,String Sname,int Rvalue,int Cvalue) throws IOException {
		File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\"+Fname+".xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet s = wb.getSheet(Sname);
		Row row = s.getRow(Rvalue);
		int pr = s.getPhysicalNumberOfRows();
		System.out.println("=====total number of rows=====");
		System.out.println(pr);
		int pc = row.getPhysicalNumberOfCells();
		System.out.println("=====one row cell count====");
		System.out.println(pc);
		int count = 0;
		for(int i=0 ;i<pr;i++) {
			Row row2 = s.getRow(i);
			for(int j=0;j<row2.getPhysicalNumberOfCells();j++) {
				count++;
			}
		}
		System.out.println("=====total number of cells=======");
		System.out.println(count);
	}
	
//explecitwait
	public static void webwait(int sec,String value) {
		WebDriverWait w=new WebDriverWait(driver,sec );
		w.until(ExpectedConditions.urlContains(value));
	}
	
	
	
	
	
	
	
	
}
