package com.vasu.java;
import java.util.ArrayList;
import java.util.List;
public class ArrayListTest 
{
	public static void main(String[] args)
	{
		List<String>  l=new ArrayList<>();
		//inserting values
		l.add("Vasu");
		l.add("Selenium");
		l.add("ETL");
		l.add("QTP");
		l.add("Vasu");
		System.out.println(l.size());
		/*System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l.get(3));
		System.out.println(l.get(4));*/
		
		/*for (int i = 0; i <l.size(); i++) 
		{
			System.out.println(l.get(i));
		}
*/
		for(String list:l)
		{
			System.out.println(list);
		}
	}

}
