package array;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a1[]=  new int[5];
		
		for (int i = 0; i < a1.length; i++) 
		{
			System.out.println("Enter A["+i+"] : ");
			a1[i] = sc.nextInt();
		}
		
		for (int i = 0; i < a1.length; i++) 
		{
			int no = a1[i];//a[0],a[1],a[2],a[3],a[4]
			
			int fc = 0;
			
			for (int j = 1; j <=no ; j++) 
			{
				if(no % j == 0) 
				{
					fc++;
				}
			}
			if(fc == 2) 
			{
				System.out.println("A["+i+"] : " + a1[i]);
			}
		}
	}
}
