package array.backup;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		int a[] = new int[5];
		
		System.out.println("a.length : " + a.length);
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter A["+i+"] : ");
			a[i] = sc.nextInt();
		}
		for (int i = (a.length-1); i >=0; i--) 
		{
			System.out.println("A["+ i +"] : " + a[i]);
		}
	}
}
