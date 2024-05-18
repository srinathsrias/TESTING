package org.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data {
	public static void main(String[] args) throws IOException {
		// 1.excel location
		File f = new File("C:\\Users\\SRI\\eclipse-workspace\\MavenProoject\\src\\test\\resources\\xxx.xlsx");

		// 2.FileInputStream - to store location of file
		FileInputStream fi = new FileInputStream(f);

		// 3.WorkBook
		Workbook wb = new XSSFWorkbook(fi);

		// 4.getSheet
		Sheet s = wb.getSheet("Sheet1");
		// 5.getRow
		Row row = s.getRow(3);
		// 5.getcell
		Cell cell = row.getCell(3);

		// 6.getPhysicalNumberOfRows - to get all number of rows
		int pr = s.getPhysicalNumberOfRows();
		System.out.println(pr);
		// 7.getPhysicalNumberOfCells
		int pc = row.getPhysicalNumberOfCells();
		System.out.println(pc);
		
		//allcellcount
		int count = 0;
		for(int i=0 ;i<pr;i++) {
			Row row2 = s.getRow(i);
			for(int j=0;j<row2.getPhysicalNumberOfCells();j++) {
				count++;
			}
		}
		System.out.println(count);

//		System.out.println("==========Cells Data=========");
//		for (int i = 0; i < pc; i++) {
//			Cell cell2 = row.getCell(i);
//			System.out.println(cell2);
//		}

//		System.out.println("======Rows and Cells======");
//		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
//			Row row2 = s.getRow(i);
//			for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
//
//				Cell cell2 = row2.getCell(j);
//				System.out.println(cell2);
//			}
//		}
		
		
		//celltype 0,1
		System.out.println("===celltype===");
		int ct = cell.getCellType();
		System.out.println(ct);
		
		//string
		if(ct==1) {
			String sc = cell.getStringCellValue();
			System.out.println(sc);
		}
		
		//dateformate
		else if(DateUtil.isCellDateFormatted(cell)) {
			Date d = cell.getDateCellValue();
			SimpleDateFormat sd=new SimpleDateFormat("dd-MM-yyyy");
			String format = sd.format(d);
			System.out.println(format);
		}
		//numericalcell value
		
		else {
			double nv = cell.getNumericCellValue();
			long l=(long)nv;
			String value = String.valueOf(l);
			System.out.println(value);
		}

	}

}
