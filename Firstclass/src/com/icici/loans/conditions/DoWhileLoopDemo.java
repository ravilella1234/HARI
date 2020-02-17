package com.icici.loans.conditions;

public class DoWhileLoopDemo 
{

	public static void main(String[] args) throws Exception 
	{
		 int n = 1, times = 10;     
		do
		{
			System.out.println("Java do while loops:" + n);
			Thread.sleep(2000);
		    n++;    
		    System.out.println(n <= times);
		} while (n <= times);
		
	}

}
