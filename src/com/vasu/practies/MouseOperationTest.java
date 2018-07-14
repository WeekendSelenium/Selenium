package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperationTest
{
	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://Amazon.in");
		driver.manage().window().maximize();
		WebElement yo=driver.findElement(By.id("nav-link-yourAccount"));
		WebElement yac=driver.findElement
				(By.xpath(".//*[@id='nav-flyout-yourAccount']/div[3]/a[1]/span"));
		
		Actions mouse=new Actions(driver);
		
		mouse.moveToElement(yo).pause(2000).moveToElement(yac).click().build().perform();

	}

}
