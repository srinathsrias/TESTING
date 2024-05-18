package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.test.parent.BaseClass;

public class Student extends BaseClass{
	public static void main(String[] args) throws IOException {
//		File f=new File("C:\\Users\\SRI\\eclipse-workspace\\MavenProoject\\src\\test\\resources\\StdDetals.xlsx");
//		Workbook w= new XSSFWorkbook();
//		Sheet s = w.createSheet("Details");
//		Row row = s.createRow(0);
//		Cell cell = row.createCell(0);
//		cell.setCellValue("Names");
//		Cell cell2 = row.createCell(1);
//		cell2.setCellValue("Courses");
//		FileOutputStream fo=new FileOutputStream(f);
//		w.write(fo);
//		
//		FileInputStream fi =new FileInputStream(f);
//		Workbook w1=new XSSFWorkbook(fi);
//		Sheet sheet = w1.getSheet("Details");
//		Row r = sheet.createRow(1);
//		Cell c = r.createCell(0);
//		c.setCellValue("Srinath");
//		Cell c1 = r.createCell(1);
//		c1.setCellValue(" Java");
//		Row row2 = sheet.createRow(2);
//		Cell cell3 = row2.createCell(0);
//		cell3.setCellValue("Dharani");
//		Cell cell4 = row2.createCell(1);
//		cell4.setCellValue("Dharani");
//		FileOutputStream fo1=new FileOutputStream(f);
//		w1.write(fo1);
		
		createExcel("StdDetails", "Details");
		excelSetRow("StdDetails", "Details", 0, 0, "Students");
		excelGetRow("StdDetails", "Details", 0, 1, "Courses");
		excelSetRow("StdDetails", "Details", 1, 0, "Srinath");
		excelGetRow("StdDetails", "Details", 1, 1, "Java");
		excelSetRow("StdDetails", "Details", 2, 0, "Pathma");
		excelGetRow("StdDetails", "Details", 2, 1, "Call Center");
		excelSetRow("StdDetails", "Details", 3, 0, "Dharani");
		excelGetRow("StdDetails", "Details", 3, 1, "CETAS");
		excelSetRow("StdDetails", "Details", 4, 0, "Shandhini");
		excelGetRow("StdDetails", "Details", 4, 1, "Graphic Designer");
		excelSetRow("StdDetails", "Details", 5, 0, "Tamil");
		excelGetRow("StdDetails", "Details", 5, 1, "Graphic Designer");
		excelSetRow("StdDetails", "Details", 6, 0, "Gokul");
		excelGetRow("StdDetails", "Details", 6, 1, "Post");
		excelSetRow("StdDetails", "Details", 7, 0, "Praveen");
		excelGetRow("StdDetails", "Details", 7, 1, "Amazon");
		excelSetRow("StdDetails", "Details", 8, 0, "Aravind");
		excelGetRow("StdDetails", "Details", 8, 1, "Python");
		excelSetRow("StdDetails", "Details", 9, 0, "Alagesan");
		excelGetRow("StdDetails", "Details", 9, 1, "Operator");
		excelSetRow("StdDetails", "Details", 10, 0, "Dhanaselvi");
		excelGetRow("StdDetails", "Details", 10, 1, "HouseWife");
		excelSetRow("StdDetails", "Details", 11, 0, "Sakthi");
		excelGetRow("StdDetails", "Details", 11, 1, "Mechanic");
		excelgetPhysicalRowsCells("StdDetails", "Details", 0, 0);
		File f= new File("C:\\Users\\SRI\\eclipse-workspace\\MavenProoject\\src\\test\\resources\\StdDetails.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Details");
		for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
			Row row = s.getRow(i);
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cell = row.getCell(j);
				System.out.print(cell+"  ");
			}
			System.out.println();
		}
	}

}
