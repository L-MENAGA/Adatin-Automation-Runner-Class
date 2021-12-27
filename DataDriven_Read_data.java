package com.Runner1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class DataDriven_Read_data {
	public static void read_Particular_Data() throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Dec_Mini_Project\\DatadrivenSpreadsheets\\DataDriven11122021.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet gettingSheet = wb.getSheetAt(0);
		Row row = gettingSheet.getRow(2);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		if(cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println("Reading Particular Data:\n"+stringCellValue);
		}
			
		
		else if(cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int value=(int) numericCellValue;
			System.out.println("Reading Particular Data:\n" +value);
			
		}
	}
public static void read_All_Data() throws IOException {
	System.out.println("**********Reading All DATA***********");
	File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Dec_Mini_Project\\DatadrivenSpreadsheets\\DataDriven11122021.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet gettingSheet = wb.getSheetAt(0);
	int physicalNumberOfRows = gettingSheet.getPhysicalNumberOfRows();
	System.out.println("Total Number Of Rows:"+physicalNumberOfRows);
	for (int i=0;i<physicalNumberOfRows;i++) {
	Row row = gettingSheet.getRow(i);
	int physicalNumberOfCells = row.getPhysicalNumberOfCells();
	for (int j=0;j<physicalNumberOfCells;j++) {
		Cell cell = row.getCell(j);
		CellType cellType = cell.getCellType();
		
	
	if(cellType.equals(cellType.STRING)) {
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
	}
		
	
	else if(cellType.equals(cellType.NUMERIC)) {
		double numericCellValue = cell.getNumericCellValue();
		int value=(int) numericCellValue;
		System.out.println(value);
		
	}
	}
	}
	}
	public static void read_RowData() throws IOException {
		System.out.println("**********Reading Row DATA***********");
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Dec_Mini_Project\\DatadrivenSpreadsheets\\DataDriven11122021.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet gettingSheet = wb.getSheetAt(0);
		Row row = gettingSheet.getRow(2);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		for (int j=0;j<physicalNumberOfCells;j++) {
			Cell cell = row.getCell(j);
			CellType cellType = cell.getCellType();

			if(cellType.equals(cellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			}
				
			
			else if(cellType.equals(cellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int value=(int) numericCellValue;
				System.out.println(value);
				
			}
			}
		}
		public static void read_CellDATA() throws IOException {
			System.out.println("**********Reading Cell DATA***********");
			File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Dec_Mini_Project\\DatadrivenSpreadsheets\\DataDriven11122021.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet gettingSheet = wb.getSheetAt(0);
			for (Row row : gettingSheet) {
				Cell cell = row.getCell(0);
				System.out.println(cell);
				
			}
}

	public static void main(String[] args) throws Throwable {
		read_Particular_Data();
		read_All_Data();
        read_RowData();
        read_CellDATA();
	
	}

}
