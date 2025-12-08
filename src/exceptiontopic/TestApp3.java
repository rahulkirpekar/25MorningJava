package exceptiontopic;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();// 100
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();// 2
		
		int ans ;
		
		try 
		{
			ans = no1 / no2;
			
			String name = null;
			System.out.println("name.length() : " + name.length());
		
			int a[] = new int[5];
			a[5] =  100;
		}
		catch (NullPointerException e) 
		{
			e.printStackTrace();
		}
		catch (ArithmeticException e) 
		{
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			e.printStackTrace();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("General Statement");
	}
}
