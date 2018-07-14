package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BranchCreationTest
{

	public static void main(String[] args) throws Exception 
	{
		//variable
		String userName="Admin";
		String password="Admin";
		String branchName="Vasudeva546";
		String address1="Ameerpet";
		String zipcode="22222";
		String countryName="INDIA";
		String stateName="Andhra Pradesh";
		String cityName="Hyderabad";
		//appLaunch
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Primusbank.qedgetech.com");
		driver.manage().window().maximize();
		//appLogin
		driver.findElement(By.id("txtuId")).sendKeys(userName);
		driver.findElement(By.id("txtPword")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		//branchcreation
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		
		driver.findElement(By.id("txtbName")).sendKeys(branchName);
		driver.findElement(By.id("txtAdd1")).sendKeys(address1);
		driver.findElement(By.id("txtZip")).sendKeys(zipcode);
		
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
		
		
		
	}

}
