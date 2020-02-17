package com.icici.loans.personalloans;

public class Calculations 
{
	int a,b,c;
	
	public Calculations(int a, int b) 
	{
		this.a=a;
		this.b=b;
	}

	public void add()
	{
		c=a+b;
		System.out.println("Addition of A & B is :  "+ c);
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("Sub of A & B is :  "+ c);
	}

	public static void main(String[] args) 
	{
		Calculations obj=new Calculations(10,20);
		obj.add();
		obj.sub();
		
		Calculations obj1=new Calculations(100, 200);
		obj1.add();
		obj1.sub();

	}

}
