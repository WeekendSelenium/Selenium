package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedBusTest
{
	
	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://Redbus.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='src']")).sendKeys("H");
		
		Thread.sleep(2000);
List<WebElement>   cityNames=	
driver.findElements(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li"));
	
System.out.println(cityNames.size());
for (WebElement elements : cityNames) 
{
	System.out.println(elements.getText());
}

	}

}
