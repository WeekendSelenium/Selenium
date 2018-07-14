package com.vasu.practies;
import java.io.File;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleScreenShotsTest 
{
	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) 
		{
			String linkName=links.get(i).getText();
			links.get(i).click();
			
			TakesScreenshot sc=(TakesScreenshot)driver;
			
		File srcFile=sc.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new
	File("C:\\Users\\somesh\\Desktop\\ScreenShots\\"+linkName+".png"));
		driver.navigate().back();
		links=driver.findElements(By.tagName("a"));
		}

	}

}
