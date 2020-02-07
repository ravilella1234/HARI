package com.icici.loans.carloans;

public class Childclass extends Firstabstract 
{

	public static void main(String[] args) {
		Childclass c=new Childclass();
		c.m1();
		c.m2();
		

	}
	public void m1()
	{
		System.out.println("iam m1 overridden m1 from childclass");
		
	}
	
	public void m2() 
	
	{
		System.out.println("iam overridden m2 from childclass ");
		
	}

}
