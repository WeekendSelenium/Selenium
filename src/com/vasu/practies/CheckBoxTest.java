package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxTest
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		//driver.findElement(By.id("remember")).click();
		WebElement check=driver.findElement(By.id("remember"));
		//status of check box
		System.out.println(check.getAttribute("checked"));
		
//validating check box 
		if (check.isSelected())
		{
			check.click();
			
			System.out.println(check.getAttribute("checked"));
		}
		
	}

}
