package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data_1 {

	public static void main(String[] args) throws IOException {

		File f = new File("D:\\Java GT\\Project\\Frameworks\\DataDriven\\Write Data 1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet1 = wb.createSheet("User_Data");

		Row row1 = sheet1.createRow(0);

		Cell cell1 = row1.createCell(0);

		cell1.setCellValue("Email");

		Sheet sheet2 = wb.getSheet("User_Data");

		Row row2 = sheet2.getRow(0);

		Cell cell2 = row2.createCell(1);

		cell2.setCellValue("Password");

		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();
		
		System.out.println("Write Succesfully");

	}

}
