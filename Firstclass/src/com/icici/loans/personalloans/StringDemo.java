package com.icici.loans.personalloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String  s1="ravikaNTH";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s1.length());
		System.out.println(s1.charAt(4));
		System.out.println(s1.indexOf('n'));
		System.out.println(s1.isEmpty());
		
		String s2=new String("Ravi");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s2.toLowerCase());
		System.out.println(s1.contains(s2.toLowerCase()));
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		System.out.println(s1.startsWith("ravi"));
		System.out.println(s1.endsWith("nth".toUpperCase()));
		
		System.out.println(s1.substring(2, 7));
		
		String s3="ravi kanth lella";
		System.out.println(s3);
		String[] s = s3.split(" ");
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		String c1=" ravi";
		String c2="ravi";
		System.out.println(c1.equals(c2));
		System.out.println(c1.trim().equals(c2));
		
		
		
		
		
		
		
	}

}
