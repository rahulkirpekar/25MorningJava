package basic;

import java.util.Scanner;

public class TestApp7 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter Day Name : ");
//		String name = sc.nextLine();

		System.out.println("Enter 1 to 7 Day Name [Monday to Sunday]:");
		String choice = sc.nextLine();
		
		int day;
		
		switch(choice) 
		{
			case "Monday": day = 1; 
							break;
							
			case "Tuesday": day = 2; 
						   break;
						   
			case "Wednesday": day = 3; 
			   				break;

			case "Thursday": day = 4; 
			   				break;

			case "Friday": day = 5; 
							break;
			
			case "Saturday": day = 6; 
							break;

			case "Sunday": day = 7; 
						     break;
   				
			default: day = 0;
		}
		
		System.out.println("It's "+day+" day of a week.");
	}
}
