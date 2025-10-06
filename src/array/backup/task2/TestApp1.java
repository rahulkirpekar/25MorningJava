package array.backup.task2;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// Array Declaration
		int a[][] = new int[2][3];
//		int []a[] = new int[2][3];
//		int[][] a = new int[2][3];
//		int [][]a = new int[2][3];

		
		System.out.println(a.length);// Student--2 sem
		System.out.println(a[0].length);// SEM---1---Subjects : 3
		System.out.println(a[1].length);// SEM---2---Subjects : 3

		// i ---Student
		for (int i = 0; i < a.length; i++) 
		{
			// j---Subjects
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.println("Enter A["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt();
			}
		}
		// i ---Student
		for (int i = 0; i < a.length; i++) 
		{
			// j---Subjects
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.println("A["+i+"]["+j+"] : " + a[i][j]);
			}
		}
	}
}