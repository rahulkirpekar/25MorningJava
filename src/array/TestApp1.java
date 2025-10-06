package array;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Array Declaration
		int a1[] = new int[5];
		int []a2 = new int[5];
		int[] a3 = new int[5];
		int [] a4 = new int[5];

		// Array Declaration with Initialisation
		int  a5[] = new int[] { 10,20,30,40,50 };
		int  a6[] = { 10,20,30,40,50 };
		
		
//		int a[] = new int[5];// a[0],a[1],a[2],a[3],a[4]
		
		System.out.println("a ==> " + a1);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a.length : " + a1.length);// .length ==>operator--get size of Array. 
		
		int sum = 0;
		
		for (int i = 0; i < a1.length; i++) 
		{
			System.out.println("Enter A["+i+"] : ");
			a1[i] = sc.nextInt();
		}
		for (int i = (a1.length-1); i >=0 ; i--) 
		{
			sum = sum + a1[i];
			System.out.println("A["+i+"] : " + a1[i]);
		}	
		System.out.println("Sum of Array : " + sum);
	}
}
