package com.vasu.funlibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteTest 
{
	@Test
	public void write() throws Exception
	{
		File srcFile=new File("C:\\Users\\somesh\\Desktop\\TestData1.xlsx");
		FileInputStream fis=new FileInputStream(srcFile);
		XSSFWorkbook wb=new  XSSFWorkbook(srcFile);
		XSSFSheet ws=wb.getSheet("Sheet1");
		ws.getRow(0).createCell(2).setCellValue("Results");
		ws.getRow(1).createCell(2).setCellValue("Pass");
		ws.getRow(2).createCell(2).setCellValue("Fails");
		FileOutputStream fos=new FileOutputStream(srcFile);
		wb.write(fos);
		wb.close();
		
	}
}
