package com.vasu.practies;

import java.util.List;

import org.openqa.jetty.jetty.servlet.WebApplicationContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class shaaditext 
{

	public static void main(String[] args) 
	{
		
FirefoxDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.shadi.com/");
WebElement drop=driver.findElement(By.id("dob_m"));
List<WebElement> dropList=drop.findElements(By.tagName("option"));
System.out.println(dropList.size());
for (int i = 0; i < dropList.size(); i++) 
{
if (dropList.get(i).getText().equals("Jun"))
{
	dropList.get(i).click();
	break;

}
}
}

}
