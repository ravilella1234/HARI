package com.icici.loans.carloans;

class Parent
{
	public strictfp Number workhard()
	{
		System.out.println("Wakeup early,And goto College....");
		return 0;
	}
	
	public void care()
	{
		System.out.println("Atmost care....");
	}
	
}

public class Child extends Parent
{
	 public strictfp Object workhard()
	{
		System.out.println("Wakeup anytime,And goto bar/beautyparlour....");
		return 0;
	}
	
	public void love()
	{
		System.out.println("iam in love....");
	}
	
	public static void main(String[] args) {
		Child obj=new Child();
		obj.workhard();
		obj.care();
		obj.love();
	}

}
