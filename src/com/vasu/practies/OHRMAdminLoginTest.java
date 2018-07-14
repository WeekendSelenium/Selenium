package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OHRMAdminLoginTest 
{
	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		//validation
		if (driver.findElement(By.id("welcome")).isDisplayed()) 
		{
			System.out.println("AdminLogin Successfully");
		}else
		{
			System.out.println("AdminLogin Fail");
		}
		
		

	}

}
