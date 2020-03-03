package com.icici.collections;

import java.util.ArrayList;

public class ListDemo 
{

	public static void main(String[] args) 
	{	
		ArrayList<Object> a=new ArrayList<>();
		a.add(10);
		a.add("ravilella");
		a.add(12.34f);
		a.add(10);
		a.add(20);
		a.add(30);
		
		System.out.println(a);
		System.out.println(a.get(1));
		
		System.out.println(a.contains(20));
		
		System.out.println(a.hashCode());
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		
		System.out.println(a.indexOf("ravilella"));
		
		a.set(1, "ravi");
		System.out.println(a);
		
		a.add(1, "sai");
		System.out.println(a);
		
		a.remove(1);
		System.out.println(a);
		
		a.remove(12.34f);
		System.out.println(a);
		
		a.clear();
		System.out.println(a);
	}

}
