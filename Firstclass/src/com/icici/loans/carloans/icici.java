package com.icici.loans.carloans;

public class icici implements Rbi
{

	public static void main(String[] args) 
	{
	    icici i=new icici();
	    i.deposit();
	    i.withdrawl();
	    

	}

	@Override
	public void withdrawl() 
	{
	System.out.println("iam overridden withdrawl from icici");
	}
	
@Override
	public void deposit()
	{
	System.out.println("iam overridden deposit from icici");
	
		
	}

}
