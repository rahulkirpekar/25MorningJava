package basic;

import java.util.Scanner;

public class TestApp14 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No : ");
		int no = sc.nextInt();
		
		int fc = 0;
		
		for (int i = 1; i <=no; i++) 
		{
			if(no%i == 0)
			{
				System.out.print(i+" ");
				fc++;
			}
		}
		System.out.println("\nTotal Factor is : " + fc);
		if(fc==2) 
		{
			System.out.println(no+" is prime.");	
		}else 
		{
			System.out.println(no+" is not prime.");	
		}
	}
}
