package org.adactin;

import java.io.IOException;

import org.test.parent.BaseClass;

public class AdactinExcel extends BaseClass {
	public static void main(String[] args) throws IOException {
		createExcel("Adactin", "Datas");
		excelSetRow("Adactin", "Datas", 0, 0, "Username");
		excelGetRow("Adactin", "Datas", 0, 1, "SrianthSriAs");
		excelSetRow("Adactin", "Datas", 1, 0, "Password");
		excelGetRow("Adactin", "Datas", 1, 1, "JN8944");
		excelSetRow("Adactin", "Datas", 2, 0, "Location");
		excelGetRow("Adactin", "Datas", 2, 1, "Brisbane");
		excelSetRow("Adactin", "Datas", 3, 0, "Hotels");
		excelGetRow("Adactin", "Datas", 3, 1, "Hotel Sunshine");
		excelSetRow("Adactin", "Datas", 4, 0, "RoomType");
		excelGetRow("Adactin", "Datas", 4, 1, "Deluxe");
		excelSetRow("Adactin", "Datas", 5, 0, "Number of rooms");
		excelGetRow("Adactin", "Datas", 5, 1, "6");
		excelSetRow("Adactin", "Datas", 6, 0, "Indate");
		excelGetRow("Adactin", "Datas", 6, 1, "25/01/2024");
		excelSetRow("Adactin", "Datas", 7, 0, "Outdate");
		excelGetRow("Adactin", "Datas", 7, 1, "02/02/2024");
		excelSetRow("Adactin", "Datas", 8, 0, "AdultRoom");
		excelGetRow("Adactin", "Datas", 8, 1, "2");
		excelSetRow("Adactin", "Datas", 9, 0, "ChildRoom");
		excelGetRow("Adactin", "Datas", 9, 1, "3");
		excelSetRow("Adactin", "Datas", 10, 0, "FirstName");
		excelGetRow("Adactin", "Datas", 10, 1, "Srinath");
		excelSetRow("Adactin", "Datas", 11, 0, "Lastname");
		excelGetRow("Adactin", "Datas", 11, 1, "Alagesan");
		excelSetRow("Adactin", "Datas", 12, 0, "Address");
		excelGetRow("Adactin", "Datas", 12, 1, "Dharmapuri");
		excelSetRow("Adactin", "Datas", 13, 0, "Credict Card Number");
		excelGetRow("Adactin", "Datas", 13, 1, "9875432156789543");
		excelSetRow("Adactin", "Datas", 14, 0, "Cctype");
		excelGetRow("Adactin", "Datas", 14, 1, "MAST");
		excelSetRow("Adactin", "Datas", 15, 0, "CcMonth");
		excelGetRow("Adactin", "Datas", 15, 1, "6");
		excelSetRow("Adactin", "Datas", 16, 0, "CcYear");
		excelGetRow("Adactin", "Datas", 16, 1, "2030");
		excelSetRow("Adactin", "Datas", 17, 0, "ccv num");
		excelGetRow("Adactin", "Datas", 17, 1, "625");

	}

}
