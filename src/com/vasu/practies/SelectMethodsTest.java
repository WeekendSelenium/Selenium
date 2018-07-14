package com.vasu.practies;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodsTest
{
	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.shadi.com/");
		driver.manage().window().maximize();
		WebElement month=driver.findElement(By.id("dob_m"));
	
		Select slt=new Select(month);
		slt.selectByIndex(5);
		
		
	
	}

}
