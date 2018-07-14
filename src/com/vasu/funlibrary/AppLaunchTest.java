package com.vasu.funlibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppLaunchTest 
{
	public static String res;

	public String   appLaunch(String url)
	{
		FirefoxDriver driver=new FirefoxDriver();
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
	public static void main(String[] args) 
	{
		AppLaunchTest app=new AppLaunchTest();
		//app.appLaunch("Http://primusbank.qedgetech.com");
	String results=app.appLaunch("Http://primusbank.qedgetech.com");
	System.out.println(results);
	}
}
