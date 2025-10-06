package basic;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No : ");
		int no = sc.nextInt();
		
		// ladder if..else
		if(no > 0) 
		{
			// true
			System.out.println("No is Positive");
		}
		else if(no < 0)
		{
			// false
			System.out.println("No is Negative");
		}
		else if(no == 0)
		{
			// false
			System.out.println("No is Zero");
		}
		
		
		System.out.println("General Statement");
		
	}
}
