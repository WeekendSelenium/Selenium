package com.vasu.practies;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
 public class MultipleWindowsTest 
{
	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		String homePage=driver.getWindowHandle();
	//System.out.println(homePage);
	driver.findElement(By.id("loginsubmit")).click();
	Set<String> windows=driver.getWindowHandles();
Iterator<String> it=windows.iterator();
while(it.hasNext())
{
	String childWindow=it.next().toString();
	//System.out.println(childWindow);
	if(!homePage.equals(childWindow))
	{
		driver.switchTo().window(childWindow);
		Thread.sleep(2000);
	driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
		
	}
}

}
		

	

}
