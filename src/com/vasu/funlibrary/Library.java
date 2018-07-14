package com.vasu.funlibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Library 
{
	public static FirefoxDriver driver;
	public static String res;

	public String   appLaunch(String url)
	{
	   driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		if (driver.findElement(By.id("txtuId")).isDisplayed())
		{
		res="Pass";	
		}else
		{
			res="Fail";
		}
		return res;
	}
	//appLogin
	public String appLogin(String userName,String password)
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		if (driver.findElement(By.id("welcome")).isDisplayed())
		{
		res="Pass";	
		}else
		{
			res="Fail";
		}
		return res;
	}
	//appLogout
	//appClose
	//addEmp
	public String empAdd(String fName,String lName) throws Exception
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
		
		Thread.sleep(2000);
		driver.findElement(By.id("btnSave")).click();
		if (driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).isDisplayed()) 
			{
				res="Pass";	
			}
			else
			{
				res="Fail";	
			}
			return res;
		}
	
}
