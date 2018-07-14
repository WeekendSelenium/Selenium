package com.vasu.practies;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload 
{
	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org");
		driver.manage().window().maximize();
		driver.findElement
		(By.xpath(".//*[@id='menu_download']/a")).click();
		driver.findElement
		(By.xpath(".//*[@id='mainContent']/p[3]/a")).click();
		
		/*Runtime.getRuntime().
		exec("C:\\Users\\somesh\\Desktop\\vasufd.exe");*/
		
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_ENTER);
	}

}
