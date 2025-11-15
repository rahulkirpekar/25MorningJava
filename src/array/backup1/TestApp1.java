package array.backup1;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		int a[] = new int[5];// a[0],a[1],a[2],a[3],a[4]
/*		
 	 	Array Declaration
		----------------------
		int a[] = new int[5];// a[0],a[1],a[2],a[3],a[4]
		int []a = new int[5];// a[0],a[1],a[2],a[3],a[4]
		int[] a = new int[5];// a[0],a[1],a[2],a[3],a[4]
		int [] a = new int[5];// a[0],a[1],a[2],a[3],a[4]
*/		
// 	 	Array Declaration With Initialisation
//		-------------------------------------
//		int a1[] = {10,20,30,40,50};
//		int a1[] = new int[]{10,20,30,40,50};
		
		System.out.println("a.length : " + a.length);
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter A["+ i +"] : ");
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			sum = sum + a[i];
			System.out.println("A["+ i +"] : " + a[i]);
		}
		
		System.out.println("Sum : "+sum);
	}
}
