package com.icici.loans.carloans;

public class MethodOverLoading 
{
	
	/*
	 * public void m1(int x) { System.out.println(x); }
	 */
	
	/*
	 * public void m1(float x) { System.out.println(x); }
	 */
	
	/*
	 * public void m1(String x) { System.out.println(x); }
	 */
	
	/*
	 * public void m1(Number x) { System.out.println(x); }
	 */
	
	/*
	 * public void m1(Integer x) { System.out.println(x); }
	 */
	
	public void m1(Object x)
	{
		System.out.println(x);
	}
	
	public static void main(String[] args) 
	{
		MethodOverLoading obj=new MethodOverLoading();
		obj.m1(100);
		obj.m1(23.45f);
		obj.m1("ravilella");
		obj.m1(200);
		obj.m1(43.45f);
		obj.m1("sai");
	}

}
