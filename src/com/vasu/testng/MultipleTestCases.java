package com.vasu.testng;

import org.testng.annotations.Test;

public class MultipleTestCases
{
@Test
public void appLaunch()
{
	System.out.println("App Launch");
}
@Test
public void appLogin()
{
	System.out.println("App Login");
}
@Test
public void appClose()
{
	System.out.println("App Close");
}
}
