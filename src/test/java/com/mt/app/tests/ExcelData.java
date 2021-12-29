package com.mt.app.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelData {
	
	
	@Test
	public void getData() throws IOException 
	{
		FileInputStream fis=new FileInputStream("E:\\KeywordDriven\\KeywordDrivenn.xlsx");
		
		XSSFWorkbook book=new XSSFWorkbook(fis);
		
		double num=book.getSheet("Sheet1").getRow(1).getCell(4).getNumericCellValue();
		int newnum=(int)num;
		System.out.println(newnum);
		String s=newnum +"";
		System.out.println(s);
		
	}

}
