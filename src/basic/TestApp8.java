package basic;

import java.util.Scanner;

// Java 12+ [switch Statement] 
//-----------------------------
// 1. No Need for break;
// 2. return a value Directly.

public class TestApp8 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 to 7 Day Name [Monday to Sunday]:");
		String choice = sc.nextLine();
		
		int day =   switch(choice) 
					{
						case "Monday"-> 1; 
						
						case "Tuesday"-> 2; 
							   
						case "Wednesday"-> 3; 
						
						case "Thursday"-> 4; 
						
						case "Friday"-> 5; 
						
						case "Saturday"-> 6; 
						
						case "Sunday"-> 7; 
						
						default-> 0;
					};
		System.out.println("It's "+day+" day of a week.");
	}
}
