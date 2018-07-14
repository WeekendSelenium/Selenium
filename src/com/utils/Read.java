package com.utils;

import java.io.IOException;

public class Read 
{
	public static void main(String[] args) throws Exception 
	{
	int rcnt=XLUtils.getRowCount
		("C:\\Users\\somesh\\Desktop\\AdminTestData.xlsx", "Sheet1");
System.out.println(rcnt);
	
String result=XLUtils.getCellData
("C:\\Users\\somesh\\Desktop\\AdminTestData.xlsx", "Sheet1", 1, 1);
System.out.println(result);
	
	}

}
