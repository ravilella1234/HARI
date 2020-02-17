package com.icici.loans.personalloans;

public class EmployeeChild extends Employee
{
	String location;

	public EmployeeChild(String location) 
	{
		super(1746,"keerthan",23.334f);
		this.location=location;
		System.out.println(this.location);
	}
	
	void m4()
	{
		
	}

	public static void main(String[] args) 
	{
		EmployeeChild e1=new EmployeeChild("hyderabad");

	}

}
