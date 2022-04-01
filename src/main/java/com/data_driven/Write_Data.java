package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\Java GT\\Project\\Frameworks\\DataDriven\\Write Data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet("User_Data").createRow(0).createCell(0).setCellValue("Email");
		
		wb.getSheet("User_Data").getRow(0).createCell(1).setCellValue("Password");
		
		wb.getSheet("User_Data").createRow(1).createCell(0).setCellValue("Aravind");
		
		wb.getSheet("User_Data").getRow(1).createCell(1).setCellValue("12345");
		
		wb.getSheet("User_Data").createRow(2).createCell(0).setCellValue("Anand");

		wb.getSheet("User_Data").getRow(2).createCell(1).setCellValue("Anand@123");

		wb.getSheet("User_Data").createRow(3).createCell(0).setCellValue("Sekar");

		wb.getSheet("User_Data").getRow(3).createCell(1).setCellValue("Sekar@1234");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();
		
		System.out.println("Write Succesfully");
		

	}

}
