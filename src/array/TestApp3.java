package array;

import java.util.Scanner;

// no = 123 = 1+2+3 = 6
// no = 123 = 1*2*3 = 6   // 123-TWIN



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
		
		for (int i = 0; i < a.length; i++) 
		{
			int no = a[i];
			int rev = 0;
			
			while(no > 0) 
			{
				int temp = no % 10;
				rev = (rev * 10) + temp;
				no  = no / 10;
			}
			if(rev == a[i]) 
			{
				System.out.println("a["+i+"] : "+a[i]);
			}
		}
	}
}
