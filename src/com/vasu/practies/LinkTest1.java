package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest1
{
	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Bing.com");
		driver.manage().window().maximize();
		
WebElement header=driver.findElement(By.className("sw_tb"));
	
List<WebElement> headerLinks=header.findElements(By.tagName("a"));
		
System.out.println(headerLinks.size());
for (int i = 0; i < headerLinks.size(); i++) 
{
	System.out.println(headerLinks.get(i).getText());
}
	}

}
