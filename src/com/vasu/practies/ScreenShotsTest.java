package com.vasu.practies;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotsTest
{
	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver = new FirefoxDriver();
	     driver.get("https://google.com");
	     driver.manage().window().maximize();
	     
	     TakesScreenshot sc=(TakesScreenshot)driver;
	
	     File src=sc.getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(src,new
			 File("C:\\Users\\somesh\\Desktop\\ScreenShots\\vasu.png"));
	 

	}

}
