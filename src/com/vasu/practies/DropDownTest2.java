package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownTest2
{
	public static void main(String[] args)
	{

FirefoxDriver driver=new FirefoxDriver();
driver.get("http://newtours.demoaut.com");
driver.manage().window().maximize();
driver.findElement(By.linkText("REGISTER")).click();
//identify country dropdown and stored into WebElement
WebElement country=driver.findElement(By.name("country"));
//identify list of countryies available in country dropdown 
List<WebElement> countryList=country.findElements(By.tagName("option"));
System.out.println(countryList.size());
for (int i = 0; i < countryList.size(); i++)
{
	countryList.get(i).click();
	if (countryList.get(i).isSelected())
	{
		System.out.println(countryList.get(i).getText()+" : Is Selected ");
	}else
	{
		System.out.println(countryList.get(i).getText()+" : Is Not Selected ");
	}
}


	}

}
