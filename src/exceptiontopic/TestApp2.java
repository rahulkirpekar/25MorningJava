package exceptiontopic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();// 100
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();// 0
		
		int ans = 0;
		
		// Exception Handling ---try...catch
		try 
		{
			ans = no1 / no2;// 100 / 0 ---ArithmeticException---code Crashed			
			
		}catch(NullPointerException e) 
		{
			System.out.println("Catch Block Handled Arithmetic Exception");
		}
		System.out.println("Division : " + ans);
	}
}
