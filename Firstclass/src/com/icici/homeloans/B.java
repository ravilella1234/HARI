package com.icici.homeloans;

public class B extends A
{
	
	public void m1()
	{
		System.out.println("iam overriden m1 from Class B");
	}
	
	public void m2()
	{
		System.out.println("iam m2 from Class B");
	}
	
	public static void main(String[] args) 
	{
				
		A a=new A();
		a.m1();
		System.out.println(a.x);
		
		A obj=new B();
		obj.m1();
		
		//B obj1=new A();
		
		B b=new B();
		b.m1();
		b.m2();
		System.out.println(b.x);
		
	}
}

