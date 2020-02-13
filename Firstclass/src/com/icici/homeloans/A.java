package com.icici.homeloans;

import java.util.Date;

public  class A 
{
	public int x=100;
	
	public  void m1()
	{
		System.out.println("iam m1 from Class A");
	}
	
	public static void m6()
	{
		System.out.println("iam m6 static method...");
	}
	
	static
	{
		System.out.println("iam static block");
		Date dt=new Date();
		System.out.println(dt);
	}
	
	static
	{
		System.out.println("iam 2nd static block");
	}
	
	
	public static void main(String[] args) {
		A a=new A();
		a.m1();
		
		System.out.println(a.x);
		
		A.m6();
	}

}
