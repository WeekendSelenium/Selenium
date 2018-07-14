package com.vasu.practies;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.firefox.FirefoxDriver;
public class MultipleWindowsTest1
{
	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Set<String> windows=driver.getWindowHandles();
		List<String> childs=new ArrayList<>(windows);
		driver.switchTo().window(childs.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(childs.get(0));
		System.out.println(driver.getTitle());
		//driver.close();
	}

}
