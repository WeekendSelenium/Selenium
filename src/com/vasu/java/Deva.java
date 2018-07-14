package com.vasu.java;

public class Deva extends Vasu
{
public void msg()
{
	System.out.println("msg");
}
public static void main(String[] args) 
{
	Deva v=new Deva();
	v.add();
	v.msg();
	System.out.println(v.k);
}
}
