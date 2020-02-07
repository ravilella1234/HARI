package com.icici.loans.carloans;

public interface Rbi 
{
	 
	public void withdrawl();
	
	public void deposit();
	public static void main(String[] args)
	{
		/*
		 * Rbi i =new icici(); i.deposit(); i.withdrawl();
		 * 
		 * Rbi i1=new Hdfc(); i1.deposit(); i1.withdrawl();
	
		 */
		Rbi i;
		i=new icici();
		i.deposit();
		i.withdrawl();
		
		i=new Hdfc();
		i.deposit();
		
	i.withdrawl();
	
	}
	
			
		

	

}
