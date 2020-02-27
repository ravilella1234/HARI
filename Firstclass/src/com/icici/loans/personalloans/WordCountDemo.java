package com.icici.loans.personalloans;

import java.util.Scanner;

public class WordCountDemo 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String s = sc.nextLine();
		int count=countNumberOfWords(s);
		System.out.println("Number of words in String ="+ count);

	}

	public static int countNumberOfWords(String s) 
	{
		//Welcome to mindq
		int count=0;
		if(s.charAt(0)!=' ') {
			count++;
		}
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				count++;
			}
			
		}
		return count;
	}

}
