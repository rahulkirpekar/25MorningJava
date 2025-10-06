package basic;

import java.util.Scanner;

public class TestApp13 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No : ");
		int no = sc.nextInt();
		
		for (int i = 1; i <=10; i++) 
		{
			System.out.println(no + " * " + i +" = " + (no*i));
		}
	}
}
