package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ShadiRegTest {

	public static void main(String[] args) throws Exception {
     FirefoxDriver driver = new FirefoxDriver();
     driver.get("https://www.shadi.com/");
     driver.manage().window().maximize();
     driver.findElement(By.id("first_name")).sendKeys("hemanth");
     driver.findElement(By.id("last_name")).sendKeys("kumar");
     driver.findElement(By.id("rblGender_0")).click();
     Select month = new Select(driver.findElement(By.id("dob_m")));
     month.selectByVisibleText("Mar");
     Thread.sleep(2000);
     Select day = new Select(driver.findElement(By.id("dob_d")));
     day.selectByValue("04");
     Thread.sleep(2000);
     Select year = new Select(driver.findElement(By.id("dob_y")));
     year.selectByValue("1994");
     Thread.sleep(2000);
    Select religion=new Select(driver.findElement(By.id("ddlReligion")));
    religion.selectByVisibleText("Hinduism");
    Thread.sleep(2000);
    Select country=new Select(driver.findElement(By.id("ddlCountry")));
    country.selectByVisibleText("India");
	}

}
