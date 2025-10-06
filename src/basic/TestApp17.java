package basic;

import java.util.Scanner;

public class TestApp17 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No : ");
		int no = sc.nextInt();
		
		int i = 1 , fc = 0;
		
		while(i<=10) 
		{
			if(no%i == 0) 
			{
				fc++;
			}
			i++;
		}
		if(fc==2) 
		{
			System.out.println(no+" is prime");
		}else 
		{
			System.out.println(no+" is not prime");
		}
	}
}
