package exceptiontopic;

import java.util.Scanner;

public class TestApp7 
{
	public static void main(String[] args) 
	{
		int no1,no2,ans = 0;
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter No1 : ");
		no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		no2= sc.nextInt();
		
		try 
		{
			ans = no1 / no2;
		} 
		finally 
		{
			System.out.println("Hi, I am Finally Block");
		}
		System.out.println("Division : " + ans);
	}
}
