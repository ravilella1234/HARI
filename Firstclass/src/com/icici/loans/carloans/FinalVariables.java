package com.icici.loans.carloans;

public class FinalVariables 
{
	public final int x=10;
	public final static int y=20;

	public static void main(String[] args) 
	{
		final int z=30;
		
		FinalVariables obj=new FinalVariables();
		//obj.x=100;
		System.out.println(obj.x);
		
		//y=200;
		System.out.println(y);
		
		//z=300;
		System.out.println(z);
		
	}

}
