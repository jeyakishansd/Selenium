package com.datadriver.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriver {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\MY PC\\eclipse-workspace\\DataDriver\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		@SuppressWarnings("resource")
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		
		int rowsize = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < rowsize; i++) {
			Row row = sheetAt.getRow(i);
			
		int cellsize = row.getPhysicalNumberOfCells();
		for (int j = 0; j < cellsize; j++) {
			Cell cell = row.getCell(j);
			
			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.STRING)) {
				
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				
				
			}
			else if (cellType.equals(CellType.NUMERIC)) {
				double d = cell.getNumericCellValue();
				long value = (long)d;
				String valueOf = String.valueOf(value);
				System.out.println(valueOf);
			}
		}
			
		}
		System.out.println("===============================");
		String StringCellValue = wb.getSheetAt(0).getRow(2).getCell(2).getStringCellValue();
		System.out.println(StringCellValue);
		Cell createCell = wb.getSheetAt(0).createRow(7).createCell(3);
		createCell.setCellValue("datas");
	
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}

}
