package com.vasu.java;
public class ArrayTest
{
public static void main(String[] args)
	{
       //intialization of an array
		int a[]=new int[5];
		//retrieving values from an array
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		//inserting values into array
		a[0]=10;
		a[1]=11;
		a[2]=12;
		a[3]=13;
		a[4]=14;
		a[5]=15;
		System.out.println("##########");
		/*System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);*/
		/*for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
			
		}*/
		
		for(int x:a)
		{
			System.out.println(x);
		}

	}

}
