package com.icici.collections;

import java.util.Set;
import java.util.TreeMap;

public class MapDemo 
{

	public static void main(String[] args) 
	{
		TreeMap<Integer, Integer> h=new TreeMap<Integer, Integer>();
		h.put(100, 300);
		h.put(20, 200);
		h.put(80, 100);
		h.put(50, 100);
		h.put(10, 400);
		
		System.out.println(h);
		System.out.println(h.get(40));
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		System.out.println(h.containsKey(50));
		Set<Integer> val = h.keySet();
		
		for(int i:val)
			System.out.println(h.get(i));

	}

}
