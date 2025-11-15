package array.backup1;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a1[][] = new int[3][5];
/*
 * 		2'd Array Declaration
        ---------------------------
		int a[][] = new int[3][5];  
		int [][]a = new int[3][5];
		int[][] a = new int[3][5];
		int [][] a = new int[3][5];
		int []a[] = new int[3][5];

 * 		2'd Array Declaration With Initialisation
        -------------------------------------------
		int a[][] = {{10,20,30,40,50},{10,20,30,40,50},{10,20,30,40,50}};
		int a[][] = new int[][]
						{
							{10,20,30,40,50},
							{10,20,30,40,50},
							{10,20,30,40,50}
						};
 */		
		int a[][] = new int[][]{{10,20,30,40,50},{10,20,30,40,50},{10,20,30,40,50}};
		
		System.out.println(a[0].length);// First Student---5 subjects 
		System.out.println(a[1].length);// Second Student---5 subjects 
		System.out.println(a[2].length);// Third Student---5 subjects 
		
		// Student count----3
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.println("Enter A["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.println("A["+i+"]["+j+"] : " + a[i][j]);
			}
		}
	}
}