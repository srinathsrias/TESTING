package org.webtable;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebTablee {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> table = driver.findElements(By.tagName("table"));
		
		//table count
		System.out.println("table count : "+table.size());
		
		WebElement table1 = driver.findElement(By.id("customers"));
		System.out.println("=================text from table==================\n"+table1.getText());
		
		
		//to get all rows using tr tag
		
		List<WebElement> eachrow = table1.findElements(By.tagName("tr"));
		System.out.println("==================To get perticular row====================");
		WebElement row = eachrow.get(1);
		System.out.println(row.getText());
		
		System.out.println("=================To print all rows===============");
		for(int i=0;i<eachrow.size();i++) {
			WebElement row1 = eachrow.get(i);
			System.out.println(row1.getText());	
		}
		
		System.out.println("========Print Headings==table-->tr---->th=====");
		
		for(int i=0;i<eachrow.size();i++) {
			WebElement row2 = eachrow.get(i);
			List<WebElement> head = row2.findElements(By.tagName("th"));
			for(int j=0;j<head.size();j++) {
				WebElement thead = head.get(j);
				System.out.println(thead.getText());
			}
		}
		
		System.out.println("=======Print headngs======table---->th");
		List<WebElement> heads = table1.findElements(By.tagName("th"));
		for (int i=0;i<heads.size();i++) {
			WebElement text = heads.get(i);
			System.out.println(text.getText());
		}
		
		System.out.println("=======to print datas====table--->tr--->td");
		for (int i=0;i<eachrow.size();i++) {
			WebElement data = eachrow.get(i);
			List<WebElement> tdata = data.findElements(By.tagName("td"));
			for(int j=0;j<tdata.size();j++) {
				WebElement txt = tdata.get(j);
				System.out.println(txt.getText());
			}
		}
		System.out.println("=======to print datas====table--->--->td");
		List<WebElement> thead = table1.findElements(By.tagName("td"));
		for(int i=0;i<thead.size();i++) {
			WebElement txt = thead.get(i);
			System.out.println(txt.getText());
		}
		
		System.out.println("=======to print perticular datas====table--->tr--->td");
		
		for(int i=0;i<eachrow.size();i++) {
			WebElement roww = eachrow.get(i);
			List<WebElement> tdata = roww.findElements(By.tagName("td"));
			for(int j=0 ;j<tdata.size();j++) {
				WebElement data = tdata.get(j);
				String text = data.getText();
				if(text.equals("Austria")) {
					System.out.println(text);
					System.out.println("print entier row values \n"+row.getText());
					System.out.println("print row and column number \n"+i+" "+j);
				}
			}
		}
		System.out.println("=========================LastRow====================");
		WebElement lastrow = eachrow.get(eachrow.size()-1);
		System.out.println(lastrow.getText());
		List<WebElement> td = lastrow.findElements(By.tagName("td"));
		System.out.println("==========To print a last row datas=========");
		for(WebElement d:td) {
			System.out.println(d.getText());
		}	
	}
}