package basic;

import java.util.Scanner;

public class TestApp16 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No : ");
		int no = sc.nextInt();

		int i=1;
		
		while(i<=10) 
		{
			System.out.println(no+" * " + i +" = " + (no*i));
			i++;
		}
	}
}