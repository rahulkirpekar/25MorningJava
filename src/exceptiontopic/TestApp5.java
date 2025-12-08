package exceptiontopic;

import java.util.Scanner;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();// 100
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();// 2
		
		int ans ;

		// Nested try...catch
		try 
		{
			try 
			{
				ans = no1 / no2;
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			try 
			{
				String name = null;
				System.out.println("name.length() : " + name.length());
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			try 
			{
				int a[] = new int[5];
				a[5] =  100;
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("General Statement");
	}
}
