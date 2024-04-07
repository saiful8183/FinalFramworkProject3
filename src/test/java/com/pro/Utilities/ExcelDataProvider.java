package com.pro.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	public static FileInputStream inputstream;
	public static XSSFWorkbook Workbook;
	public static XSSFSheet excellsheet;
	public static XSSFRow row;
	public static XSSFCell cell;

	
	
	
	
	public static String getCellValue(String FileName, String sheetName, int rowNo, int cellNo)

	{

		try {

			inputstream = new FileInputStream(FileName);
			Workbook = new XSSFWorkbook(inputstream);
			excellsheet = Workbook.getSheet(sheetName);
			cell = Workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo);

			Workbook.close();

			return cell.getStringCellValue();
		}

		catch (Exception e)

		{

			return "";

		}

	}

	
	
	
	
	
	
	
	
	
	
	public static int getRowCount(String FileName, String sheetName)

	{

		try {

			inputstream = new FileInputStream(FileName);
			Workbook = new XSSFWorkbook(inputstream);
			excellsheet = Workbook.getSheet(sheetName);

			int totalrow = excellsheet.getLastRowNum() + 1;

			Workbook.close();

			return totalrow;

		}

		catch (Exception e)

		{

			return 0;

		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int getColumnCount(String FileName, String sheetName)

	{

		try {

			inputstream = new FileInputStream(FileName);
			Workbook = new XSSFWorkbook(inputstream);
			excellsheet = Workbook.getSheet(sheetName);

			int totalcell = excellsheet.getRow(0).getLastCellNum();

			Workbook.close();

			return totalcell;

		}

		catch (Exception e)

		{

			return 0;

		}

	}

	
	
	
	
	
	

	public String getStringData(int sheetIndex, int row, int column) {

		return Workbook.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();

	}

	
	
	
	
	
	public String getStringData(String sheetName, int row, int column) {

		return Workbook.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();

	}

	
	
	
	
	
	
	
	
	
	
	public double getNumaricData(String sheet, int row, int column) {

		return Workbook.getSheet(sheet).getRow(row).getCell(column).getNumericCellValue();

	}

	/*
	 * 
	 * public String getStringData(String sheet, int row, int column) {
	 * 
	 * return
	 * Workbook.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
	 * 
	 * }
	 * 
	 * public String getStringData(int sheetNum, int row, int column) {
	 * 
	 * return
	 * Workbook.getSheetAt(sheetNum).getRow(row).getCell(column).getStringCellValue(
	 * );
	 * 
	 * }
	 * 
	 * public int getNumaricData(String sheet, int row, int column) {
	 * 
	 * return (int)
	 * (Workbook.getSheet(sheet).getRow(row).getCell(column).getNumericCellValue());
	 * 
	 * }
	 */
}
