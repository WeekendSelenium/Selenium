package com.vasu.testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddEmpTest extends OHRM
{
@Test
public void empAdd() throws Exception
{
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
	driver.findElement(By.id("firstName")).sendKeys("vas67534");
	driver.findElement(By.id("lastName")).sendKeys("va343647");
	
	Thread.sleep(2000);
	driver.findElement(By.id("btnSave")).click();
}
}
