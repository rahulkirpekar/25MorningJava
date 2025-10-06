package array.backup.task1;

import java.util.Iterator;
import java.util.Scanner;

public class TestApp3 
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
		
		System.out.println("Enter Search Value : ");
		int searchValue = sc.nextInt();
	
		boolean flag= true;
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i] == searchValue) 
			{
				flag= false;
				System.out.println("A["+i+"] : " + a[i]);
			}
		} 
		if (flag) 
		{
			System.out.println(searchValue+" is not Found in Array");
		} 		
	}
}
