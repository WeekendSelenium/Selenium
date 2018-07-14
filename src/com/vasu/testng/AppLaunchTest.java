package com.vasu.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;
public class AppLaunchTest 
{
@Test
public void appLaunch()
{
	/*FirefoxDriver driver=new FirefoxDriver();
	driver.get("Http://Primusbank.qedgetech.com");
	driver.manage().window().maximize();*/
	
	Assert.assertEquals(13, 15);
//	Assert.assertTrue
	//(driver.findElement(By.id("txtuId")).isDisplayed());
	

}
}
