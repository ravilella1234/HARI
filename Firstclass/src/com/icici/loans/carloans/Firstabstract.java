package com.icici.loans.carloans;

public abstract class Firstabstract
{
	public void m1()
	{
		System.out.println("iam m1 concrete methodc in class First abstract");
		
	}
	public abstract void m2();
	public static void main(String[] args) {
		Firstabstract f=new Childclass();
		f.m1();
		f.m2();
		
	
		
	}
}
