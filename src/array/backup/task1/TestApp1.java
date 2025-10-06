package array.backup.task1;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
//		int a[] = new int[5];// a[0],a[1],a[2],a[3],a[4]

		// new--JVM---object
		
		float a[] = new float[5];// a[0],a[1],a[2],a[3],a[4]
	
		System.out.println("a object : " + a);

		float sum = 0;
		
		System.out.println("a.length : " + a.length);
	
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("Enter A["+ i +"] : ");
			a[i] = sc.nextFloat();//a[0],a[1],a[2],a[3],a[4]
		}
		for (int i = 0; i < 5; i++) 
		{
			sum = sum + a[i];
			System.out.println("A["+ i +"] : " + a[i]);
		}
		System.out.println("Sum of Array : " + sum);
	}
}
