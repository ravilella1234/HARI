package com.icici.loans.carloans;

import com.icici.homeloans.A;

public class C extends A
{
	public void m1()
	{
		System.out.println("iam overriden m1 from Class C");
	}
	
	public void m3()
	{
		System.out.println("iam m3 from Class C");
	}
	
	public static void main(String[] args) 
	{
		A a=new A();
		a.m1();
		System.out.println(a.x);
		
		C c=new C();
		c.m1();
		c.m3();
		System.out.println(c.x);
	}

}
