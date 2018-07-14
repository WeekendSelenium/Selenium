package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadTest 
{
	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
driver.get
("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys("vasv98534");
		driver.findElement(By.id("lastName")).sendKeys("vas9047");
		//driver.findElement(By.id("photofile")).sendKeys("E:\\Tula.png");
		
		driver.findElement(By.id("photofile")).click();
		Runtime.getRuntime()
		.exec("C:\\Users\\somesh\\Desktop\\fup.exe");
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();

	}

}
