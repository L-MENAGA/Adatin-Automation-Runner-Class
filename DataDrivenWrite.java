package com.Runner1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenWrite {
	public static void write_Data() throws Throwable{
		
		File f= new File ("C:\\Users\\ELCOT\\Desktop\\Selenium\\DataDriven_Write.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook (fis);
		wb.createSheet("Input").createRow(0).createCell(0).setCellValue("Username");;
		wb.getSheet("Input").getRow(0).createCell(1).setCellValue("LoginID");
		wb.getSheet("Input").getRow(0).createCell(2).setCellValue("PassWords");
		wb.getSheet("Input").createRow(1).createCell(0).setCellValue("Alpha");
		wb.getSheet("Input").getRow(1).createCell(1).setCellValue("112233");
		wb.getSheet("Input").getRow(1).createCell(2).setCellValue("!#$123abc");
		
		FileOutputStream fos = new FileOutputStream(f);	
		wb.write(fos);
		wb.close();
		System.out.println("Successfully Data Written");
		
	}

	public static void main(String[] args) throws Throwable {
		write_Data();
	}
}
