package com.vasu.funlibrary;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PrimusBank
{
	static FirefoxDriver driver;
	static String res;
	//appLaunch
	//appLogin
//branchcreation
	public String branchCreation(String branchName,String add1,String zip) throws Exception
	{
		
		String countryName="INDIA";
		String stateName="Andhra Pradesh";
		String cityName="Hyderabad";
		
		//branchcreation
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		
		driver.findElement(By.id("txtbName")).sendKeys(branchName);
		driver.findElement(By.id("txtAdd1")).sendKeys(add1);
		driver.findElement(By.id("txtZip")).sendKeys(zip);
		
		Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
		country.selectByVisibleText(countryName);
		Thread.sleep(3000);
		Select state=new Select(driver.findElement(By.id("lst_stateI")));
		state.selectByVisibleText(stateName);
		Thread.sleep(3000);
		Select city=new Select(driver.findElement(By.id("lst_cityI")));
		city.selectByVisibleText(cityName);
		Thread.sleep(3000);
		driver.findElement(By.id("btn_insert")).click();
		
		Alert alt=driver.switchTo().alert();
		String msg=alt.getText();
		alt.accept();
		if (msg.contains("created Sucessfully")) 
		{
			res="Pass";
		}else if(msg.contains("please fill in:"))
		{
			res="Warning";
		}else if(msg.contains("already exist"))
		{
			res="Fail";
			
		}
	return res;	
	}
}
