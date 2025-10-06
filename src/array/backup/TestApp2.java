package array.backup;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[5];
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter A["+i+"] : ");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2 == 1) 
			{
				System.out.println("A["+i+"] : " + a[i]);
			}
		}
	}
}
