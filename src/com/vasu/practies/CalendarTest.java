package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarTest
{
	public static void main(String[] args)
	{
		String date ="12/jan/2019";
		
		String [] datasplict=date.split("/");
		String day=datasplict[0];
		String month=datasplict[1];
		String year=datasplict[2];
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='DepartDate']")).click();
		//year selection
		
String calYear=	driver.findElement
(By.className("ui-datepicker-year")).getText();

while (!calYear.equals(year))
	
{
	driver.findElement(By.className("nextMonth ")).click();
	calYear=driver.findElement(By.className("ui-datepicker-year")).getText();
}
//selct month
String calmonth=driver.findElement
(By.className("ui-datepicker-month")).getText();

while (!calmonth.equalsIgnoreCase(month))
	
{
	driver.findElement(By.className("nextMonth ")).click();
	calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
}
//day selection
List<WebElement> rows=driver.findElements
(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr"));

for (int i = 0; i < rows.size(); i++)
{
	//col
List<WebElement>	col=rows.get(i).findElements(By.tagName("td"));
for (int j = 0; j < col.size(); j++) 
{
	String calDay=col.get(j).getText();
	if (calDay.equals(day))
	{
		col.get(j).click();
		break;
	}
}
}

	}

}
