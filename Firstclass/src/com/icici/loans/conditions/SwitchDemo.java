package com.icici.loans.conditions;

public class SwitchDemo 
{

	public static void main(String[] args) 
	{
		char ch = 'b';

		 switch (ch) 
		 {
			case 'a':
			    System.out.println("You chose One");
			break;
	
			case 'b':
			    System.out.println("You chose Two");
			break;
	
			case 'c':
			    System.out.println("You chose Three");
			break;
	
			case 'd':
			    System.out.println("You chose Four");
			break;
	
			case 'e':
			    System.out.println("You chose Five");
			break;
	
			default:
			    System.out.println("Invalid Choice. Enter a no between 1 and 5");
			break;
		  }


	}

}
