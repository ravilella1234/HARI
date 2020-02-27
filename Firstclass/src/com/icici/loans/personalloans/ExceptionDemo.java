package com.icici.loans.personalloans;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionDemo 
{

	public static void main(String[] args) 
	{
		int nr,dr,result;
		Scanner sc=new Scanner(System.in);
		
		
		
		while (true) 
		{
			System.out.println("Enter the nr value : ");
			nr=sc.nextInt();
			System.out.println("Enter the dr value : ");
			dr=sc.nextInt();
			try 
			{
				result = nr / dr;
				System.out.println(result);
				break;
			} 
			catch (NullPointerException e) {
				// TODO: handle exception
			}
			catch (ArithmeticException e)
			{
				//e.printStackTrace();
				//System.out.println(e);
				System.out.println("Denominator value should be greater than Zero...");
			} 
			
			catch (NoSuchElementException e) {
				// TODO: handle exception
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
