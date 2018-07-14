package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserTest
{

	public static void main(String[] args)
	{
		//launching firefox browser
		FirefoxDriver driver=new FirefoxDriver();
		//naviagte to gmail
		driver.get("Http://Gmail.com");
		//identify username filed and enter username
		driver.findElement(By.id("identifierId")).sendKeys("Vasu.584");

	}

}
