package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {
	public static void main(String[] args) throws IOException {
		File f=  new File("C:\\Users\\SRI\\eclipse-workspace\\MavenProoject\\src\\test\\resources\\sample.xlsx");
		
//		Workbook w= new XSSFWorkbook();
//		
//		//create sheet
//		Sheet s = w.createSheet("Sample");
//		
//		//createrow
//		Row r = s.createRow(0);
//		
//		//createcell
//		Cell c = r.createCell(1);
//		
//		//setcellvalue
//		c.setCellValue("Dharani");
//		
//		//to create location of file
//		FileOutputStream fo=new FileOutputStream(f);
//		
//		//write to create it from workboook
//		w.write(fo);
		
		//Existing file
//		FileInputStream fi=new FileInputStream(f);
//		Workbook wb=new XSSFWorkbook(fi);
//		Sheet s1 = wb.getSheet("Sample");
//		Row r2 = s1.createRow(1);
//		Cell c2 = r2.createCell(0);
//		c2.setCellValue("Pathma");
//		FileOutputStream fo=new FileOutputStream(f);
//		wb.write(fo);
		FileInputStream fi=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fi);
		Sheet s1 = wb.getSheet("Sample");
		Row r2 = s1.getRow(0);
		Cell c2 = r2.getCell(0);
		
		String sc = c2.getStringCellValue();
		if(sc.equals("Sri")) {
			Cell c = r2.createCell(3);
			c.setCellValue("Tamil");
			
		}
		FileOutputStream fo=new FileOutputStream(f);
		wb.write(fo);
	
	
	
	
	}

}
