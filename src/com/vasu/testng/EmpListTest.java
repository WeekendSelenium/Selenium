package com.vasu.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EmpListTest extends OHRM
{
@Test
public void empList()
{
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Employee List")).click();
	//rows
List<WebElement> rows=driver.findElements
		(By.xpath(".//*[@id='resultTable']/tbody/tr"));
System.out.println(rows.size());
//for (int i = 0; i < rows.size(); i++) 
//{
//colomun count
List<WebElement> col=rows.get(2).findElements(By.tagName("td"));
for (int j = 0; j < col.size(); j++) 
{
System.out.println(col.get(j).getText());
}
}
}
