package com.icici.homeloans;

public class VariableTypes 
{
	//primitive Variable
	int x=10; // instance (or) global (or) non-static varaiable
	static String cname="vmware"; // static varibale
	static VariableTypes obj;
	
	public void m1()
	{
		int x=100; // local variable
		System.out.println(this.x);
		System.out.println(cname);
	}
	
	public static void m5()
	{
		obj=new VariableTypes();
		System.out.println(obj.x);
		System.out.println(cname);
	}

	public static void main(String[] args) 
	{
		obj=new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}

}
