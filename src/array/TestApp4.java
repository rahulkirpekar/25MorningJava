package array;

import java.util.Scanner;

public class TestApp4 
{
	public static void main(String[] args) 
	{
		// 2'D Array Declaration
		//------------------------
//		int a[][] = new int[5][3];// 5 * 3 = 15 variables
		
//		int [][]a = new int[5][3];// 5 * 3 = 15 variables

//		int[][] a = new int[5][3];// 5 * 3 = 15 variables

//		int[]a[]  = new int[5][3];// 5 * 3 = 15 variables

//		int [][]a  = new int[5][3];// 5 * 3 = 15 variables

		//Jagged Array
		//--------------
		int a[][] = new int[3][] ;
		
		a[0] = new int[]{10,20,30};
		a[1] = new int[]{10,20,30,40};
		a[2] = new int[]{10,20,30,40,50};
		
		// Declaration With Initialisation
		//---------------------------------
//		int a[][] = {{10,20,30},{40,50,60}};
		
//		int a[][] = new int[][] {{10,20,30},{40,50,60}};
	
//		int a[][] = new int[][]{{10,20},{40,50,60},{70,80,90}};
		
		
//	      i  j
//		a[0][0]
//		a[0][1]
//		a[0][2]
//---------------		
//		a[1][0]
//		a[1][1]
//		a[1][2]
//---------------	
		Scanner sc = new Scanner(System.in);
		
		// a.length -- 5 student
		// a[i].length --3 subjects
//		for (int i = 0; i < a.length; i++) 
//		{
//			for (int j = 0; j < a[i].length; j++) 
//			{
//				System.out.println("Enter A["+i+"]["+j+"] : ");
//				a[i][j] = sc.nextInt();
//			}
//		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				System.out.println("A["+i+"]["+j+"] : " + a[i][j]);
			}
		}
	}
}